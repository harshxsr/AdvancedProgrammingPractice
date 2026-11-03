"""Question 2: UDP client/server for sensor temperature readings.

Run the server in one terminal:
    python3 Tutorial11_Q2_UDP_Temperature_Monitor.py server
Run a client (one per sensor, if desired) in another terminal:
    python3 Tutorial11_Q2_UDP_Temperature_Monitor.py client

UDP suits this monitoring task when readings are frequent and current values
matter more than retransmitting an occasional lost sample. It has no connection
setup and low overhead, so many sensors can report quickly. TCP is preferable
when every reading must be delivered reliably and in order.
"""
import socket
import sys

HOST = "127.0.0.1"
PORT = 50012


def run_server():
    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server:
        server.bind((HOST, PORT))
        print(f"Temperature server listening on {HOST}:{PORT}")
        try:
            while True:
                data, address = server.recvfrom(1024)
                reading = data.decode("utf-8", errors="replace").strip()
                print(f"Reading from {address}: {reading}")
        except KeyboardInterrupt:
            print("\nServer stopped.")


def run_client():
    sensor_id = input("Sensor ID: ").strip() or "sensor"
    raw_temperature = input("Temperature (°C): ").strip()
    try:
        temperature = float(raw_temperature)
    except ValueError:
        print("Please enter a numeric temperature.")
        return
    message = f"{sensor_id}: {temperature:.2f} °C"
    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as client:
        client.sendto(message.encode("utf-8"), (HOST, PORT))
    print("Reading sent.")


if __name__ == "__main__":
    if len(sys.argv) != 2 or sys.argv[1].lower() not in {"server", "client"}:
        raise SystemExit("Usage: python3 Tutorial11_Q2_UDP_Temperature_Monitor.py [server|client]")
    (run_server if sys.argv[1].lower() == "server" else run_client)()

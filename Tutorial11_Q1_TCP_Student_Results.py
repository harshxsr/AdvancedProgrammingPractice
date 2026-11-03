"""Question 1: TCP client/server for student examination results.

Run the server in one terminal:
    python3 Tutorial11_Q1_TCP_Student_Results.py server
Run the client in another terminal:
    python3 Tutorial11_Q1_TCP_Student_Results.py client
"""
import socket
import sys

HOST = "127.0.0.1"
PORT = 50011

# Example records; replace or extend these with the college's result data.
RESULTS = {
    "2026001": "Pass - GPA: 8.4",
    "2026002": "Pass - GPA: 9.1",
    "2026003": "Needs re-evaluation",
}


def run_server():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
        server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        server.bind((HOST, PORT))
        server.listen()
        print(f"Result server listening on {HOST}:{PORT}")
        while True:
            connection, address = server.accept()
            with connection:
                print(f"Connected by {address}")
                register_number = connection.recv(1024).decode("utf-8").strip()
                result = RESULTS.get(register_number, "No result found for that register number.")
                connection.sendall(result.encode("utf-8"))


def run_client():
    register_number = input("Enter your register number: ").strip()
    if not register_number:
        print("Register number cannot be empty.")
        return
    with socket.create_connection((HOST, PORT), timeout=10) as client:
        client.sendall(register_number.encode("utf-8"))
        result = client.recv(4096).decode("utf-8")
    print(f"Examination result: {result}")


if __name__ == "__main__":
    if len(sys.argv) != 2 or sys.argv[1].lower() not in {"server", "client"}:
        raise SystemExit("Usage: python3 Tutorial11_Q1_TCP_Student_Results.py [server|client]")
    (run_server if sys.argv[1].lower() == "server" else run_client)()

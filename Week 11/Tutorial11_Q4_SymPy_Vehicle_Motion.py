"""Question 4: analyze vehicle motion symbolically with SymPy."""
import sympy as sp


def read_time(prompt):
    """Read an integer or rational time so SymPy keeps exact values."""
    while True:
        value = input(prompt).strip()
        try:
            return sp.Rational(value)
        except (ValueError, ZeroDivisionError):
            print("Enter a valid number, such as 2, 3/2, or -1.")


t = sp.symbols("t", real=True)
displacement = t**3 - 6 * t**2 + 9 * t + 5
velocity = sp.diff(displacement, t)
acceleration = sp.diff(velocity, t)
rest_times = sp.solve(sp.Eq(velocity, 0), t)

print(f"Displacement s(t): {displacement}")
print(f"Velocity v(t) = ds/dt: {velocity}")
print(f"Acceleration a(t) = dv/dt: {acceleration}")
print(f"The vehicle is momentarily at rest at t = {rest_times}")

start = read_time("Interval start time: ")
end = read_time("Interval end time: ")
if end < start:
    print("The end time is earlier than the start time; reversing the interval.")
    start, end = end, start
net_displacement = sp.integrate(velocity, (t, start, end))
print(f"Net displacement from t={start} to t={end}: {net_displacement}")
print(f"Numerical value: {sp.N(net_displacement)}")

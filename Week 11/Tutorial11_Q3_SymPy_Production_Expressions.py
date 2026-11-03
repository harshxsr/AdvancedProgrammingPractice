"""Question 3: expand, factor, simplify, and solve production expressions."""
import sympy as sp

x, y, q = sp.symbols("x y q")

# Example algebraic expressions used in a cost calculation.
expression = (x + 2 * y) ** 2
expanded = sp.expand(expression)
factored = sp.factor(expanded)
simplified = sp.simplify((x**2 - 9) / (x - 3))

print(f"Original expression: {expression}")
print(f"Expanded expression: {expanded}")
print(f"Factored expression: {factored}")
print(f"Simplified expression: {simplified}")

# Example cost constraint: q^2 - 100q + 2400 = 0.
# The two roots are possible production quantities for this illustrative model.
equation = sp.Eq(q**2 - 100 * q + 2400, 0)
solutions = sp.solve(equation, q)
print(f"Production equation: {equation}")
print(f"Possible production quantities: {solutions}")

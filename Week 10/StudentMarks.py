from functools import reduce

students = {"Arun":45, "Bala":60, "Charan":75, "Divya":50}

passed = list(filter(lambda x: x[1] >= 50, students.items()))

marks = list(map(lambda x: min(x + 5, 100), students.values()))

total = reduce(lambda x, y: x + y, marks)

print("Passed:", passed)
print("Marks:", marks)
print("Total:", total)
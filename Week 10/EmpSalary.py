from functools import reduce

salaries = [35000, 45000, 30000, 50000, 38000]

revised = list(map(lambda x: x * 1.1 if x < 40000 else x, salaries))

eligible = list(filter(lambda x: x < 40000, salaries))

total = reduce(lambda x, y: x + y, revised)

print("Revised:", revised)
print("Eligible:", eligible)
print("Total:", total)
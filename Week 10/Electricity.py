from functools import reduce

units = [8, 12, 15, 7, 20]

exceeded = list(filter(lambda x: x > 10, units))

cost = list(map(lambda x: x * 6, units))

total = reduce(lambda x, y: x + y, units)

def bill(units):
    return units * 6

print("Above 10:", exceeded)
print("Daily Cost:", cost)
print("Total Units:", total)
print("Bill:", bill(total))
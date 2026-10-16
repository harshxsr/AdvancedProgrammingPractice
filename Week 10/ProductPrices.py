def discount(price):
    if price > 1000:
        return price * 0.8
    return price

prices = [500, 1200, 1500, 800, 2000]

discounted = list(map(discount, prices))

eligible = list(filter(lambda x: x > 1000, prices))

print("Discounted:", discounted)
print("Eligible:", eligible)
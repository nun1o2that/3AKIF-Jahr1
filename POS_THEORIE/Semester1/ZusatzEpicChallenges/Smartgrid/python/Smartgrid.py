import random

counter = 0
prices = []

# for how many minutes does the price get documented?
n = random.randrange (10, 31) # 10-30

print("\n" + "n: " + str(n) + "\n")

# generate random numbers between 1000-8000 (inclusive) and fill the array with them
while counter < n:
     zahl = random.randrange(1000, 8001) # 1000-8000
     prices.append(zahl)
     counter += 1

# output all the prices with the corresponding ID (= minute)
for i in prices:
     print("ID: " + str(prices.index(i)), end = "")
     if prices.index(i) < 10:
          print(" ", end = "")
     print(" Price: " + str(i))

# cycle through the array and pick out the lowest price, together with its ID
counter = 0;
for i in prices:
     if counter == 0:
          minPrice = i
          minPriceId = prices.index(i)
          counter += 1

     if i < minPrice:
          minPrice = i
          minPriceId = prices.index(i)

# output of results
print("\n" + "minPriceId: " + str(minPriceId))
print("minPrice: " + str(minPrice))
print("The lowest price is " + str(minPrice) + ", occuring at minute " + str(minPriceId) + ".")
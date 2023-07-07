import random

counter = 0
array = []
zahl = 0

while counter < 5:
     zahl = random.randrange(0,5)
     if zahl not in array:
          array.append(zahl)
          counter += 1

for i in array:
     print(i, end = "")
print("\n")

array.clear()

n = random.randrange(0, 10)
counter = 0

print("n: " + str(n))
while counter < n:
     zahl = random.randrange(0, n) # von 0 bis n-1
     if zahl not in array:
          array.append(zahl)
          counter += 1

for i in array:
     print(i)
import time

zaehler = 0
biney = "0b"

while True:
    while zaehler <= 9:
        output = bin(zaehler)[2:]
        if zaehler < 2:
            print(biney + "000" + output, end=" ")
        if zaehler == 2 or zaehler == 3:
            print(biney + "00" + output, end=" ")
        if zaehler >= 4 and zaehler <= 7:
            print(biney + "0" + output, end=" ")
        if zaehler == 8 or zaehler == 9:
            print(biney + output, end=" ")
        print(zaehler)
        zaehler += 1
        time.sleep(0.5)
    zaehler = 0
    print("------")
    
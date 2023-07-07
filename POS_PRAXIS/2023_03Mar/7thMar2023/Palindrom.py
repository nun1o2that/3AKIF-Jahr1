import re   # regex hihi huhu


def menue():
    print("---------------------------------------")
    print("  1 - Eingabe")
    print("  2 - Ausgabe gespeicherte Palindrome")
    print("  X - Beenden")
    print("---------------------------------------")


def eingabeMenue():
    while True:
        print("Welche Option? ", end = "")
        user = input() # convert 2 lowercase

        if not re.search("[12xX]", user):
            print("Falsche Eingabe! Nocheinmal versuchen!")

        else:
            return user


def ueberpruefung(pruef):
    length = len(pruef) - 1
    umgekehrt = ""

    while length >= 0:
        umgekehrt += pruef[length]
        length -= 1 

    print()
    if pruef == umgekehrt:
        print("Wort ist ein Palindrom! Zur Liste hinzugefuegt.")
        palindrome.append(pruef)
    else:
        print("Wort ist kein Palindrom!")
    print()


def ausgabe():
    print("\n" + "+++++++++++++++++++++++++++++++++++++++")
    for i in palindrome:
        print(i)
    print("+++++++++++++++++++++++++++++++++++++++" + "\n")


# programmée
palindrome = []    # empty array (or more accurately, list)

print("\n" + "Willkommen!" + "\n")

while True:
    menue()
    user = eingabeMenue()

    if user == "1":
        print("\n" + "Wort eingeben: ", end = "")
        user = input().lower()
        ueberpruefung(user)
    elif user == "2":
        ausgabe()
    elif re.search("[xX]", user):
        break
    
print("\n" + "ByeBye!")
    
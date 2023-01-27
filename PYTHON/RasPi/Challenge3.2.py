import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(19, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LEDs von oben nach unten

# most valuable bit
GPIO.setup(18, GPIO.OUT)

GPIO.setup(23, GPIO.OUT)

GPIO.setup(12, GPIO.OUT)

# least valuable bit
GPIO.setup(16, GPIO.OUT)

def zustand0():
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, False)
    GPIO.output(16, False)
    
def zustand1():
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, False)
    GPIO.output(16, True)

def zustand2():
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, True)
    GPIO.output(16, False)

def zustand3():
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, True)
    GPIO.output(16, True)

def zustand4():
    GPIO.output(18, False)
    GPIO.output(23, True)
    GPIO.output(12, False)
    GPIO.output(16, False)

def zustand5():
    GPIO.output(18, False)
    GPIO.output(23, True)
    GPIO.output(12, False)
    GPIO.output(16, True)

def zustand6():
    GPIO.output(18, False)
    GPIO.output(23, True)
    GPIO.output(12, True)
    GPIO.output(16, False)

def zustand7():
    GPIO.output(18, False)
    GPIO.output(23, True)
    GPIO.output(12, True)
    GPIO.output(16, True)

def zustand8():
    GPIO.output(18, True)
    GPIO.output(23, False)
    GPIO.output(12, False)
    GPIO.output(16, False)

def zustand9():
    GPIO.output(18, True)
    GPIO.output(23, False)
    GPIO.output(12, False)
    GPIO.output(16, True)
    
def konsolenOutput():
    global zaehler
    output = bin(zaehler)[2:]
    if zaehler < 2:
        print(binaer + "000" + output, end=" ")
    if zaehler == 2 or zaehler == 3:
        print(binaer + "00" + output, end=" ")
    if zaehler >= 4 and zaehler <= 7:
        print(binaer + "0" + output, end=" ")
    if zaehler == 8 or zaehler == 9:
        print(binaer + output, end=" ")
    print(zaehler)
    
    if user == 1 and zaehler == 9:
        zaehler = -1
    if user == 2:
        zaehler += 1

print("Welche Option?")
print("1 - Zaehlen auf Knopfdruck")
print("2 - automatisch zaehlen")
user = int(input())
print("")

zaehler = 0
binaer = "0b"

if user == 1:
    while True:
        if GPIO.input(19) == False:
            time.sleep(0.2)
            zaehler += 1

            if zaehler % 10 == 0:
                zustand0()
            elif zaehler % 10 == 1:
                zustand1()
            elif zaehler % 10 == 2:
                zustand2()
            elif zaehler % 10 == 3:
                zustand3()
            elif zaehler % 10 == 4:
                zustand4()
            elif zaehler % 10 == 5:
                zustand5()
            elif zaehler % 10 == 6:
                zustand6()
            elif zaehler % 10 == 7:
                zustand7()
            elif zaehler % 10 == 8:
                zustand8()
            elif zaehler % 10 == 9:
                zustand9()
                
            konsolenOutput()
                
if user == 2:
    while True:
        zustand0()
        konsolenOutput()
        time.sleep(1)
        
        zustand1()
        konsolenOutput()
        time.sleep(1)
        
        zustand2()
        konsolenOutput()
        time.sleep(1)
        
        zustand3()
        konsolenOutput()
        time.sleep(1)
        
        zustand4()
        konsolenOutput()
        time.sleep(1)
        
        zustand5()
        konsolenOutput()
        time.sleep(1)
        
        zustand6()
        konsolenOutput()
        time.sleep(1)
        
        zustand7()
        konsolenOutput()
        time.sleep(1)
        
        zustand8()
        konsolenOutput()
        time.sleep(1)
        
        zustand9()
        konsolenOutput()
        time.sleep(1)
        
        zaehler = 0
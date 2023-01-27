import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(16, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LED Rot
GPIO.setup(12, GPIO.OUT)

# LED Gelb
GPIO.setup(18, GPIO.OUT)


print("Welche Option?")
print("1 - schnell blinken")
print("2 - langsam blinken")
print("3 - Farbenwechsel auf Knopfdruck")
user = int(input())
zaehler = 1
blinker = 0

if user == 1:
    blinker = 0.1
elif user == 2:
    blinker = 1
elif user == 3:
    zaehler = 1
    
if user == 1 or user == 2:    
    while True:
        GPIO.output(12, True)
        GPIO.output(18, False)
        time.sleep(blinker)
        
        GPIO.output(12, False)
        GPIO.output(18, True)
        time.sleep(blinker)
        
elif user == 3:
    while True:
        if GPIO.input(16) == False:
            time.sleep(0.2)
            # ein Knopfdruck ist etwa so lang
            # ohne die sleep Anweisung wird der zaehler bei Knopfdruck sehr schnell erhoeht
            # es sieht dann so aus, als wuerde die LED bei Knopfdruck blinken
            # in meinem Fall blinkt die LED jede 0.2 Sekunden an und aus, was beim schnellen Druecken aber wie ein Switch funktioniert
            zaehler += 1
             
        if zaehler % 2 == 0:
            GPIO.output(12, True)
            GPIO.output(18, False)
        else:
            GPIO.output(12, False)
            GPIO.output(18, True)
    
    

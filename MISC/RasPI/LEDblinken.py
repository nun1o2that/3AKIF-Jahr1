import RPi.GPIO as GPIO
from time import sleep

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

print("Wie oft soll die LED blinken?")
maxBlinker = int(input())
zaehler = 0

# LED ist bei Pin 21 eingesteckt, bei diesem gibt es keinen Output
GPIO.setup(21, GPIO.OUT)

while zaehler < maxBlinker:
    GPIO.output(21, True) # LED leuchtet
    print("LED ON")
    sleep(0.2) # mach das 0.2 Sekunden lang (LED ausgeschaltet lassen)

    GPIO.output(21, False) # LED aus
    print("LED OFF")
    sleep(0.2) # mach das 0.2 Sekunden lang (LED ausgeschaltet lassen)

    print("")
    zaehler += 1

print("Das Laempchen hat " + str(zaehler) + " mal geblinkt")
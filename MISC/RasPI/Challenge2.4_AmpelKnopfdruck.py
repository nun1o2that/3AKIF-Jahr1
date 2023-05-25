import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(19, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LED Rot
GPIO.setup(18, GPIO.OUT)

# LED Gelb
GPIO.setup(23, GPIO.OUT)

# LED Gruen
GPIO.setup(12, GPIO.OUT)

zaehler = 0
while True:
    if GPIO.input(19) == False:
        time.sleep(0.3)
        zaehler += 1
        print(zaehler)
    
    # Rotphase
    if zaehler % 5 == 0:
        GPIO.output(18, True)
        GPIO.output(23, False)
        GPIO.output(12, False)

    # Rot-Gelb-Phase
    if zaehler % 5 == 1:
        GPIO.output(18, True)
        GPIO.output(23, True)
        GPIO.output(12, False)

    # Gruen-Phase
    if zaehler % 5 == 2:
        GPIO.output(18, False)
        GPIO.output(23, False)
        GPIO.output(12, True)

    # Gruen-Blinkend (jeweils 1 Sekunde lang)
    if zaehler % 5 == 3:
        GPIO.output(18, False)
        GPIO.output(23, False)
        GPIO.output(12, False)
        time.sleep(1)
        GPIO.output(18, False)
        GPIO.output(23, False)
        GPIO.output(12, True)
        time.sleep(1)
        # der einzige Nachteil hier, ist das sleep() das Programm anhaelt und man den Knopfdruck nicht einlesen kann
        # das Wechsel auf die Gelb-Phase braucht deshalb ein paar Versuche (richtiges Timing)

    # Gelb-Phase
    if zaehler % 5 == 4:
        GPIO.output(18, False)
        GPIO.output(23, True)
        GPIO.output(12, False)




import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# LED Rot
GPIO.setup(18, GPIO.OUT)

# LED Gelb
GPIO.setup(23, GPIO.OUT)

# LED Gruen
GPIO.setup(12, GPIO.OUT)

while True:
    # Rotphase (5 Sekunden)
    GPIO.output(18, True)
    GPIO.output(23, False)
    GPIO.output(12, False)
    time.sleep(5)

    # Rot-Gelb-Phase (3 Sekunden)
    GPIO.output(18, True)
    GPIO.output(23, True)
    GPIO.output(12, False)
    time.sleep(3)

    # Gruen-Phase (5 Sekunden)
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, True)
    time.sleep(5)

    # Gruen-Blinkend (4-mal blinken, jeweils 1 Sek)
    zaehler = 0
    while zaehler < 4:
        GPIO.output(18, False)
        GPIO.output(23, False)
        GPIO.output(12, False)
        time.sleep(1)
        GPIO.output(18, False)
        GPIO.output(23, False)
        GPIO.output(12, True)
        time.sleep(1)
        zaehler += 1

    # Gelb-Phase (3 Sekunden)
    GPIO.output(18, False)
    GPIO.output(23, False)
    GPIO.output(12, True)
    time.sleep(3)

    GPIO.output(12, False)
    print("Durchlauf vorbei")


import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(19, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LED
GPIO.setup(12, GPIO.OUT)


while True:
    if GPIO.input(19) == False:
        GPIO.output(12, True)
    else:
        GPIO.output(12, False)
        
# mit time.sleep(zeitinsekunden) geht das Licht (beim Halten des Knopfes!) spaeter an.

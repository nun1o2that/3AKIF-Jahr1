import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(16, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LED
GPIO.setup(12, GPIO.OUT)


while True:
    if GPIO.input(16) == False:
        GPIO.output(12, True)
        time.sleep(3)
        GPIO.output(12, False)

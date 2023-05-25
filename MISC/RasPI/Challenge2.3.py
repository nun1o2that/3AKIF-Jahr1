import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

# Knopf
GPIO.setup(16, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# LED
GPIO.setup(12, GPIO.OUT)

zaehler = 1
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
    else:
        GPIO.output(12, False)

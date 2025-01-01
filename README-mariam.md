#RUN3
 

Photos of attachment:
![attachment](
----

BOM List:
-----

Code:
----
```python
def RUN3():
    gyro(True)
    turn(70)
    move(635, 700, 600)
    turn(-26)
    move(140, 700, 600)
    Attachments.A3.trident_open(-900)
    move(-15, 700, 600)
    Attachments.A3.trident_open(700)
    move(-150, 700, 600)
    turn(46)
class A3:
        def trident_open(angle):
            back_motor.run_angle(800, angle)
''' 
-----

Performance Video:
![video](

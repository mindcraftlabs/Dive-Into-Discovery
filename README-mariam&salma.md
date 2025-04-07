

# RUN 4:

 Description:
----
A multifunctional robot attachment designed to handle multiple missions efficiently. It transports the shark (M02) to its target area, removes the reef segments (M03), handles and removes both trident parts (M14)

 Photos of attachement:
----

 BOM List:
----

Developing of mechanisms:
----

 Code:
----

```python
def RUN4():
    gyro(True)
    move(-150, 400, 250)
    move(230, 500, 400)
    turn(75)
    move(-610, 600, 500)
    turn(-29)
    gyro(False)
    move(-180,500, 350)
    gyro(True)
    Attachments.A4.trident_open(-4050)
    move(-20,500, 350)
    Attachments.A4.trident_open(4150)
    move(130, 700, 600)
    turn(46)
    move(-800, 700, 600)
    turn(30)
    gyro(False)
    move(-400, 700, 600)
class A4:
        def trident_open(angle):
            back_motor.run_angle(800, angle)





``` 
----


Performance video:
----

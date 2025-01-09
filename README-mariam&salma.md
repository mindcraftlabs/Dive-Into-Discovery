

# RUN 4:

 description:
----

 photos of attachement:
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
``` 
----


Performance video:
----

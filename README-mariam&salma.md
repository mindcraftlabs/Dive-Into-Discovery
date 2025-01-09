

# RUN 4:

 description:
----
A multifunctional robot attachment designed to handle multiple missions efficiently. It transports the shark (M02) to its target area, removes the reef segments (M03), handles and removes both trident parts (M14
 photos of attachement:


 BOM List:
----

Developing of mechanisms:
----

 Code:
----

```python
def RUN4():
    gyro(True)
    move(200, 400, 250)
    move(-270, 500, 400)
    turn(70)
    move(655, 600, 500)
    turn(-25)
    gyro(False)
    move(75,500, 350)
    gyro(True)
    Attachments.A4.trident_open(-4050)
    Attachments.A4.trident_open(4150)
    move(-120, 700, 600)
    turn(45),
    move(1250, 700, 600)






``` 
----


Performance video:
----

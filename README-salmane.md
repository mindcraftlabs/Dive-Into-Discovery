# RUN 1:

1) Description:

----

2) Photos of attachment:

3) BOM List:

4) Developing of mechanisms:

5) Code:

```python
def RUN1():
    gyro(True)
    move(500, 800, 650)
    move(-275, 700, 500)
    run_task(Attachments.A1.multitask1())
    move(325, 700, 600)
    turn(15) 
    move(80, 700, 600)
    Attachments.A1.arm_open(-500)
    move(-225, 700, 600) 
    turn(30)
    move(40, 700, 600) 
    Attachments.A1.arm_open(420)
    turn(30)
    Attachments.A1.arm_open(-420)
    move(-80, 400, 300)
    turn(-28)
    run_task(Attachments.A1.multitask2())
    Attachments.A1.arm_open(-385)
    move(-50, 700, 600)
    turn(-60)
    move(-500, 700, 600)
    turn(90)
    
    Attachments.A1.arm_open(600)
    wait(1000)

    turn(-145)
    move(550, 700, 600)
    Attachments.A1.arm_open(-250)
    turn(30)
    move(500)
    Attachments.A1.arm_open(300)
    # turn(30)
    move(-400)
    turn(-10)
    move(400)

    turn(45)
    move(30)

    move(-45)
    turn(-90)
```


6) Performance Video:

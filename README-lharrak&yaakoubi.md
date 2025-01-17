# RUN 5:

1) Description: This custom-built attachment is designed specifically for the FLL Submerged 2025 challenge. It efficiently handles the Mission 11 and the Mission 12 tasks during the fifth run of the game. With its precise mechanics and robust design, the attachment ensures smooth execution, helping the robot achieve accuracy and consistency in both missions.

----

2) Photos of attachment:
----

3) BOM List:
![Bom List A2](https://github.com/mindcraftlabs/Dive-Into-Discovery/blob/main/images/Bom%20List%20A5.png)
----

4) Developing of mechanisms:
----

5) Code:

```python
gyro(True)
    move(190, 700, 600)
    turn(-25)
    move(530, 700, 600)
    turn(45)
    move(65, 700, 600)
    turn(25)
    move(180, 700, 600)
    Attachments.A5.krill_open(-700)
    wait(1000)
    Attachments.A5.krill_open(800)
    move(-135, 700, 600)
    turn(45)
    move(-163, 700, 600)
    Attachments.A5.green_open(2750)
    Attachments.A5.green_open(-800)
    turn(65)
    move(900, 700, 600)
```
----


6) Performance Video:

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
    turn(27)
    move(-548, 700, 500) 
    turn(63)
    move(225, 300, 100) 
    run_task(Attachments.A2.multitask1())
    move(-230, 700, 600) 
    turn(-60)
    gyro(False)
    move(600, 700, 600) 
```
----


6) Performance Video:

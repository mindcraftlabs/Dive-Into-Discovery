# RUN 2:

1) Description:
This custom-built attachment is designed specifically for the FLL Submerged 2025 challenge. It efficiently handles the Treasure (Mission 2) and the Scuba Diver (Mission 4) tasks during the second run of the game. With its precise mechanics and robust design, the attachment ensures smooth execution, helping the robot achieve accuracy and consistency in both missions.
----

2) Photos of attachment:
----

3) BOM List:
   
![attachment](https://github.com/mindcraftlabs/Dive-Into-Discovery/blob/fdbdce570765d9fb3e1ccabbd1588ddb8f390700/images/attachment%20samadi%20and%20ghacha.png)

----

4) Developing of mechanisms:
----

5) Code:

```python
def RUN2():
    gyro(True)
    run_task(Attachments.A2.multitask1())
    turn(30)
    move(400, 700, 600)
    turn(60)
    move(210, 800, 700)
    move(-140, 700, 600)
    turn(115)
    move(-160, 700, 600)
    turn(-26)
    move(-130, 900, 800)
    Attachments.A2.diver_open(1150)
    move(100, 700, 600)
    turn(30)
    move(640, 900, 800)
    turn(-120)
```
----


6) Performance Video:

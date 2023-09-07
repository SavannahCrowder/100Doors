# 100 Doors

There are 100 doors in a row that are all initially closed.

You make several passes by all of the doors.

The first pass through, you visit every door and  toggle  the door  (if the door is closed,  open it;   if it is open,  close it).

The second pass, you only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.

The third pass, you visit every 3rd door   (door #3, #6, #9, ...), etc,   until you reach the end.


# Assignment
Write a program that simulates this thought experiment. The program must use the ArrayList class to store the states of the doors after each pass.

The program should output which doors are open after the 3rd and final pass.

# Example Output

Note: The numbers in the examples are not the numbers you should expect to see as a result of the three passes. It is just an example of output formatting.

```
2 9 17 24 44 53 75 97
```

or the preferred output would be something meaningful like

```
Door 2 is open
Door 9 is open
Door 17 is open
Door 24 is open
Door 44 is open
Door 53 is open
Door 75 is open
Door 97 is open
```

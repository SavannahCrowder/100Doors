//Savannah Crowder 
//CSC 106 Computer Science II
//9-7-2023
//Jeremy Holley


//Import ArrayList class 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //ArrayList that represents the 100 doors (false for close)
        ArrayList<Boolean> doors = new ArrayList<>(100);

        // Makes all doors closed
        for (int i = 0; i < 100; i++){
            doors.add(false);
        }
        //declares variable pass and set it to 1
        int pass = 1;

        //while loop that will run as long as the number of passes is less than or equal to 3
        while (pass <= 3){
            //loop through the doors
            for (int i = pass - 1; i < 100; i += pass) {
                //if door is closed open it. If door is open close it
                doors.set(i, !doors.get(i));
            }
            //Goes to next pass
            pass++;
        }
        //Output the final results of the open doors after the last pass
        for (int i = 0; i < 100; i++){
            if (doors.get(i)) {
                System.out.println("Door " + (i + 1) + " is open");

            }
        }
    }
}


package launcher;

import java.util.Scanner;

public class MainMenu {
    //want to use a switch statement for menu options
    //the user can choose to run different coding challenges

    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        int choice; //a variable that holds the choice chosen by the user

        //impliment standard menu loop
        while (true) {
            System.out.println("Coding Challenges Menu");


            choice = scanner.nextInt(); //choice will be set to the next inputted number

            switch (choice) {


                case 0:
                    System.out.println("Exiting program. bye bye!");
                    return;
            }
        }
    }
}

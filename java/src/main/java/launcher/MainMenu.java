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
            //give a printed menu for now :)
            System.out.println("Coding Challenges Menu");
            System.out.println("1. Algorithms");
            System.out.println("2. Games"); 
            System.out.println("3. Strings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt(); //choice will be set to the next inputted number

            switch (choice) {
                case 1:
                    System.out.println("Category chosen: Algorithms");
                    break;
                case 2:
                    System.out.println("Category chosen: Games");
                    break;
                case 3:
                    System.out.println("Category chosen: Strings");
                    break;
                case 4:
                    System.out.println("Exiting program. bye bye!");
                    scanner.close(); //close the scanner when user exists
                    return;
            }
        }
    }
}

import java.util.Scanner; 

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Created scanner  object 

        String name; // Varriable to hold the name from user

        while (true) { // Infinity loop (untill validated the input)
            System.out.print("Please enter your name: "); // Sent message to user   
            name = input.nextLine(); // Reccived input from user

            // To validate the input (include number or no)
            if (name.matches("[a-zA-Z]+")) { // if only string
                break; // breake the loop
            } else {
                System.out.println("Incorrect entry, please enter only letters."); // error message
            }
        }

        // methods to modify the string
        String manipulatedName = name.toUpperCase(); // All letters are converted to uppercase
        String reversedName = new StringBuilder(manipulatedName).reverse().toString(); // Reversed
        String finalName = reversedName.substring(1) + reversedName.charAt(0);

        System.out.println("Changed name: " + finalName); // The changed name was writen on the screen
    }
}
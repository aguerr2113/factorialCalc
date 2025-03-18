// import scanner class
import java.util.Scanner;

// create java class
public class FactorialCalculator {

    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // create number variable
        int number;
        // create boolean variabl for input validation
        boolean validInput = false;

        // use while loop for user validation, while input is invalid do this
        while (!validInput) {
            // ask user for input
            System.out.println("Enter a non negative number, and we will solve the factorial of it: ");
            // if input is a integer do this
            if (sc.hasNextInt()) {
                // number var is set to user input
                number = sc.nextInt();
                
                // if number is a non negative number(greater or equal to 0) do this
                if (number >= 0) {
                    // user input is now true all checks have passed
                    validInput = true;
                    // calculate the factorial of the input and output it to the user
                    System.out.println("Factorial of " + number + " is : " +factorial(number));
                }
                else{
                    // if number is not a "non negative number" ask user for a valid input
                    System.out.println("Enter a valid number: ");
                }
            }
            else{
                // if input from user is not an integer then ask the user for a valid number
                System.out.println("Enter a valid number: ");
                // discard the invalid input
                sc.next();
            }
            
        }
        // close the scanner to prevent resource leaks
        sc.close();


    }
    // define the factorial method that takes in an integer
    public static int factorial(int n){
        // check if the int a 0 or one then do this
        if (n == 0 || n == 1) {
            // return 1 if int is 0 or 1
            return 1;
        }
        // if int is not a 0 or a 1 return the formula "n * factorial(n - 1)"
        return n * factorial(n - 1);

    }

}

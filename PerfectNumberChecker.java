
package bagyeseradrake.perfectnumberchecker;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = 0;
            
            // Part (i): Input with validation
            while (true) {
                try {
                    System.out.print("Enter a positive integer: ");
                    number = scanner.nextInt();
                    
                    if (number <= 0) {
                        System.out.println("Error: Please enter a positive integer.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input. Please enter a number.");
                    scanner.next(); // Clear invalid input
                }
            }
            
            // Part (ii): Calculate sum of proper divisors
            int sum = 0;
            StringBuilder divisors = new StringBuilder("Proper divisors: ");
            
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                    divisors.append(i).append(" "); // Append divisors to a string
                }
            }
            
            // Display the sum and divisors
            System.out.println(divisors.toString());
            System.out.println("Sum of proper divisors: " + sum);
            
            // Part (iii): Determine and display result
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}

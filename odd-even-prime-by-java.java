import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    // Method to check if a number is prime
    public static void checkPrime(int number) {
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        checkEvenOdd(number);

        // Check if the number is prime
        checkPrime(number);

        // Close the scanner
        scanner.close();
    }
}

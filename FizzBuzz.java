import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      //  Get user input
        System.out.print("Enter a number: ");
        int s = scanner.nextInt();

    // Print numbers with Fizz, Buzz, and FizzBuzz conditions
        for (int x = 0; x <= s; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }

       // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;
// The first step is to put the import for the scanner.

public class Main {
    public static void main(String[] args) throws Exception {
        // then we create a new object or scanner
        // after that we add output and integer for our new scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = myScanner.nextInt();
        // Finally, we add if statement to determine the entered year either its leap
        // year or not.
        // by using some mathmatics operations
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This isn't a leap year");

        }
        // lastly we close our task
        myScanner.close();

    }
}

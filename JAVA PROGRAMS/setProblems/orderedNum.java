package setProblems;
import java.util.Scanner;

public class orderedNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ORDERED NUMBER CHECKER");

        System.out.print("Enter a 4-digit number: ");
        int number = input.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        } else {
            int firstTwoDigits = number / 100;
            int lastTwoDigits = number % 100;

            int difference = Math.abs(firstTwoDigits - lastTwoDigits);

            if (difference == 1) {
                System.out.println(number + " is an ordered number.");
            } else {
                System.out.println(number + " is not an ordered number.");
            }
        }

        input.close();
    }
}

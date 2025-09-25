package setProblems;
import java.util.Scanner;

public class TypeofAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        if (angle < 90) {
            System.out.println("The angle is acute.");
        } else if (angle == 90) {
            System.out.println("The angle is a right angle.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("The angle is obtuse.");
        } else {
            System.out.println("Invalid angle. Please enter a value between 0 and 180 degrees.");
        }

        input.close();
    }
}

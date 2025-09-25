package setProblems;
import java.util.Scanner;

public class bmiStatus {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("BMI WEIGHT STATUS");

        System.out.print("Enter BMI: ");
        float bmiChecker = input.nextFloat();

        if (bmiChecker < 20.9){
            System.out.println("Underweight");
        }
        else if(bmiChecker >= 21.0 && bmiChecker <= 35.9){
            System.out.println("Normal");
        }
        else if(bmiChecker >= 36.0 && bmiChecker <= 45.9){
            System.out.println("overweight");
        }
        else if(bmiChecker >= 46.0) {
            System.out.println("Obese");
        }

        input.close();
    }
}

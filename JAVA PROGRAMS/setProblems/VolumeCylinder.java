package setProblems;
import java.util.Scanner;

public class VolumeCylinder {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        try{
            double areaBase = 0;
            double height = 0;
            double PI = 3.14159;
            double radius = 0;

            System.out.println("Input the Radius:");
            radius = input.nextDouble();
            System.out.println("Input the Height:");
            height = input.nextDouble();

            System.out.println("Computing for the Volume...");
            double Volume = PI * (radius*radius) * height;

            System.out.println("\n");

            System.out.println("The volume of the cylinder is " + Volume);
        }catch(Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUE IS BEING ACCEPTED IN THE PROGRAM!");
        }


    }

}

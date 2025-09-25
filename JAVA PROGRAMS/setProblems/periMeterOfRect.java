package setProblems;
import java.util.Scanner;

public class periMeterOfRect {
    public static void main(String [] args){

        Scanner input = new Scanner (System.in);

        try{
            double DimensionL = 0;
            double DimensionW = 0;

            System.out.print("\n" + "Input the Length of Rectangle: ");
            DimensionL = input.nextDouble();
            System.out.print("Input the Width of Rectangle: ");
            DimensionW = input.nextDouble();

            double perimeter = 2 * (DimensionL + DimensionW);
            System.out.println(perimeter);
        }catch(Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUE IS BEING ACCEPTED IN THE PROGRAM!");
        }

    }
}

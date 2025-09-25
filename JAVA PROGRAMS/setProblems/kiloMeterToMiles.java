package setProblems;
import java.util.Scanner;

public class kiloMeterToMiles {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        try {
            double distanceMiles = 0.6214;
            double distanceKM = 0;

            System.out.println("\n");
            System.out.print("Enter kilometers:");
            distanceKM = input.nextDouble();
            System.out.println("The output distance miles: " + (distanceKM * distanceMiles));
        }

        catch(Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUE IS BEING ACCEPTED IN THE PROGRAM!");
        }


    }

}

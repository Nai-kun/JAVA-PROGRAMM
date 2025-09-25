package setProblems;
import java.util.Scanner;

public class tempCalcu {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        try{
            float Celsius = 0;
            float Fahrenheit;
            float kelvin;

            System.out.println("Convert Celsius to Fahrenheit, Celsius to Kelvin" + "\n");
            System.out.print("Enter Temperature in Celsius:");
            Celsius = input.nextFloat();
            System.out.println("Celsius is equal to " + ((Celsius * 9/5 ) + 32) + " Celsius is equal to " + (Celsius + 273.15));
        }catch(Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUE IS BEING ACCEPTED IN THE PROGRAM!");
        }

    }
}

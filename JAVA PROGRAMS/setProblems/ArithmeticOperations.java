package setProblems;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        try{
            double ent;
            double ent2;

            System.out.println("Perform Arithmetic Operators [Addition, Subtraction, Multiplication, Division]");


            System.out.println("Enter 2 numbers:");
            ent = input.nextDouble();
            ent2 = input.nextDouble();

            double addition = ent + ent2;
            double subtraction = ent - ent2;
            double multiplication = ent * ent2;

            double division = 0;
            if(ent2 != 0){
                division = ent/ent2;
            }else{
                System.out.print("Undefined");
            }

            System.out.print("Addition: " + addition + " Subtraction: " + subtraction + " Multiplication: " + multiplication + " Division: " + division);

            input.close();

        }catch(Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUES ALLOWED");
        }

    }
}

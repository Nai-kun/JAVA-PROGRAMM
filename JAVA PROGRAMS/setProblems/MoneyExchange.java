package setProblems;
import java.util.Scanner;
public class MoneyExchange {
  public static void main (String [] args){
      Scanner input = new Scanner (System.in);

      try{
          double USD =  45.25;
          double php;

          System.out.print("Enter Peso:");
          php = input.nextDouble();
          System.out.println("PHP = " +php +  "  USD = " + (php*USD));
      }catch(Exception e){
          System.out.println("INVALID! ONLY INTEGER VALUE IS BEING ACCEPTED IN THE PROGRAM!");

      }

  }
}



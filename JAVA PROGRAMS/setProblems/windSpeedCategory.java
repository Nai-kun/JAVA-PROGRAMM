package setProblems;
import java.util.Scanner;

public class windSpeedCategory {
    public static void main (String [] Args){

        Scanner input = new Scanner (System.in);

        System.out.println("TRACKING WIND SPEED: ");
        int windSpeed = input.nextInt();

        try{
            if(windSpeed < 25){
                System.out.println("NOT A STRONG WIND");
            }
            else if(windSpeed >= 25 && windSpeed <= 38){
                System.out.println("STRONG WIND" + "\n");
            }
            else if(windSpeed >= 39 && windSpeed <= 54){
                System.out.println("GALE" + "\n");
            }
            else if(windSpeed >= 55 && windSpeed < 72){
                System.out.println("WHOLE GALE" + "\n");
            }
            else {
                System.out.println("HURRICANE" + "\n");
            }
        } catch (Exception e){
            System.out.println("INVALID! ONLY INTEGER VALUES ARE ALLOWED");
        }

    }
}

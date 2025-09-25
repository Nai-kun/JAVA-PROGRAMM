package setProblems;
import java.util.Scanner;

public class timeConverter {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.println("TIME CONVERTER");

        int hoursInSec = 3600;
        int minutesInSec = 60;

        int inputHr = 0;
        int inputMin = 0;
        int inputSec = 0;

        System.out.print("ENTER HOURS = ");
        inputHr = input.nextInt();
        System.out.print("ENTER MINUTES = ");
        inputMin = input.nextInt();
        System.out.print("ENTER SECONDS = ");
        inputSec = input.nextInt();

        int convtHrs = inputHr * hoursInSec;
        int convtMin =  inputMin * minutesInSec;
        int addSec = inputSec;

        int TotalSeconds = convtHrs + convtMin + addSec;

        System.out.println("TOTAL SECONDS IN [HOURS, MINUTES, SECONDS]" + "\n" + TotalSeconds);

    }
}

package setProblems;
import java.util.Scanner;

public class LoudnessDecibels {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        try{
            System.out.println("LOUDNESS IN DECIBELS: ");
            int loudness = input.nextInt();

            if(loudness <= 50){
                System.out.println("Quite");
            }
            else if (loudness >= 51 && loudness <= 70){
                System.out.println("Intrusive");
            }
            else if (loudness >= 71 && loudness <= 90){
                System.out.println("Annoying");
            }
            else if (loudness >= 91 && loudness < 110){
                System.out.println("Very Annoying");
            }
            else{
                System.out.println("Uncomfortable" + "\n");
            }
        }catch (Exception e){
            System.out.println("INVALID INTEGER VALUES ARE ONLY ALLOWED");
        }

    }
}

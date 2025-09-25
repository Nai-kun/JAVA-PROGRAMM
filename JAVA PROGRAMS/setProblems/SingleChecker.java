package setProblems;
import java.util.Scanner;
public class SingleChecker
{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        try{

            System.out.println("Status");
            char statChecker = Character.toLowerCase(input.next().charAt(0));
        }catch(Exception e){
            System.out.println("Invalid status! Please enter [S] for Single, [M] for Married");
        }
        System.out.println("Age");
        int ageChecker = input.nextInt();

        if(ageChecker >= 18 && ageChecker <= 26){
            System.out.println("All criteria are met.");
        }
        else{
            System.out.println("Failed to satisfy criteria");
        }



    }
}

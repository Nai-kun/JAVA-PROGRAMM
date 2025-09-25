package setProblems;
import java.util.Scanner;

public class CartesianPlane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter the x-coordinate: ");
            double x = input.nextDouble();

            System.out.print("Enter the y-coordinate: ");
            double y = input.nextDouble();

            if (x == 0 & y == 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is at the origin");
            }
            else if(x == 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on the y-axis");
            }
            else if(y == 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on the x-axis");
            }
            else if (x > 0 && y > 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on Quadrant I");
            }
            else if (x < 0 && y < 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on Quadrant III");
            }
            else if (x < 0 && y > 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on Quadrant II");
            }
            else if (x > 0 && y < 0){
                System.out.println("(" + x + ")" + "," +  "(" + y +")" + "is on Quadrant IV");
            }
        }catch(Exception e){
            System.out.println("ONLY POSITIVE AND INTEGER VALUES ARE ALLOWED");
        }


        input.close();
    }
}

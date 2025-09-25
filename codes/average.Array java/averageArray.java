import java.util.Scanner;

public class averageArray{
    public static void main (String [] args){
        Scanner type = new Scanner (System.in);
        System.out.println("Find the sum");
        int ente = type.nextInt();

        double [] ave = new double[ente];

        System.out.println("Enter the values");
        
        for (int i = 0; i < ente; i++){
            ave[i] = type.nextInt();
        }
        
        double sum = 0;
        for (int i = 0; i < ente; i++){
            sum = sum + ave[i];
        }
        double average = (sum / ente);
            System.out.println(" The average is: " + average);
        
 

    }
}
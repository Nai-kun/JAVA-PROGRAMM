import java.util.Scanner;
 public class sum{
     public static void main (String [] args){
         Scanner type = new Scanner (System.in);
         System.out.println("How many values you want to be computed?");
         int num = type.nextInt();
         
         int [] result = new int [num];
         
         for (int i = 0; i < num; i++){
             System.out.println("enter values;");
             result[i] = type.nextInt();
         }
         
         int sum = 0;
         
         for(int i = 0; i < num; i++){
             sum = sum + result[i];
         }
         
         
         System.out.println("The result is: " + sum);
     }
 }
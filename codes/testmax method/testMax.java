import java.util.Scanner;
public class testMax 
{
   public static void main (String [] args)
   {
       Scanner type = new Scanner(System.in);
       int l = type.nextInt();
       int k = type.nextInt(); 
       int u = max(l,k);
       System.out.println("Maximum of " + l + " and " + k + " is " + u);
   } 
   
   public static int max (int l, int k)
   {
       int result = 0;
       
       if (l > k)
        result = l;
       else
       result = k;
       
       return result;
   }
       
       
}
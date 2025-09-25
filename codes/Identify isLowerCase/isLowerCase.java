import java.util.Scanner;
public class isLowerCase
{
    public static void main (String [] args)
    {
        Scanner type = new Scanner(System.in);
        System.out.print("Identify if it's Lowercase: ");
        char in = type.next().charAt(0);
       
        for (int i = 0; i < 2; i++)
        {
            
         if (Character.isLowerCase(in))
        {
            System.out.println("Indeed LowerCase!!");
        }
        else
        {
          System.out.println("!ERROR!");  
        }
            
        }
        
        
    }
}
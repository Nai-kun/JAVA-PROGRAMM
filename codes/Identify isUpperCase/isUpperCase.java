import java.util.Scanner;
public class isUpperCase 
{
    public static void main (String [] args)
    {
        Scanner type = new Scanner(System.in);
        System.out.println("Identify if it's Uppercase: ");
        char on = type.next().charAt(0);
        
        if (Character.isUpperCase(on))
        {
            System.out.print("Indeed Uppercase");
        }
        else {
            System.out.print("!ERROR!");
        }
    }
}
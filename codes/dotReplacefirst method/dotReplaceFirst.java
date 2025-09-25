import java.util.Scanner;
public class dotReplaceFirst
{
    public static void main (String [] args) 
    {
        Scanner type = new Scanner (System.in);
        System.out.println("Enter String: ");
        String noi = "Ian Frederick B. Talania";
        String ang = type.nextLine();
        String nai = type.nextLine();
        System.out.println("First Replace: " + noi.replaceFirst(ang,nai));
    }
} 
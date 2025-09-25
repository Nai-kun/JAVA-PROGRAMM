import java.util.Scanner;
public class toLowerCase
{
    public static void main(String [] args)
    {
        Scanner type = new Scanner (System.in);
        System.out.print("Convert to LowerCase: ");
        char bot = type.next().charAt(0);
        
        System.out.println("  Converting to LowerCase -- " + Character.toLowerCase(bot));
    }
}
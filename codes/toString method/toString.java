import java.util.Scanner;
public class toString
{
    public static void main (String [] args)
    {
        Scanner type = new Scanner (System.in);
        System.out.println("Convert to String: ");
        char less = type.next().charAt(0);
        System.out.println("Convert to String -- " + Character.toString(less));
    }
}
import java.util.Scanner;
public class toUpperCase
{
    public static void main (String[]args)
    {
        Scanner type = new Scanner (System.in);
        System.out.print("Convert LowerCase to UpperCase: ");
        char tu = type.next().charAt(0);
        char zi = type.next().charAt(0);
        System.out.print("Convert to UpperCase: " + Character.toUpperCase(tu) + " " + Character.toUpperCase(zi));
    }
}
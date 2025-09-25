import java.util.Scanner;
public class dotlength
{
    public static void main (String [] args) 
    {
        Scanner type = new Scanner (System.in);
        System.out.println("Enter string");
        String nai = type.nextLine();
        System.out.println("the length of the string: " + nai.length());
    }
}
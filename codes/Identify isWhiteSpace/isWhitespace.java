import java.util.Scanner;
public class isWhitespace
{
    
    public static void main (String [] args)
    { 
       Scanner type = new Scanner (System.in);
       System.out.println("Include Whitespace:");
       char one = type.nextLine().charAt(0);
       System.out.println("Identify Whitespace: " + one + Character.isWhitespace(one));
       System.out.println("Include whitespace: ");
       char two = type.nextLine().charAt(0);
       System.out.println("Identify Whitespace: " + two +" "+ Character.isWhitespace(two));
       
       
    }
    
}
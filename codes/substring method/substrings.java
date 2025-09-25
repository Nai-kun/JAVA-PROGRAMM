import java.util.Scanner;
public class substrings 
{
    public static void main (String[] args)
    {
	    Scanner type = new Scanner(System.in);
	    System.out.print("Enter: ");
	    String  s = ("IanFrederick");
	    String name  = s.substring(0);
	    System.out.println("Count name: " + name);
	    
	    System.out.print("Enter: ");
	    String  l = ("IanFrederick");
	    String names  = l.substring(4);
	    System.out.println("Count name: " + names);
    }
}
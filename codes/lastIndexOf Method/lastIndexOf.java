import java.util.Scanner;
public class lastIndexOf
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter String");
		String plem  = type.nextLine();
		System.out.println("Enter designated string: ");
		String plom  = type.nextLine();

		System.out.println("The index of: " + plem.lastIndexOf(plom));
		
		
	}
}

import java.util.Scanner;
public class toUpperCase
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter String");
		String nai = type.nextLine();
		System.out.println("To UpperCase:  " + nai.toUpperCase());
	}
}

import java.util.Scanner;
public class dotTrim
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter the word that I want:");
		String noi = type.nextLine();
		System.out.println("Trim :" + noi.trim());
	}
}

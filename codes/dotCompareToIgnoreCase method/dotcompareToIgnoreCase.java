import java.util.Scanner;
public class dotCompareToIgnoreCase
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter the word that I want:");
		String nai = type.nextLine();
		String noi = type.nextLine();
		System.out.println("equalsIgnorecase :" + nai.compareToIgnoreCase(noi));
	}
}

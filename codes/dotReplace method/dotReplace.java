import java.util.Scanner;
public class dotReplace
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter String");
		String noi = "Ian Frederick b. Talania";
		String nai = type.nextLine();
		String nei = type.nextLine();
		System.out.println("Replace String: " + noi.replace(nai,nei));
		
	}
}

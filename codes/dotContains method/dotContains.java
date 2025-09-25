import java.util.Scanner;
public class dotContains
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter Two Strings:");
		String nai = type.nextLine();
		String noi = type.nextLine();
		System.out.println("equalsIgnorecase :" + nai.contains(noi));
	}
}

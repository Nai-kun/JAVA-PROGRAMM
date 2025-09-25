import java.util.Scanner;
public class dotConcat
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Enter a String");
		String nai = type.nextLine();
		String noi = type.nextLine();
		System.out.println("Concat: " + nai.concat(noi));
	}
}

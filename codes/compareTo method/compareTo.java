import java.util.Scanner;
public class compareTo
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner(System.in);
		System.out.println("Input Something: ");
		String bos = "Dinoco";
		String both = type.nextLine();
		System.out.println("compare: " + both.compareTo(bos));
		
	}
}

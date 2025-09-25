import java.util.Scanner;
public class parseInt
{
	public static void main(String[] args) 
	{
	   Scanner type = new Scanner(System.in);
		System.out.println("Input: ");
		String bol = type.nextLine();
		int bal = Integer.parseInt(bol);
		System.out.println(bal * 2);
		
		System.out.println("Input Next: ");
		String tribal = type.nextLine();
		int tribe = Integer.parseInt(tribal);
		System.out.println(tribe * 2);
	}
}

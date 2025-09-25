import java.util.Scanner;
public class parseDouble
{
	public static void main(String[] args) 
	{
	   Scanner type = new Scanner(System.in);
		System.out.println("Input: ");
		String potsu = type.nextLine();
		double gayab = Double.parseDouble(potsu);
		System.out.println(gayab * 2);
		
		System.out.println("Input Next: ");
		String balig = type.nextLine();
		double kot = Double.parseDouble(balig);
		System.out.println(kot * 2);
	}
}

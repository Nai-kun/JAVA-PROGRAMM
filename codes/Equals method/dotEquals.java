import java.util.Scanner;
public class dotEquals
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner(System.in);
	    System.out.println("Input something: ");
	    String noxt = "17";
		String expressions = type.nextLine();
		
		if (expressions.equals(noxt))
		{
		    System.out.println("FACTS");
		}
		else
		{
		    System.out.println("LIGWAK!");
		}
	}
}

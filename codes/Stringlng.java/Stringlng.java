/******************************************************************************

Name of Programmer: Ian Frederick B. Talania
Program statement Create a java program 
1. User enter a word or Q to quit
2. Read and print the string of characters/word from user

*******************************************************************************/
import java.util.Scanner;
public class Stringlng
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		    int i = 0;
		    while ( i < 1000 ) {
		    System.out.println("Enter a word or enter 'Q'or to quit:  ");
		    String bogaloo= input.nextLine();
		    
		    String eND = "Q";
		    String end = "q";
		    
		    if (eND.equals(bogaloo)){
		        break;
		    }
		    else if (end.equals(bogaloo)){
		       break;
		    }
		    else
		    {
              i++;
		    }
		    
		    }
		     System.out.println("Oki bye!");
	}
}

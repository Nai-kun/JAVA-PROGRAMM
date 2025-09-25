/******************************************************************************

Name: Ian Frederick B. Talania
Program Statement: Create a programt that will identify character input 
Type of Characters:
Numeric
Letters
Punctuation Mark
Space
Time Started:2:18 PM
Time Finished:3:45PM

*******************************************************************************/
import java.util.Scanner;
public class charIng
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    {
	        System.out.println("Identify characters: ");
	        char sui = input.next().charAt(0);
	        if (sui >= 'a' &&  sui <= 'z' || sui >= 'A' && sui <= 'Z' )
	        {
	            System.out.print("is Letter: ");
	        }
	        else if (sui >= '1' && sui <= '9')
	        {
	            System.out.print("is Digit ");
	        }
	        else if (sui >= 33 && sui <= 47 || sui >= 58 && sui <= 64 ){
	            System.out.print("is Punctuation");
	        }
	     
	    }
    }
	        
	        
}
	   



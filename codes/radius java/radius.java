/******************************************************************************

Name: Ian Frederick B. Talania
Program Statement:Create a program that will compute the radius of a circle
Objective: use constant declaration
Time start: 11:18 AM
Time end: 11:55
*******************************************************************************/
import java.util.Scanner;
public class radius
{
	public static void main(String[] args)
	{
	     Scanner input = new Scanner(System.in);
	   {
        System.out.print("Input value for circumference:");	
        double C = input.nextDouble();
        
        final double PI = 3.14;
        double radius = C/(2*PI);
        System.out.println("The radius is " + radius);
     
	   }
           
	    
		
	}
}

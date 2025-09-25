import java.util.Scanner;
public class RightTriangle
{
	public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	{
	    System.out.println("Enter the three values to get the right triangle: ");
		System.out.print("Enter a number for length: ");
	    	double a = input.nextDouble();
		     
		System.out.print("Enter b number for height: ");
	    	double b = input.nextDouble();
	    	 
		System.out.print("Enter c number for hypotenuse: ");
	    	double c = input.nextDouble();
		     
		double RightTriangle = (a * a) + (b * b);
		
		
		if (c*c == RightTriangle ){
		
		  System.out.println("There is a right Triangle "); 
		}
		else  {
		
		  System.out.println("NO RIGHT");
		}
		
	}
  }
}

/*
Name: Ian Frederick B. Talania
Program Statement: Create a program that will identify the existence of a right triangle. prompt three values from the user. 
Date: 09/6/23 - 09/6/23
*/



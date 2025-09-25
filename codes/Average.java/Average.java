/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Average
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner(System.in);
		System.out.print("Input First Value: ");
		double num1 = type.nextDouble();
		System.out.print("Input Second Value: ");
		double num2 = type.nextDouble();
		System.out.print("Input Third Value: ");
		double num3 = type.nextDouble();
		System.out.print("Average of the 3 numbers is: " + averageOfNumbers(num1,num2,num3));
	}
	public static double averageOfNumbers(double num1, double num2, double num3)
	{
	    return (num1+num2+num3/ 3);
	}
}

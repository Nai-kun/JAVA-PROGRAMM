/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class SmallestNumber
{
	public static void main(String[] args)
	{
		System.out.println("Input three values");
		int smallnum = input.next();
		System.out.println("Input First value: ");
		System.out.println("Input Second value: ");
		System.out.println("Input Third value:");
		
		int findSmallNum = findTheSmallest(val1,val2,val3);
		System.out.println("The smallest number is: " + findSmallNum);
	}
	
	public static findTheSmallest(int val1, int val2, int val3){
	    int smallest = val1;
	    
	    if (val2 < smallest){
	        smallest = val2;
	    }
	    if (val3 < smallest){
	        smallest = val3;
	    }
	    
	    return smallest;
	    
	}
}

import java.util.Scanner;
public class FindTheMaxandMinValue
{
	public static void main(String[] args) 
	{
	    Scanner type = new Scanner (System.in);
		System.out.println("Input values: ");
		int numbo = type.nextInt();
		
		int [] maxmin = new int [numbo];
		
	
		System.out.println("Enter values: ");
		for (int a = 0; a < numbo; a++)
		{
		    System.out.print("Here are the values"+ (a + 1) + ": ");
	        maxmin[a]= type.nextInt();
		}
		
		int max = maxmin[0];
		int min = maxmin[0];

		for (int i = 0; i < numbo; i++){
		if (maxmin[i] > max){
		    max = maxmin[i];
		}
		
		if (maxmin[i] < min){
		    min = maxmin[i];
		}
		
	}
		 System.out.println("The maximum value is: " + max);
		 System.out.println("The minimum value is: " + min);
	
	}
}

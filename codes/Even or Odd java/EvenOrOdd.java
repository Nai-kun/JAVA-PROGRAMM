import java.util.Scanner;
public class EvenOrOdd
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    System.out.println("Enter a number:");
		int number = input.nextInt();
		
		EvenOrOdd(number);
		input.close();
	}
	
	public static void EvenOrOdd(int number){
	    if(number%2==0){
	    System.out.print("is an even number");
	    }
	    
	else{
	    System.out.print("is an odd number");
	    }
	}
	
}

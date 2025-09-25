import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("ENTER 1ST NUMBER");
		int n1 = input.nextInt();
		System.out.println("ENTER 2ND NUMBER");
		int n2 = input.nextInt();
		
		System.out.println("Choose an Operator:");
		System.out.println("1: Division");
		System.out.println("2: Multiplication");
        System.out.println("3: Addition");
        System.out.println("4: Subtraction");
        int choice = input.nextInt();


		Calculator(n1,n2,choice);
		input.close();
	}
	
	public static void Calculator(int n1, int n2, int choice){
	    
	    switch(choice)
	    {
	        case 1:
	            if(n2 != 0){
	                 int division = n1/n2;
	                 System.out.println("Result: " + division);
	            }
	            else{
	                System.out.println("Error: Division by zero is not allowed "+ "\n");
	            }
	        break;
	        
	        case 2:
	        int multiplication = n1*n2;
	        System.out.println("Result: " + multiplication);
	        break;
	        
	        case 3:
	        int addition = n1 + n2;
	        System.out.println("Result: " + addition);
	        break;
	        
	        case 4:
	        int subtraction = n1 - n2;
	        System.out.println("Result: " + subtraction);
	        break;
	    }
	}
}

import java.util.Scanner;
public class FindGreatestNumber
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("N1: ");
		int N1 = input.nextInt();
		System.out.println("N2: ");
		int N2 = input.nextInt();
		System.out.println("N3: ");
		int N3 = input.nextInt();
		System.out.println();

		GreatestNumber(N1,N2,N3);
		input.close();
	}
	public static void GreatestNumber(int n1, int n2, int n3){
	    if (n1>n2 && n2>n3){
	        System.out.println("N1 is the Greatest Number");
	    }
	    else if (n2>n1 && n2>n3){
	        System.out.println("N2 is the Greatest Number");
	    }
	    else{
	        System.out.println("N3 is the Greatest Number");
	    }
	}
}

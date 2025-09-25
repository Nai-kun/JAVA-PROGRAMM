import java.util.Scanner;
public class SumDigits {

  public static void main(String[] args)
    {
      Scanner type = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int numero = type.nextInt();
	  System.out.println("The sum is " + sumDigits(numero));
    }

 public static int sumDigits(long num) {
		int result = 0;
		
		while(num > 0) {
			result += num % 10;
			num /= 10;
		}
		
		return result;
	}
	
 }

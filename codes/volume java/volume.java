import java.util.Scanner;
public class volume
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);

		System.out.println("Enter mass");
		double mass = input.nextInt();
		System.out.println("Enter density");
		double density = input.nextInt();
		
		compute(mass,density);
		input.close();
	}
	
		public static void  compute (double mass, double density){
		    double volume = mass/density;
		    System.out.println("The result is: " + volume);
		}
		
	
}

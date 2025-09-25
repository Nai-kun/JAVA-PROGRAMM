import java.util.Scanner;
public class CircumferenceAndAreaOfCircle
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius");
		double rad = input.nextDouble();
		
		ComputeCircle(rad);
		input.close();
	}
	
	public static void ComputeCircle(double rad){
	    
	    double area = 3.14159*rad*rad;
	    double circumference = 2*3.14159*rad;
	    
	    System.out.println("The Area of a circle is: " + area);
	    System.out.println("The Circumference of a circle is: " + circumference);
	    
	}
}

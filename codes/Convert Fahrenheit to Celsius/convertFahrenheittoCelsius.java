import java.util.Scanner;
public class convertFahrenheittoCelsius
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Get Celsius");
		double fahrenheit = input.nextDouble();
		
		convert (fahrenheit);
		input.close();
	}
	
	public static void convert(double fahrenheit){
	double celsius = (5.0/9) * (fahrenheit-32);
	System.out.println("Celsius:" + celsius);
	}
}

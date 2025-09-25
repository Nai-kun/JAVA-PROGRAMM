import java.util.Scanner;
public class HotAndCoffee
{
    	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	    System.out.println("Coffee Maker!" + '\n');
	    System.out.println("SELECT HOT COFFEE OR COLD COFFEE");
	    String Select = input.nextLine();
	    
	    if(Select.equals("Hot")){ //Option 1//
	        processHotCoffee(); // Call Method//
	    }
	    else if(Select.equals("Cold")){ //Option 2//
	        processColdCoffee(); // Call Method//
	    }
	    else{
	        System.out.println("Invalid Select: Choice Hot or Cold");
	    }
	    
	    System.out.println("Enjoy your Coffee! <3");
	    input.close();
	    
	}
	
	public static void processHotCoffee(){ //Process of Hot Coffee//
	    System.out.println(" - Add pure coffee");
	    System.out.println(" - Add boil water 200 degrees Fahrenheit");
	    System.out.println(" - Add milk");
	    System.out.println(" - Add sugar");
	    System.out.println(" - Brew 3-5 mins");
	    System.out.println("Served hot coffee" + '\n');
	}
		public static void processColdCoffee(){ //Process of Cold Coffee//
	    System.out.println(" - Add pure coffee");
    	System.out.println(" - Add milk");
	    System.out.println(" - Add sugar");
	    System.out.println(" - Brew 3-5 mins");
	    System.out.println(" - Add ice cubes");
	    System.out.println("Served cold coffee" + '\n');
}
}


/******************************************************************************

Name: Ian Frederick B. Talania
Program Statement: 
(1) User enter a word or enter 'Q' to quit
(2)  Read a string of characters/word from the user
(3)  Write a method that returns a given string without special characters (such as punctuations or digits).  


*******************************************************************************/
import java.util.Scanner;
public class stringCut {
   public static String noPuncorNum/*palitan niyo varname*/(String input) {
        return input.replaceAll("[^a-zA-Z ]", "");
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         
        while (true){
	     System.out.println("Enter a word or 'Q' to quit: " );
	     String userin = input.nextLine();
	    
	     String end = "q";
	    
	        if (end.equalsIgnoreCase(userin)){
	          System.out.println("OK bye!");
	            break;
    }
        String result = noPuncorNum(userin);
        System.out.println("User input without special characters: " + result);
    
}
}
}


 
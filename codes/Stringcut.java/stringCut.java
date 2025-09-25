/******************************************************************************
Name: Ian Frederick B. Talania
Program Statement: 
(1) User enter a word or enter 'Q' to quit
(2)  Read a string of characters/word from the user
(3)  Write a method that returns a given string without special characters (such as punctuations or digits).  
*******************************************************************************/
import java.util.Scanner;
public class stringCut {
     public static String removePunct(String input) {
        return input.replaceAll("[^a-zA-Z ]", "");
    }
    
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
         
         while (true){
            System.out.println("Enter a word or enter 'Q'/ 'q' or to quit:  ");
		    String bogaloo = input.nextLine();
		    
		    String eND = "Q";
		    String end = "q";
		    
		    if (eND.equals(bogaloo)){
		        System.out.println("Oki bye!");
		        break;
            }
            else if (end.equals(bogaloo)){
                System.out.println("Oki bye!");
                break;
            }
            
              String result = removePunct(bogaloo);
        System.out.println("Input anyting while the special characters remove:  " + result);
        
      }
       
        
        
        
}
}
    
  
    
import java.util.Scanner;
public class IsDigit 
{
  public static void main(String[] args) {
    Scanner type = new Scanner (System.in);
    System.out.println("Input a firstDigit of isDigit is: ");
    int tigid = type.next().charAt(0);
    System.out.println("Identify character if : "+ tigid + " " + Character.isDigit(tigid));
    System.out.println("Input a secondDigit of isDigit is: ");
    int tig = type.next().charAt(0);
    System.out.println("Identify character if : "+ tig + " " + Character.isDigit(tig));
    System.out.println("Input a thirdDigit of isDigit is: ");
    int dig = type.next().charAt(0);
    System.out.println("Identify character if : "+ dig + " " + Character.isDigit(dig));
  } 
  
  /* 
  Sample Output: Input a firstDigit of isDigit is: 
  8
  Identify character if: 56 true 
  Explain - **the 56 comes from the ASCII value decimal*/
  
  

}
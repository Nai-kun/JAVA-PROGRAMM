import java.util.Scanner;
public class IsCharacter {
  public static void main(String[] args) 
  {
    Scanner type = new Scanner(System.in);
    System.out.println("The FirstValue of isCharacter is ");
    char typo = type.next().charAt(0);
    System.out.println("Identify character if : "+ typo + " " + Character.isLetter(typo));
    
    System.out.println("The SecondValue of isCharacter is: ");
    char types = type.next().charAt(0);
    System.out.println("Identify character if : "+ types + " " + Character.isLetter(types));

    
    
  }
}

/*
Name: Ian Frederick B. Talania
Section: ICT-CPA
what is the name of the methods
- Character.isLetter
what is the syntax in using the method
- char/Character
what other library is required to use that method
- import java.util.Scanner;
what are the errors you encountered in running and compiling the code?
- Wrong alignment of displaying the input or prompt for the user, 
I realize when I see that sequence of my code is the bug.
how did you solve each error?
- I separated the input for each.
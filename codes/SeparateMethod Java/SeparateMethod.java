//*problem statement: Create a program that will use a separate 
//*method in getting input and printing output. Ask for a string and separate each character.

import java.util.Scanner;

public class SeparateMethod {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Enter String: ");
        String znput = type.nextLine();
        separateAndPrint(znput);
    }

    public static void separateAndPrint(String znput) {
        for (int i = 0; i < znput.length(); i++) {
            System.out.println(znput.charAt(i));
        }
    }
}

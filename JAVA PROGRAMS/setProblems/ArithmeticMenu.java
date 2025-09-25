package setProblems;
import java.util.Scanner;

public class ArithmeticMenu{
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        try{


            System.out.println("ARITHMETIC MENU: ");
            System.out.println("A. Addition");
            System.out.println("B. Subtraction");
            System.out.println("C. Multiplication");
            System.out.println("D. Division");
            System.out.println("E. Modulo");
            System.out.println("F. Quit" + "\n");

            System.out.print("Enter Selection:  ");
            char optionMenu = Character.toLowerCase(input.next().charAt(0));
            if(optionMenu == 'f'){
                System.out.println("Exiting program....");
            }

            System.out.print("Input 2 Operands: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();


            ArithmeticOptions(optionMenu,num1,num2);
            input.close();
        }catch(Exception e){
            System.out.println("INVALID CHOICO FROM ARITHMETIC MENU (A-F)");
        }
    }

    public static void ArithmeticOptions(char operators,int num1, int num2){

        switch(operators){

            case 'a':
                System.out.println("Result: " + (num1 +","+ num2));
                break;
            case 'b':
                System.out.println("Result: " + (num1 - num2));
                break;
            case 'c':
                System.out.println("Result: " + (num1 * num2));
                break;
            case 'd':
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                }else{
                    System.out.println("Cannot be divide to zero...");
                }
            case 'e':
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("INVALID CHOICO FROM ARITHMETIC MENU (A-F)");
        }
    }



}
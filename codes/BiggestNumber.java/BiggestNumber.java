import java.util.Scanner;
public class BiggestNumber {

 public static void main(String[] args)
    {
        Scanner type = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = type.nextInt();
        System.out.print("Input the Second number: ");
        int y = type.nextInt();
        System.out.print("Input the third number: ");
        int z = type.nextInt();
        System.out.println("The smallest value is " + smallest(x, y, z) );
    }

   public static int smallest(int x, int y, int z)
    {
        return Math.max(Math.max(x, y), z);
    }
}

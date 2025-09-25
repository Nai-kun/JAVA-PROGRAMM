import java.util.Scanner;
public class SmallestNumber {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the Second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.println("The smallest value is " + smallest(x, y, z) );
    }

   public static int smallest(int x, int y, int z)
    {
        int num = 0;
        
        if (num < x)
        {
            x = num;
        }
        if (num < y)
        {
            y = num;
        }
        if (num < z)
        {
            z = num;
        }
        return num;
    }
}

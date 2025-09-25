import java.util.Scanner;
public class dotConcat
{
    public static void main (String [] args) 
    {
        Scanner type = new Scanner (System.in);
        System.out.println("Enter String");
        String noi = type.nextLine();
        String nai = type.nextLine();
        System.out.println(noi.concat(nai));
    }
}
import java.util.Scanner;
public class array{
    public static void main (String [] args){
        Scanner type = new Scanner (System.in);
        System.out.println("Select country: ");
        int country = type.nextInt();
        
        String [] countries = {"USA","Thailand","Philippines","Nepal"};
        System.out.println("Cheren!" + countries[country]);
    }
}
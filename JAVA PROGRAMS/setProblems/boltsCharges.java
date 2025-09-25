package setProblems;
import java.util.Scanner;

public class boltsCharges {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double perBolt = 5.25;
        double perNuts = 30;
        double perWasher = 10.50;

        System.out.println("Bob's Discount Bolts");

        System.out.print("Number of Bolts: ");
        double entBolt = input.nextDouble();

        System.out.print("Number of Nuts: ");
        double entNut = input.nextDouble();

        System.out.print("Number of Washers: ");
        double entWashers = input.nextDouble();

        double total = (entBolt * perBolt) + (entNut * perNuts) + (entWashers * perWasher);

        if(entBolt > entNut){
            System.out.println("Check the Order");
        }
        else{
            System.out.println("Order is Okay");
        }

        System.out.println("Total: " + total);

        input.close();
    }
}

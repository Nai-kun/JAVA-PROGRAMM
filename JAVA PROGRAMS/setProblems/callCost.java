package setProblems;
import java.util.Scanner;

public class callCost {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        double ratePerMin = 7.0;
        double nightDisc = 0.40;
        double longCallDisc = 0.17;
        double taxRate = 0.06;
        int nightStart = 1900;
        int nightEnd = 800;
        int longCallTreshold = 60;
        double discount = 0.0;


        System.out.println("Enter the Start time of the call (in 24hr format Ex. [13:00]");
        String StartTimeInp = input.nextLine();

        System.out.print("Enter the duration of the call in minutes: ");
        int duration = input.nextInt();

        String[] timeParts = StartTimeInp.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        int startTime = hour * 100 + minute;

        double grossCost = ratePerMin * duration;
        System.out.println("Gross cost (before discounts and tax)" + grossCost);


        if ((startTime >= nightStart && startTime < 2400) || (startTime >= 0 && startTime < nightEnd)) {
            discount = nightDisc * grossCost;
        }

        double discountedCost = grossCost - discount;

        if (duration > longCallTreshold) {
            discount = longCallDisc * discountedCost;
        }

        double netCostBeforeTax = grossCost - discount;

        double tax = taxRate * netCostBeforeTax;
        double finalCost = netCostBeforeTax + tax;

        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Net cost (after discounts and tax): " + finalCost);

        input.close();
    }
}

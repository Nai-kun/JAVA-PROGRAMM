package setProblems;
import java.util.Scanner;

public class waterBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double HomeBaseCost = 250;
        double HomeCostPerGallon = 2.00;

        double CommeBaseCost = 5000;
        double CommeExtrCosPerGal = 2.00;
        float CommeBaseGal = 4_000_000;

        double IndCostUnder4M = 5000;
        double IndCostUnder10M = 10000;
        double IndCostAbove10M = 15000;
        float IndTreshold4M = 4_000_000;
        float IndTreshold10M = 10_000_000;

        System.out.print("Enter the usage code (H for home, C for commercial, I for industrial): ");
        char code = input.next().toLowerCase().charAt(0);

        System.out.print("Enter the gallons of water used: ");
        float gallonsUsed = input.nextFloat();

        double amountDue = 0.0;

        switch (code) {
            case 'h':
                amountDue = HomeBaseCost + (gallonsUsed * HomeCostPerGallon);
                break;

            case 'c':
                if (gallonsUsed <= CommeBaseGal) {
                    amountDue = CommeBaseCost;
                } else {
                    amountDue = CommeBaseCost + ((gallonsUsed - CommeBaseGal) * CommeExtrCosPerGal);
                }
                break;

            case 'i':
                if (gallonsUsed <= IndTreshold4M) {
                    amountDue = IndCostUnder4M;
                } else if (gallonsUsed <= IndTreshold10M) {
                    amountDue = IndCostUnder10M;
                } else {
                    amountDue = IndCostAbove10M;
                }
                break;

            default:
                System.out.println("Invalid usage code. Please enter 'H', 'C', or 'I'.");
                return;
        }

        System.out.println("Usage Code: "+ code);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Amount Due: " + amountDue);

        input.close();
    }
}


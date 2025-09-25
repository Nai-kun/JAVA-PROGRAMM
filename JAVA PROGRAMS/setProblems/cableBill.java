package setProblems;
import java.util.Scanner;

public class cableBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ResProcFee = 4.50;
        double ResBascServFee = 20.50;
        double ResPremChanlCost = 7.50;

        double BusProcFee = 15.00;
        double BusBascServFee = 75.00;
        int BusBasConn = 10;
        double BusAddConnCost = 5.00;
        double BUSINESS_PREMIUM_CHANNEL_COST = 50.00;

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter customer code (R/r for Residential, B/b for Business): ");
        char customerType = input.next().toLowerCase().charAt(0);

        double totalBill = 0.0;

        if (customerType == 'r') {
            System.out.print("Enter the number of premium channels: ");
            int numPremiumChannels = input.nextInt();

            totalBill = ResProcFee + ResBascServFee
                    + (numPremiumChannels * ResPremChanlCost);

        } else if (customerType == 'b') {
            System.out.print("Enter the number of connections: ");
            int numConnections = input.nextInt();

            System.out.print("Enter the number of premium channels: ");
            int numPremiumChannels = input.nextInt();

            double basicServiceFee = BusBascServFee;
            if (numConnections > BusBasConn) {

                basicServiceFee += (numConnections - BusBasConn) * BusAddConnCost;
            }

            totalBill = BusProcFee + basicServiceFee
                    + (numPremiumChannels * BUSINESS_PREMIUM_CHANNEL_COST);

        } else {
            System.out.println("Invalid customer code. Please enter 'R' for Residential or 'B' for Business.");
            input.close();
            return;
        }

        System.out.println("Account Number: %d\n"+ accountNumber);
        System.out.println("Total Bill: $%.2f\n" + totalBill);

        input.close();
    }
}

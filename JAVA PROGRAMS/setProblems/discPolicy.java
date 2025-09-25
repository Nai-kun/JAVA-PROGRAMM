package setProblems;
import java.util.Scanner;

public class discPolicy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double TEACHER_DISCOUNT_BELOW_100 = 0.10;
        double TEACHER_DISCOUNT_ABOVE_100 = 0.12;
        double SALES_TAX = 0.05;

        System.out.print("Enter the total purchase amount: $");
        double totalPurchase = input.nextDouble();

        System.out.print("Is the purchaser a teacher? (yes or no): ");
        boolean isTeacher = input.next().equalsIgnoreCase("yes");

        double discount = 0.0;
        double discountedTotal = totalPurchase;

        if (isTeacher) {
            if (totalPurchase >= 100) {
                discount = totalPurchase * TEACHER_DISCOUNT_ABOVE_100;
            } else {
                discount = totalPurchase * TEACHER_DISCOUNT_BELOW_100;
            }
            discountedTotal = totalPurchase - discount;
        }

        double salesTax = discountedTotal * SALES_TAX;

        double finalTotal = discountedTotal + salesTax;

        System.out.println("Total Purchases: " + totalPurchase);

        if (isTeacher) {
            discount = totalPurchase >= 100 ? TEACHER_DISCOUNT_ABOVE_100 : TEACHER_DISCOUNT_BELOW_100;
            System.out.println("Teacher’s discount: " + discount * 100);
            System.out.println("Discounted total: " +  discountedTotal);
        }

        System.out.println("Sales tax (5%%): "+ salesTax);
        System.out.println("TOTAL: "+ finalTotal);


        input.close();
    }
}


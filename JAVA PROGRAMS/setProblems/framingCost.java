package setProblems;
import java.util.Scanner;

public class framingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         double ColrCostPerInch = 0.10;
         double RegFramCostPerInch = 0.15;
         double FancyFramCostPerInch = 0.25;
         double CrdBrdCostPerSqrInch = 0.02;
         double GlassCostPerSquareInch = 0.07;
         double CrwnCostPerCrwn = 0.35;

        System.out.print("Enter the length of the picture (in inches): ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the picture (in inches): ");
        double width = input.nextDouble();

        System.out.print("Enter the type of frame (regular or fancy): ");
        String frameType = input.next().toLowerCase();

        System.out.print("Do you want a colored frame? (yes or no): ");
        String colorChoice = input.next().toLowerCase();
        boolean isColored = colorChoice.equals("yes");

        System.out.print("Do you want crowns on the corners? (yes or no): ");
        String crownChoice = input.next().toLowerCase();
        int numCrowns = 0;
        if (crownChoice.equals("yes")) {
            System.out.print("Enter the number of crowns: ");
            numCrowns = input.nextInt();
        }

        double framePerimeter = 2 * (length + width + 2);
        double area = (length + 2) * (width + 2);

        double frameCostPerInch = frameType.equals("fancy") ? FancyFramCostPerInch : RegFramCostPerInch;

        double frameCost = frameCostPerInch * framePerimeter;
        double coloringCost = isColored ? ColrCostPerInch * framePerimeter : 0;
        double cardboardCost = CrdBrdCostPerSqrInch * area;
        double glassCost = GlassCostPerSquareInch * area;
        double crownCost = numCrowns * CrwnCostPerCrwn;

        double totalCost = frameCost + coloringCost + cardboardCost + glassCost + crownCost;

        System.out.println("Frame cost: " + frameCost);
        System.out.println("Coloring cost: " +  coloringCost);
        System.out.println("Cardboard backing cost: " + cardboardCost);
        System.out.println("Glass cost: " + glassCost);
        System.out.println("Crown cost: " + crownCost);
        System.out.println("Total framing cost: " + totalCost);

        input.close();
    }
}

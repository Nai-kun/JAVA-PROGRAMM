package setProblems;
import java.util.Scanner;

public class IncomeCalcu {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("INCOME CALCULATOR:" + "\n");

        double workPerHour = 15.50;
        double taxRate = 0.14;
        double clothesExpenses = 0.10;
        double schoolSuppliesExpenses = 0.01;
        double savingsBonds = 0.25;
        double addiSavingBonds = 0.50;

        System.out.print("ENTER NUMBER OF HOURS WORKED EACH WEEK: ");
        double totalHrs = input.nextInt();

        double grossIncome = totalHrs * workPerHour;

        double taxPaid = grossIncome * taxRate;
        double netIncome = grossIncome - taxPaid;
        double clothesExpense = netIncome * clothesExpenses;
        double suppliesExpense = netIncome * schoolSuppliesExpenses;

        double remainingAfterExpenses = netIncome - (clothesExpense + suppliesExpense);

        double savingsBondExpense = remainingAfterExpenses * savingsBonds;
        double parentBondContribution = savingsBondExpense * addiSavingBonds;

        double totalRemaining = remainingAfterExpenses - savingsBondExpense;

        System.out.println("Gross income: " + grossIncome);
        System.out.println("Net income after tax:" + netIncome);
        System.out.println("Tax paid: " + taxPaid);
        System.out.println("Money spent on clothes and accessories: " + clothesExpense);
        System.out.println("Money spent on school supplies: "+ suppliesExpense);
        System.out.println("Money spent on savings bonds: " + savingsBondExpense);
        System.out.println("Money parents contribute to savings bonds: " + parentBondContribution);
        System.out.println("Total remaining money: "+ totalRemaining);

        input.close();
    }
}

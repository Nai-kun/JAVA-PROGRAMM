/******************************************************************************
Name: Ian Frederick B. Talania
Program Statement:• Read this story and calculate/print the required values:
– On Monday, Farmer Fred collects 100 eggs.
– On Tuesday, Farmer Fred collects 121 eggs.
– On Wednesday, Farmer Fred collects 117 eggs.
– What is the dailyAverage of eggs collected?
– How many eggs could be expected in a 30-day
monthlyAverage?
– If an egg can be sold for a profit of $0.18, what is Farmer Fred’s
total monthlyProfit for all eggs?

Your program should produce the following output:

Daily Average: 112.66666666666667
Monthly Average: 3380.0
Profit: $608.4

Time Start:6:00PM 9/30/23
Time End:7:00PM 9/30/23
*******************************************************************************/
public class ChickenCount02 {
    public static void main(String[] args) {
        int eggsMonday = 100;
        int eggsTuesday = 121;
        int eggsWednesday = 117;

        double dailyAverage = (eggsMonday + eggsTuesday + eggsWednesday) / 3.0;
        double monthlyAverage = dailyAverage * 30;
        double profitPerEgg = 0.18;
        double totalMonthlyProfit =  monthlyAverage * profitPerEgg;

        System.out.println("Daily Average: " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Profit: $" + totalMonthlyProfit);
    }
}

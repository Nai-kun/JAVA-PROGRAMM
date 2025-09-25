/******************************************************************************

Name: Ian Frederick B. Talania
Program Statement:• Read this story and calculate/print the totalEggs
collected between Monday and Wednesday:
– Farmer Brown’s chickens always lay eggsPerChicken eggs
precisely at noon, which he collects that day.
– On Monday, Farmer Brown has chickenCount chickens.
– On Tuesday morning, Farmer Brown gains 1 chicken.
– On Wednesday morning, a wild beast eats half the chickens!
– How many eggs did Farmer Brown collect if he starts with ...
• eggsPerChicken = 5, chickenCount = 3
• eggsPerChicken = 4, chickenCount = 8
Time Start: 2:48PM 9/30/23
Time End: 4:32PM 9/30/23
*******************************************************************************/
public class chickens01 {
    public static void main (String [] args) {
        //First Scenario://
    int eggsPerChickens = 5;
    int chickenTueCount = 3;
    int MonNumOfEggs= 5 * 3;
    chickenTueCount++;
    int Scenario1TotalEggs = (MonNumOfEggs * chickenTueCount /2) + MonNumOfEggs; // the /2 represents the half of the chickencount//
    System.out.println("Total eggs in Scenario1: " + Scenario1TotalEggs );
        //Second Scenario://
    
    int eggsPerChickensSc2 = 4;
    int chickenTueCountSc2 = 8;
    int MonTotalEggs= eggsPerChickensSc2 * chickenTueCountSc2;
    chickenTueCountSc2++;
    int chickenWedCountSc2 = chickenTueCountSc2/2;
    int Scenario2TotalEggs = (eggsPerChickensSc2 * chickenTueCountSc2) + MonTotalEggs + (chickenWedCountSc2 * eggsPerChickensSc2); 
    System.out.println("Total eggs in Scenario2: " + Scenario2TotalEggs );
    
    
    }


    
}


    

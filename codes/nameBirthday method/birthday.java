import java.util.Scanner;
public class birthday 
{
    public static void main(String[] args) 
    {
        Scanner type = new Scanner(System.in);
        System.out.println("Enter Name and birth year: ");
        String name = type.nextLine();
        int birthYear = type.nextInt();
        System.out.println("HAPPY BIRTHDAY! ENJOY YOUR DAY! SMILE:>   " + nameBirthday(name, birthYear));
    }

    public static String nameBirthday(String name, int birthYear) {
        int currentYear = 2023;
        int age = currentYear - birthYear;
        String result = ("Name: " + name + ", Age: " + age);

        return result;
    }
}

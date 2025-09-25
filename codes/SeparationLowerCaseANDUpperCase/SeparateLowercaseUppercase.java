import java.util.Scanner;
public class SeparateLowercaseUppercase {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Input toggle case string: ");
        String alpha = type.nextLine();

        String alpha1 = "Show Lowercase: " + separateLowercaseUppercase(alpha);
        System.out.println(alpha1);

        String alpha2 = "Show Uppercase: " + separateUppercaseLowercase(alpha);
        System.out.println(alpha2);
    }

    public static String separateLowercaseUppercase(String alpha) {
        return alpha.replaceAll("[A-Z]", "");
    }

    public static String separateUppercaseLowercase(String alpha) {
        return alpha.replaceAll("[a-z]", "");
    }
}

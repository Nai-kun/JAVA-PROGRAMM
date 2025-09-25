import java.util.Scanner;
public class VowelCount {
  public static void main(String[] args)
    {
        Scanner type = new Scanner(System.in);
        System.out.print("Input the string: ");
        String vwl = type.nextLine();

        System.out.print("Number of  Vowels in the string: " + countVow(vwl)+"\n");
    }
 public static int countVow(String vwl)
    {
        int count = 0;
        for (int x = 0; x < vwl.length(); x++)
        {
            if (vwl.charAt(x) == 'a' || vwl.charAt(x) == 'e' || vwl.charAt(x) == 'i'
                    || vwl.charAt(x) == 'o' || vwl.charAt(x) == 'u')
            {
                count++;
            }
            else if (vwl.charAt(x) == 'A' || vwl.charAt(x) == 'E' || vwl.charAt(x) == 'I'
                    || vwl.charAt(x) == 'O' || vwl.charAt(x) == 'U')
            {
                count++;
            }
        }
        return count;
    }
}

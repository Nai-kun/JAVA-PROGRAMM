import java.util.Scanner;
public class WordsCount {
    
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String countwrd = in.nextLine();

        System.out.println("Number of words in the string: " + countOfWords(countwrd));
    }

 public static int countOfWords(String countwrd)
    {
       int c = 0;
        if (!("".equals(countwrd.substring(0, 1))) || !(" ".equals(countwrd.substring(countwrd.length() - 1))))
        {
            for (int w = 0; w < countwrd.length(); w++)
            {
                if (countwrd.charAt(w) == ' ')
                {
                    c++;
                }
            }
            c = c + 1; 
        }
        return c; 
}
    
}

  
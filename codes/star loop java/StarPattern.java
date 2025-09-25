public class StarPattern {
    public static void main(String[] args) {
        // Loop to print 1 to 5 stars
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}

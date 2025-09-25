public class CoinSortingMachine
{
    public static void main(String[] args) {
        CoinMachine behavior  = new CoinMachine();
        behavior.CoinCount  = "Completion";
        behavior.CoinRolling = "Peso sorting";
        behavior.CoinReject = "Rejection";
        System.out.println("Object 1: " + behavior.CoinCount);
        System.out.println("Object 2: " + behavior.CoinRolling);
        System.out.println("Object 3: " + behavior.CoinReject);
    }
}
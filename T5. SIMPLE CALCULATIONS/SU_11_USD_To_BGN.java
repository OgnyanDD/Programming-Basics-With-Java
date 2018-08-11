import java.util.Scanner;

public class SU_11_USD_To_BGN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double usd = in.nextDouble();
        final double USD_TO_BG = 1.79549;

        System.out.printf("%.2f BGN", usd * USD_TO_BG);

    }
}

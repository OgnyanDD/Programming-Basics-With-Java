import java.util.Scanner;

public class SU_15_Tailoring_Workshop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tablesNumber = in.nextInt();
        double tableLenght = in.nextDouble();
        double tableWidth = in.nextDouble();
        double coverArea = tablesNumber * (tableLenght + 2 * 0.30) * (tableWidth + 2 * 0.30);
        double boxCoverArea = tablesNumber * (tableLenght / 2) * (tableLenght / 2);
        double priceUsd = coverArea * 7 + boxCoverArea * 9;
        double priceBgn = (coverArea * 7 + boxCoverArea * 9) * 1.85;

        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);

    }
}

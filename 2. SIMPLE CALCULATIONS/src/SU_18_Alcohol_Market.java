import java.util.Scanner;

public class SU_18_Alcohol_Market {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double priceWhiskey = in.nextDouble();
        double biraLitri = in.nextDouble();
        double vinoLitri = in.nextDouble();
        double rakiaLitri = in.nextDouble();
        double whiskeyLitri = in.nextDouble();
        double priceRakia = priceWhiskey / 2;
        double priceVino = 0.60 * priceRakia;
        double priceBira = 0.20 * priceRakia;

        double totalMoney = (priceWhiskey * whiskeyLitri) + (priceRakia * rakiaLitri) + (priceVino * vinoLitri) + (priceBira * biraLitri);

        System.out.printf("%.2f", totalMoney);

    }
}

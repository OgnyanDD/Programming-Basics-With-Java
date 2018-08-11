import java.util.Scanner;

public class SU_17_Charity_Campaign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int days = in.nextInt();
        int pastyCook = in.nextInt();
        int cake = in.nextInt();
        int waffle = in.nextInt();
        int pancake = in.nextInt();

        double cakePrice = cake * 45;
        double wafflePrice = waffle * 5.80;
        double pancakePrice = pancake * 3.20;
        double productPrice = (cakePrice + wafflePrice + pancakePrice) * pastyCook;
        double fullPrice = productPrice * days;
        double lastPrice = fullPrice * 0.875;

        System.out.printf("%.2f", lastPrice);

    }
}

import java.util.Scanner;

public class SU_21_Toy_Shop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double price = Double.parseDouble(in.nextLine());
        double puzzle = Double.parseDouble(in.nextLine());
        double doll = Double.parseDouble(in.nextLine());
        double bear = Double.parseDouble(in.nextLine());
        double minion = Double.parseDouble(in.nextLine());
        double truck = Double.parseDouble(in.nextLine());

        double sum = puzzle * 2.6 + doll * 3 + bear * 4.1 + minion * 8.2 + truck * 2;
        double count = puzzle + doll + bear + minion + truck;
        if (count >= 50) {
            sum = sum * 0.75;
        }
        sum = sum * 0.9;
        if (sum >= price) {
            System.out.printf("Yes! %.2f lv left.", sum - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - sum);
        }

    }
}

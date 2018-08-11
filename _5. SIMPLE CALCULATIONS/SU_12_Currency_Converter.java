import java.util.Scanner;

public class SU_12_Currency_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valueMoney = Double.parseDouble(in.nextLine());
        String fromCurrency = in.nextLine();
        String toCurrency = in.nextLine();

        final double RATIO_USD = 1.79549;
        final double RATIO_EUR = 1.95583;
        final double RATIO_GBP = 2.53405;

        switch (fromCurrency) {
            case "USD":
                valueMoney *= RATIO_USD;
                break;
            case "EUR":
                valueMoney *= RATIO_EUR;
                break;
            case "GBP":
                valueMoney *= RATIO_GBP;
                break;
            default:
                break;
        }
        switch (toCurrency) {
            case "USD":
                valueMoney /= RATIO_USD;
                break;
            case "EUR":
                valueMoney /= RATIO_EUR;
                break;
            case "GBP":
                valueMoney /= RATIO_GBP;
                break;
            default:
                break;
        }
        System.out.printf("%.2f %s", valueMoney, toCurrency);

    }
}

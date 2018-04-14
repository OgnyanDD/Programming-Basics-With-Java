import java.util.Scanner;

public class SU_08_Trade_Comissions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String town = in.nextLine().toLowerCase();
        double sales = Double.parseDouble(in.nextLine());
        double commission = -1.0;

        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) commission = 0.05;
            else if (sales > 500 && sales <= 1000) commission = 0.07;
            else if (sales > 1000 && sales <= 10000) commission = 0.08;
            else if (sales > 10000) commission = 0.12;
        } else if (town.equals("varna")) {
            if (sales >= 0 && sales <= 500) commission = 0.045;
            else if (sales > 500 && sales <= 1000) commission = 0.075;
            else if (sales > 1000 && sales <= 10000) commission = 0.10;
            else if (sales > 10000) commission = 0.13;
        } else if (town.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) commission = 0.055;
            else if (sales > 500 && sales <= 1000) commission = 0.08;
            else if (sales > 1000 && sales <= 10000) commission = 0.12;
            else if (sales > 10000) commission = 0.145;
        } else {
            System.out.println("error");
        }
        if (commission > 0) {
            System.out.printf("%.2f", commission * sales);
        } else {
            System.out.println("error");
        }

    }
}

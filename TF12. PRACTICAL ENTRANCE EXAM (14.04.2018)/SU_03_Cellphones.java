import java.util.Scanner;

public class SU_03_Cellphones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        int numberCellphones = Integer.parseInt(in.nextLine());
        String brand = in.nextLine();

        double priceCellphone = 0.0;
        double discount = 0.0;
        double discountNumberCellphones = 0.0;

        switch (brand) {
            case "Gsm4e":
                priceCellphone = 20.50;
                discount = 0.01;
                break;
            case "Mobifon4e":
                priceCellphone = 50.75;
                discount = 0.02;
                break;
            case "Telefon4e":
                priceCellphone = 115.00;
                discount = 0.03;
                break;
        }
        if (numberCellphones > 10 && numberCellphones <= 20) {
            discountNumberCellphones = 0.02;
        } else if (numberCellphones > 20 && numberCellphones <= 50) {
            discountNumberCellphones = 0.05;
        } else if (numberCellphones > 50) {
            discountNumberCellphones = 0.07;
        }
        double firstPrice = priceCellphone * numberCellphones;
        double sumDiscount = discount + discountNumberCellphones;
        double discountFirstPrice = firstPrice - (firstPrice * sumDiscount);
        double totalMoney = Math.abs(budget - discountFirstPrice);

        if (budget > discountFirstPrice) {
            System.out.printf("The company bought all mobile phones. %.2f leva left.", totalMoney);
        } else {
            System.out.printf("Not enough money for all mobiles. Company needs %.2f more leva.", totalMoney);
        }

    }
}

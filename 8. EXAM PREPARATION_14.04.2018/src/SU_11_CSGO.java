import java.util.Scanner;

public class SU_11_CSGO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int itemsNumber = Integer.parseInt(in.nextLine());
        int money = Integer.parseInt(in.nextLine());

        if (itemsNumber > 7) {
            System.out.println("Sorry, you can't carry so many things!");
            return;
        }

        final int item_ak47 = 2700;
        final int item_awp = 4750;
        final int item_sg553 = 3500;
        final int item_grenade = 300;
        final int item_flash = 250;
        final int item_glock = 500;
        final int item_bazooka = 5600;

        int totalPrice = 0;

        for (int i = 0; i < itemsNumber; i++) {

            String itemType = in.nextLine();
            switch (itemType) {
                case "ak47":
                    totalPrice += item_ak47;
                    break;
                case "awp":
                    totalPrice += item_awp;
                    break;
                case "sg553":
                    totalPrice += item_sg553;
                    break;
                case "grenade":
                    totalPrice += item_grenade;
                    break;
                case "flash":
                    totalPrice += item_flash;
                    break;
                case "glock":
                    totalPrice += item_glock;
                    break;
                case "bazooka":
                    totalPrice += item_bazooka;
                    break;
            }
        }
        if (money >= totalPrice) {
            System.out.printf("You bought all %d items! Get to work and defeat the bomb!", itemsNumber);
        } else {
            System.out.println("Not enough money! You need " + (totalPrice - money) + " more money.");
        }

    }
}

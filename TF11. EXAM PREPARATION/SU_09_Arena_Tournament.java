import java.util.Scanner;

public class SU_09_Arena_Tournament {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double points = Double.parseDouble(in.nextLine());
        String nameArena = in.nextLine();
        String dayOfWeek = in.nextLine();
        String thingState = in.nextLine();

        int price = 0;

        switch (thingState) {
            case "Poor":
                price = 7000;
                break;
            case "Normal":
                price = 14000;
                break;
            case "Legendary":
                price = 21000;
                break;
        }
        double discount = 0;

        if (nameArena.equals("Nagrand") && (dayOfWeek.equals("Monday") || dayOfWeek.equals("Wednesday"))) {
            discount = 0.05;
        } else if (nameArena.equals("Gurubashi") && (dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Thursday"))) {
            discount = 0.10;
        } else if (nameArena.equals("Dire Maul") && (dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday"))) {
            discount = 0.07;
        }

        double priceTotal = price - (price * discount);
        double priceOneIteam = priceTotal / 5;
        int succsessPurchase = 0;

        for (int i = 1; i <= 5 && points >= priceOneIteam; i++) {
            points -= priceOneIteam;
            succsessPurchase++;
        }
        if (succsessPurchase == 5) {
            System.out.printf("Items bought: %d%n", succsessPurchase);
            System.out.printf("Arena points left: %.0f%n", points);
            System.out.println("Success!");
        } else {
            System.out.printf("Items bought: %d%n", succsessPurchase);
            System.out.printf("Arena points left: %.0f%n", points);
            System.out.println("Failure!");
        }
    }

}

import java.util.Scanner;

public class SU_11_Cinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String typeProjection = in.nextLine();
        int r = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        double price = 0;

        if (typeProjection.equals("Premiere")) price = 12.00;
        else if (typeProjection.equals("Normal")) price = 7.5;
        else if (typeProjection.equals("Discount")) price = 5.0;
        System.out.printf("%.2f leva", r * c * price);

    }
}

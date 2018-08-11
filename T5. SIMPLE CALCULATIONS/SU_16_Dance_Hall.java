import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_16_Dance_Hall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        double L = in.nextDouble();
        double W = in.nextDouble();
        double A = in.nextDouble();

        double hall = (L * 100) * (W * 100);
        double wardrobe = (A * 100) * (A * 100);
        double bench = hall / 10;
        double freespace = hall - wardrobe - bench;
        double dancers = freespace / (40 + 7000);

        System.out.println(df.format(Math.floor(dancers)));
    }
}

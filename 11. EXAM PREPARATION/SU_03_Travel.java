import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_03_Travel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        double razstA_B = in.nextDouble();
        double skorostKamion = in.nextDouble();
        double razlikaSkorost = in.nextDouble();
        double razlika_km_h = razlikaSkorost * 3.6;
        double skorostKola = skorostKamion + razlika_km_h;

        double truckArived = razstA_B / skorostKamion;
        double carArived = razstA_B / skorostKola;

        System.out.println("The truck arrived after " + df.format(Math.ceil(truckArived)) + " hours");
        System.out.println("The car arrived after " + df.format(Math.ceil(carArived)) + " hours");

    }
}

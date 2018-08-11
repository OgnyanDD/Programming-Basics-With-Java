import java.util.Scanner;

public class SU_09_Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tC = in.nextDouble();
        double tF = tC * 9 / 5 + 32;

        System.out.printf("%.2f", tF);

    }
}

import java.util.Scanner;

public class SU_02_Inch_To_Cm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double inputInch = in.nextDouble();
        final double CM_VALUE = 2.54;
        System.out.printf("%.2f", inputInch * CM_VALUE);

    }
}

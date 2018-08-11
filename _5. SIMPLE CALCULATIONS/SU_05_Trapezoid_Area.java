import java.util.Scanner;

public class SU_05_Trapezoid_Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double b1 = in.nextDouble();
        double b2 = in.nextDouble();
        double h = in.nextDouble();
        double area = (b1 + b2) * h / 2;
        System.out.printf("%.2f", area);

    }
}

import java.util.Scanner;

public class SU_08_Triangle_Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double h = in.nextDouble();
        double area = a * h / 2;

        System.out.printf("Triangle area = %.2f", area);

    }
}

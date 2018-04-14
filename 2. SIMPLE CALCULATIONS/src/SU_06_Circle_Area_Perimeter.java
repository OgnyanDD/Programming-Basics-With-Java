import java.util.Scanner;

public class SU_06_Circle_Area_Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = in.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Area = %.13f%n", area);
        System.out.printf("Perimeter = %.13f", perimeter);

    }
}

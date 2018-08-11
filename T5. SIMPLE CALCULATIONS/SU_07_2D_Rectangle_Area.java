import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_07_2D_Rectangle_Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.####");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double area = Math.abs(x1 - x2) * Math.abs(y2 - y1);
        double perimeter = 2 * Math.abs(x1 - x2) + 2 * Math.abs(y2 - y1);

        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));

    }
}

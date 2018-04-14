import java.util.Scanner;

public class SU_06_Point_On_Rectangle_Border {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1 = Double.parseDouble(in.nextLine());
        double y1 = Double.parseDouble(in.nextLine());
        double x2 = Double.parseDouble(in.nextLine());
        double y2 = Double.parseDouble(in.nextLine());
        double x = Double.parseDouble(in.nextLine());
        double y = Double.parseDouble(in.nextLine());

        boolean onLeftSide = (x == x1) && (y >= y1) && (y <= y2);
        boolean onRightSide = (x == x2) && (y >= y1) && (y <= y2);
        boolean onUpSide = (y == y1) && (x >= x1) && (x <= x2);
        boolean onDownSide = (y == y2) && (x >= x1) && (x <= x2);

        if (onLeftSide || onRightSide || onUpSide || onDownSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}

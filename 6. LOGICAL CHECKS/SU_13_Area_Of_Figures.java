import java.util.Scanner;

public class SU_13_Area_Of_Figures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String figureValue = in.nextLine();

        double area = 0.0d;
        if (figureValue.equals("square")) {
            double squareInput = Double.parseDouble(in.nextLine());
            area = squareInput * squareInput;
        } else if (figureValue.equals("rectangle")) {
            double rectangleA = Double.parseDouble(in.nextLine());
            double rectangleB = Double.parseDouble(in.nextLine());
            area = rectangleA * rectangleB;
        } else if (figureValue.equals("circle")) {
            double circleR = Double.parseDouble(in.nextLine());
            area = Math.PI * circleR * circleR;
        } else if (figureValue.equals("triangle")) {
            double rectangleA = Double.parseDouble(in.nextLine());
            double rectangleH = Double.parseDouble(in.nextLine());
            area = rectangleA * rectangleH / 2;
        }
        System.out.printf("%.3f", area);

    }
}

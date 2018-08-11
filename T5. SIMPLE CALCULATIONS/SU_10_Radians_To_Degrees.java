import java.util.Scanner;

public class SU_10_Radians_To_Degrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double rad = in.nextDouble();
        double deg = Math.toDegrees(rad);

        System.out.println(Math.round(deg));

    }
}

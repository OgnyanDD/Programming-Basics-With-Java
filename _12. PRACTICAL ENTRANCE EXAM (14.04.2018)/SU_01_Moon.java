import java.util.Scanner;

public class SU_01_Moon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double speed = Double.parseDouble(in.nextLine());
        double gas = Double.parseDouble(in.nextLine());
        final int distanceEarthMoon = 384400;
        final int periodOnTheMoon = 3;

        double goBackTime = Math.ceil((distanceEarthMoon * 2) / speed);
        double totalTime = goBackTime + periodOnTheMoon;
        double totalGas = (gas * (distanceEarthMoon * 2) / 100);

        System.out.printf("%.0f%n", totalTime);
        System.out.printf("%.0f", totalGas);

    }
}

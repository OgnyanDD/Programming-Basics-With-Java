import java.util.Scanner;

public class SU_10_Balls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ballsCount = Integer.parseInt(in.nextLine());
        int totalBalls = 0;
        int pointsRedBalls = 0;
        int pointsOrangeBalls = 0;
        int pointsYellowBalls = 0;
        int pointsWhiteBalls = 0;
        int pointsOtherColors = 0;
        int pointsDivBlackBalls = 0;

        for (int i = 0; i < ballsCount; i++) {
            String color = in.nextLine();
            switch (color) {
                case "red":
                    pointsRedBalls++;
                    totalBalls += 5;
                    break;
                case "orange":
                    pointsOrangeBalls++;
                    totalBalls += 10;
                    break;
                case "yellow":
                    pointsYellowBalls++;
                    totalBalls += 15;
                    break;
                case "white":
                    pointsWhiteBalls++;
                    totalBalls += 20;
                    break;
                case "black":
                    pointsDivBlackBalls++;
                    totalBalls /= 2;
                    break;
                default:
                    pointsOtherColors++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalBalls);
        System.out.printf("Points from red balls: %d%n", pointsRedBalls);
        System.out.printf("Points from orange balls: %d%n", pointsOrangeBalls);
        System.out.printf("Points from yellow balls: %d%n", pointsYellowBalls);
        System.out.printf("Points from white balls: %d%n", pointsWhiteBalls);
        System.out.printf("Other colors picked: %d%n", pointsOtherColors);
        System.out.printf("Divides from black balls: %d%n", pointsDivBlackBalls);

    }
}

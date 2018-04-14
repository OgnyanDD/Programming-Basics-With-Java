import java.util.Scanner;

public class SU_17_Three_Brothers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstBrother = Double.parseDouble(in.nextLine());
        double secondBrother = Double.parseDouble(in.nextLine());
        double thirdBrother = Double.parseDouble(in.nextLine());
        double timeForFishing = Double.parseDouble(in.nextLine());

        double totalTime = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        double rest = totalTime * 0.15;
        double timeWithRest = rest + totalTime;
        double timeLeft = timeForFishing - timeWithRest;

        System.out.printf("Cleaning time: %.2f%n", timeWithRest);

        if (timeLeft > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(Math.abs(timeLeft)));
        }

    }
}

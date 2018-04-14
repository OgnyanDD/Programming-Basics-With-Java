import java.util.Scanner;

public class SU_05_Illidan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int broiHora = in.nextInt();
        int powerHuman = in.nextInt();
        int bloodIllidan = in.nextInt();

        int obshtaSila = broiHora * powerHuman;
        int razlika = obshtaSila - bloodIllidan;

        if (obshtaSila < bloodIllidan) {
            System.out.printf("You are not prepared! You need %d more points.", Math.abs(razlika));
        } else {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", Math.abs(razlika));
        }

    }
}

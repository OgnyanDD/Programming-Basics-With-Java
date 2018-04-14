import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_06_Bonus_Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");

        int valueInput = in.nextInt();
        double bonusPoints = 0;

        if (valueInput < 100) {
            bonusPoints += 5;
        } else if (valueInput < 1000) {
            bonusPoints = valueInput * 0.20;
        } else {
            bonusPoints = valueInput * 0.10;
        }
        if (valueInput % 2 == 0) {
            bonusPoints += 1.0;
        } else if (valueInput % 10 == 5) {
            bonusPoints += 2.0;
        }
        System.out.println(df.format(bonusPoints));
        System.out.println(df.format(valueInput + bonusPoints));

    }
}

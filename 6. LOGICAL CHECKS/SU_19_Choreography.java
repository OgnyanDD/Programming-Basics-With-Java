import java.util.Scanner;

public class SU_19_Choreography {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double steps = Double.parseDouble(in.nextLine());
        double dancers = Double.parseDouble(in.nextLine());
        double days = Double.parseDouble(in.nextLine());

        double stepsPerDay = Math.ceil(1 * 100 / days);
        double procent = stepsPerDay / dancers;

        if (stepsPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procent);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", procent);
        }

    }
}

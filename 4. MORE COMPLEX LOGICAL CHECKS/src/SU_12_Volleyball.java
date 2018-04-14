import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_12_Volleyball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String year = in.nextLine().toLowerCase();
        int holidays = Integer.parseInt(in.nextLine());
        int weekendsHome = Integer.parseInt(in.nextLine());

        double weekendsSofia = (((48 - weekendsHome) * 3.0 / 4) + (holidays * 2.0 / 3));
        double totalPlay = weekendsHome + weekendsSofia;
        DecimalFormat df = new DecimalFormat("0");

        if (year.equals("leap")) {
            System.out.println(df.format(Math.floor(totalPlay + (totalPlay * 0.15))));
        } else if (year.equals("normal")) {
            System.out.println(df.format(Math.floor(totalPlay)));
        }

    }
}

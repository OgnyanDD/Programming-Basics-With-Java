import java.util.Scanner;

public class SU_14_Time_Plus_15_Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = Integer.parseInt(in.nextLine());
        int min = Integer.parseInt(in.nextLine());

        min += 15;
        if (min > 59) {
            hour++;
            min -= 60;
        }
        if (hour > 23) {
            hour -= 24;
        }
        System.out.printf("%d:%02d", hour, min);

    }
}

import java.util.Scanner;

public class SU_07_Slot_Machine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char n = in.nextLine().charAt(0);
        int n1 = Integer.parseInt(in.nextLine());
        char m = in.nextLine().charAt(0);
        int m1 = Integer.parseInt(in.nextLine());
        char k = in.nextLine().charAt(0);
        int k1 = Integer.parseInt(in.nextLine());

        int nSum = (int) n + n1;
        int mSum = (int) m + m1;
        int kSum = (int) k + k1;

        if (nSum==64 && mSum == 64 && kSum == 64) {
            System.out.printf("%c%c%c%n", (char) nSum, (char) mSum, (char) kSum);
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else if (nSum==55 && mSum == 55 && kSum == 55) {
            System.out.printf("%c%c%c%n", (char) nSum, (char) mSum, (char) kSum);
            System.out.println("*** JACKPOT ***");
        } else {
            System.out.printf("%c%c%c", (char) nSum, (char) mSum, (char) kSum);
        }

    }
}

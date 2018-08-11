import java.util.Scanner;

public class SU_10_Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        if (n == 1) {
            System.out.println("*");
            return;
        } else if (n == 2) {
            System.out.println("**");
            return;
        }
        int leftRight = (n - 1) / 2;
        int mid = 0;

        String topBottomRow = "";
        if (n % 2 == 0) {
            topBottomRow += draw("-", leftRight)
                    + "**"
                    + draw("-", leftRight);
        } else {
            topBottomRow += draw("-", leftRight)
                    + "*"
                    + draw("-", leftRight);
        }
        System.out.println(topBottomRow);
        leftRight--;
        for (int i = 1; i < (n - 1) / 2; i++) {
            mid = n - 2 * leftRight - 2;
            System.out.println(
                    draw("-", leftRight)
                            + "*"
                            + draw("-", mid)
                            + "*"
                            + draw("-", leftRight));
            leftRight--;
        }
        String middleRow = "";
        middleRow += "*"
                + draw("-", n - 2)
                + "*";
        System.out.println(middleRow);
        leftRight++;
        for (int i = 1; i < (n - 1) / 2; i++) {
            mid = n - 2 * leftRight - 2;
            System.out.println(
                    draw("-", leftRight)
                            + "*"
                            + draw("-", mid)
                            + "*"
                            + draw("-", leftRight));
            leftRight++;
        }
        System.out.println(topBottomRow);
    }

    static String draw(String s, int length) {
        String toReturn = "";
        for (int i = 0; i < length; i++) {
            toReturn += s;
        }
        return toReturn;
    }
}

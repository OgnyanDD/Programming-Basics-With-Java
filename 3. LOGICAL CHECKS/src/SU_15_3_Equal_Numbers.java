import java.util.Scanner;

public class SU_15_3_Equal_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1 = Double.parseDouble(in.nextLine());
        double num2 = Double.parseDouble(in.nextLine());
        double num3 = Double.parseDouble(in.nextLine());

        if ((num1 == num2) && (num1 == num3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

import java.util.Scanner;

public class SU_05_Invalid_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num = Double.parseDouble(in.nextLine());

        boolean inRange = (num >= 100 && num <= 200) || num == 0;

        if (!inRange)
            System.out.println("invalid");

    }
}

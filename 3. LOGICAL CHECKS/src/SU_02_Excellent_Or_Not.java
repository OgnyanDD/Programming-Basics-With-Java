import java.util.Scanner;

public class SU_02_Excellent_Or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double result = in.nextDouble();

        if (result >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }

    }
}

import java.util.Scanner;

public class SU_03_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        if (value % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}

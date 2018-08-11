import java.util.Scanner;

public class SU_06_Square_Of_Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < a - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < a - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}

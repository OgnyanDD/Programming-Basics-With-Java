import java.util.Scanner;

public class SU_03_Square_Of_Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = Integer.parseInt(in.nextLine());

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == side) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}

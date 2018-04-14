import java.util.Scanner;

public class SU_02_Rectangle_Of_N_N_Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = Integer.parseInt(in.nextLine());

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

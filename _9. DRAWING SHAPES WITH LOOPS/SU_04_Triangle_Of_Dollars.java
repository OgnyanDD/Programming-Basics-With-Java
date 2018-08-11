import java.util.Scanner;

public class SU_04_Triangle_Of_Dollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = Integer.parseInt(in.nextLine());

        for (int col = 0; col < side; col++) {
            for (int row = 0; row <= col; row++) {
                if (row == col) {
                    System.out.print("$");
                } else {
                    System.out.print("$ ");
                }
            }
            System.out.println();
        }

    }
}

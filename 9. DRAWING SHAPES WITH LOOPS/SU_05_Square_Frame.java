import java.util.Scanner;

public class SU_05_Square_Frame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = Integer.parseInt(in.nextLine());
        side -= 1;

        for (int row = 0; row <= side; row++) {
            for (int col = 0; col <= side; col++) {
                if (row == 0 || row == side) {
                    if (col == 0 || col == side) {
                        if (col == 0) {
                            System.out.print("+ ");
                        } else {
                            System.out.print("+");
                        }
                    } else if (col > 0 && col < side) {
                        if (col > 0) {
                            System.out.print("- ");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
                if (row > 0 && row < side) {
                    if (col == 0 || col == side) {
                        if (col == 0) {
                            System.out.print("| ");
                        } else {
                            System.out.print("|");
                        }
                    } else if (col != 0 && col < side) {
                        if (col != 0) {
                            System.out.print("- ");
                        } else {
                            System.out.print("- ");
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}

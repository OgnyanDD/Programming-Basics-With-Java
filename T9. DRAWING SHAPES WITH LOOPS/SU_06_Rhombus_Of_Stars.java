import java.util.Scanner;

public class SU_06_Rhombus_Of_Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = Integer.parseInt(in.nextLine());

        for (int row = 0; row < side; row++) {
            for (int emp = 1; emp < side - row; emp++) {
                System.out.print(" ");
            }
            for (int star = side; star >= side - row; star--) {
                if (star == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        for (int rowL = 1; rowL <= side - 1; rowL++) {
            for (int empL = side - 1; empL >= side - rowL; empL--) {
                System.out.print(" ");
            }
            for (int starL = 0; starL < side - rowL; starL++) {
                if (starL == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
}

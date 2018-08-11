import java.util.Scanner;

public class SU_13_Number_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int br = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                if (col > 1) {
                    System.out.print(" ");
                }
                System.out.print(br);
                br++;
                if (br == n + 1) {
                    return;
                }
            }
            System.out.println();
        }

    }
}

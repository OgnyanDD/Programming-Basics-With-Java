import java.util.Scanner;

public class SU_07_Christmas_Tree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int top = 0; top < n; top++) {
            System.out.print(" ");
        }
        System.out.println(" | ");
        for (int i = 1; i < n + 1; i++) {
            for (int left = 1; left <= n - i; left++) {
                System.out.print(" ");
            }
            for (int leftStar = n; leftStar > n - i; leftStar--) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int rightStar = n; rightStar > n - i; rightStar--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class SU_05_Max_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(in.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("max = " + maxNum);

    }
}

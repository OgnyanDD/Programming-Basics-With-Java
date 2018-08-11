import java.util.Scanner;

public class SU_04_Sum_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(in.nextLine());
            sum += num;
        }
        System.out.println(sum);

    }
}

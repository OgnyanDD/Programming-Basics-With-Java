import java.util.Scanner;

public class SU_07_Left_And_Right_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumberLeft = Integer.parseInt(in.nextLine());
            leftSum = leftSum + currentNumberLeft;
        }
        for (int i = 0; i < n; i++) {
            int currentNumberRight = Integer.parseInt(in.nextLine());
            rightSum = rightSum + currentNumberRight;
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + rightSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }

    }
}

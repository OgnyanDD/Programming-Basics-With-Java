import java.util.Scanner;

public class SU_06_Car_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = Integer.parseInt(in.nextLine());
        int end = Integer.parseInt(in.nextLine());

        for (int first = start; first <= end; first++) {
            for (int second = start; second <= end; second++) {
                for (int third = start; third <= end; third++) {
                    for (int forth = start; forth <= end; forth++) {
                        boolean oddEven = (first % 2 == 0 && forth % 2 != 0) || (first % 2 != 0 && forth % 2 == 0);
                        boolean biggerFirst = first > forth;
                        boolean evenSum = (second + third) % 2 == 0;

                        if (oddEven && biggerFirst && evenSum) {
                            System.out.printf("%d%d%d%d ", first, second, third, forth);
                        }
                    }
                }
            }
        }
    }
}

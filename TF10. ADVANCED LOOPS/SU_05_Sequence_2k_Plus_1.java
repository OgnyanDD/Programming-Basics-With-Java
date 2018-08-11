import java.util.Scanner;

public class SU_05_Sequence_2k_Plus_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i = (i * 2 + 1)) {
            System.out.println(i);
        }

    }
}

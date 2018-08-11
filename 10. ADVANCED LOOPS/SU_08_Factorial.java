import java.util.Scanner;

public class SU_08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        do {
            sum *= n;
            n--;
        } while (n > 1);
        System.out.println(sum);

    }
}

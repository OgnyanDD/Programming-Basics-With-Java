import java.util.Scanner;

public class SU_14_Birthday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lenght = in.nextInt();
        int weight = in.nextInt();
        int height = in.nextInt();
        double percent = in.nextDouble() / 100;
        double volume = lenght * weight * height * 0.001 * (1 - percent);

        System.out.printf("%.3f", volume);

    }
}

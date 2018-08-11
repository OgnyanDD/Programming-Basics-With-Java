import java.util.Scanner;

public class SU_12_Speed_Info {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double speedValue = Double.parseDouble(in.nextLine());

        if (speedValue <= 10) {
            System.out.println("slow");
        } else if (speedValue > 10 && speedValue <= 50) {
            System.out.println("average");
        } else if (speedValue > 50 && speedValue <= 150) {
            System.out.println("fast");
        } else if (speedValue > 150 && speedValue <= 1000) {
            System.out.println("ultra fast");
        } else if (speedValue > 1000) {
            System.out.println("extremely fast");
        }

    }
}

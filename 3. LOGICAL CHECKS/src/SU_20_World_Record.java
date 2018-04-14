import java.util.Scanner;

public class SU_20_World_Record {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double seconds = Double.parseDouble(in.nextLine());
        double distanceMeters = Double.parseDouble(in.nextLine());
        double timeSeconds = Double.parseDouble(in.nextLine());

        double total = distanceMeters * timeSeconds + Math.floor(distanceMeters / 15) * 12.5;
        if (seconds <= total) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", total - seconds);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
        }

    }
}

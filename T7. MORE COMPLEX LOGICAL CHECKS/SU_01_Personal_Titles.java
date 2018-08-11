import java.util.Scanner;

public class SU_01_Personal_Titles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double age = Double.parseDouble(in.nextLine());
        String gender = in.nextLine();

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else if (gender.equals("f")) {
                System.out.println("Miss");
            }
        }
        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }

    }
}

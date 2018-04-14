import java.util.Scanner;

public class SU_09_Password_Guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputPass = in.nextLine();

        final String PASS_VALUE = "s3cr3t!P@ssw0rd";

        if (inputPass.equals(PASS_VALUE)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}

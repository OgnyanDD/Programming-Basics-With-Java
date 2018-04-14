import java.util.Scanner;

public class SU_03_Greeting_By_Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String enterName = in.nextLine();
        System.out.printf("Hello, %s!", enterName);

    }
}

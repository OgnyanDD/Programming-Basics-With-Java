import java.util.Scanner;

public class SU_10_Number_100_200 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberValue = Integer.parseInt(in.nextLine());

        if (numberValue < 100) {
            System.out.println("Less than 100");
        } else if (numberValue >= 100 && numberValue <= 200) {
            System.out.println("Between 100 and 200");
        } else if (numberValue > 200) {
            System.out.println("Greater than 200");
        }

    }
}

import java.util.Scanner;

public class SU_04_Concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstName = in.nextLine();
        String lastName = in.nextLine();
        int age = in.nextInt();
        in.nextLine();
        String town = in.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}

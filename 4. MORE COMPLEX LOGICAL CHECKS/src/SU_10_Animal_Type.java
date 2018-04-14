import java.util.Scanner;

public class SU_10_Animal_Type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String animal = in.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            default:
                break;
        }
        switch (animal) {
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                break;
        }
        switch (animal) {
            case "others":
                System.out.println("unknown");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}

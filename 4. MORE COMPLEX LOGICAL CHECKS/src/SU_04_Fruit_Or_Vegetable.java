import java.util.Scanner;

public class SU_04_Fruit_Or_Vegetable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String entrance = in.nextLine();

        if (entrance.equals("banana") || entrance.equals("apple") ||
                entrance.equals("kiwi") || entrance.equals("cherry") || entrance.equals("lemon") || entrance.equals("grapes")) {
            System.out.println("fruit");
        } else if (entrance.equals("tomato") || entrance.equals("cucumber") || entrance.equals("pepper") || entrance.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}

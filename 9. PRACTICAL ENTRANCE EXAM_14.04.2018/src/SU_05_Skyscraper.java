import java.util.Scanner;

public class SU_05_Skyscraper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        for (int i = 0; i < number - 3; i++) {
            System.out.printf("%s%s|%s%s%n", repeatStr(" ", number - 1), repeatStr(" ", 1),
                    repeatStr(" ", 1), repeatStr(" ", number - 1));
        }
        System.out.printf("%s%s|%s%s%n", repeatStr(" ", number - 1), repeatStr("_", 1),
                repeatStr("_", 1), repeatStr(" ", number - 1));

        for (int i = 0; i < number - 3; i++) {
            System.out.printf("%s|-|%s%n", repeatStr(" ", number - 1), repeatStr(" ", number - 1));
        }
        System.out.printf("%s_|-|_%s%n", repeatStr(" ", number - 2), repeatStr(" ", number - 2));

        for (int i = 0; i < number - 3; i++) {
            System.out.printf("%s|***|%s%n", repeatStr(" ", number - 2), repeatStr(" ", number - 2));
        }
        System.out.printf("%s%s|***|%s%s%n", repeatStr(" ", 1), repeatStr("_", number - 3),
                repeatStr("_", number - 3), repeatStr(" ", 1));

        for (int i = 0; i < (number * 4) - 1; i++) {
            System.out.printf("%s%s---%s%s%n", repeatStr(" ", 1), repeatStr("|", number - 2),
                    repeatStr("|", number - 2), repeatStr(" ", 1));
        }
        System.out.printf("%s%s---%s%s%n", repeatStr("_", 1), repeatStr("|", number - 2),
                repeatStr("|", number - 2), repeatStr("_", 1));

        for (int i = 0; i < number - 2; i++) {
            System.out.printf("%s%n", repeatStr("|", (number * 2) + 1 ));
        }
    }
    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}

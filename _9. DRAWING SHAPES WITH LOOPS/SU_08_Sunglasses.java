import java.util.Scanner;

public class SU_08_Sunglasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());

        int middle = ((size + 2 - 1) / 2);

        for (int rows = 0; rows < size; rows++) {
            if (rows == 0 || rows == size - 1) {
                System.out.print(repeatStr("*", 2 * size));
                System.out.print(repeatStr(" ", size));
                System.out.print(repeatStr("*", 2 * size));
            } else {
                if (rows == middle - 1) {
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                    System.out.print(repeatStr("|", size));
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                    System.out.print(repeatStr(" ", size));
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                }
            }
            System.out.println();
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

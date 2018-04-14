import java.util.Scanner;

public class SU_09_Vowels_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int sum = 0;

        for (int count = 0; count < text.length(); count++) {
            switch (text.charAt(count)) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        System.out.println("Vowels sum = " + sum);

    }
}

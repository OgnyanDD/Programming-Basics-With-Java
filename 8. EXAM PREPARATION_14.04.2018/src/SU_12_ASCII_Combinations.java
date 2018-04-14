import java.util.Scanner;

public class SU_12_ASCII_Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numbersOfSymbols = Integer.parseInt(in.nextLine());

        String digits = "";
        String smallLetters = "";
        String largeLetters = "";
        String symbols = "";

        int sumDigits = 0;
        int sumSmallLetters = 0;
        int sumLargeLetters = 0;
        int sumSymbols = 0;


        for (int i = 0; i < numbersOfSymbols; i++) {
            char symbolInput = in.nextLine().charAt(0);
            if (symbolInput >= '0' && symbolInput <= '9') {
                sumDigits += (int) symbolInput;
                digits += symbolInput;
            } else if (symbolInput >= 'a' && symbolInput <= 'z') {
                sumSmallLetters += (int) symbolInput;
                smallLetters += symbolInput;
            } else if (symbolInput >= 'A' && symbolInput <= 'Z') {
                sumLargeLetters += (int) symbolInput;
                largeLetters += symbolInput;
            } else {
                sumSymbols += (int) symbolInput;
                symbols += symbolInput;
            }
        }
        if (sumDigits >= sumSmallLetters && sumDigits >= sumLargeLetters && sumDigits >= sumSymbols) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumDigits);
            System.out.printf("Combination of characters is:%s", digits);

        } else if (sumLargeLetters >= sumSmallLetters && sumLargeLetters >= sumSymbols) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumLargeLetters);
            System.out.printf("Combination of characters is:%s", largeLetters);

        } else if (sumSmallLetters >= sumSymbols) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumSmallLetters);
            System.out.printf("Combination of characters is:%s", smallLetters);

        } else {
            System.out.printf("Biggest ASCII sum is:%d%n", sumSymbols);
            System.out.printf("Combination of characters is:%s", symbols);
        }

    }
}

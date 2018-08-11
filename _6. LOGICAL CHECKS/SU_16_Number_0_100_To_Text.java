import java.util.Scanner;

public class SU_16_Number_0_100_To_Text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        String[] onesInEnglish = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensInEnglish = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if ((num < 0) || (num > 100)) {
            System.out.println("invalid number");
        } else if (num < 20) {
            System.out.println(onesInEnglish[num]);
        } else if (num < 100) {
            int tens = (num / 10) - 2;
            int ones = num % 10;
            if (ones > 0) {
                System.out.printf("%s %s%n", tensInEnglish[tens], onesInEnglish[ones]);
            } else {
                System.out.println(tensInEnglish[tens]);
            }
        } else {
            System.out.println("one hundred");
        }

    }
}

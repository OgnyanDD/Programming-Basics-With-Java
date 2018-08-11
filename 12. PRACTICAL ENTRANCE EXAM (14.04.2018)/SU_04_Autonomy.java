import java.util.Scanner;

public class SU_04_Autonomy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int widthRoom = Integer.parseInt(in.nextLine());
        int lenghtRoom = Integer.parseInt(in.nextLine());
        int heightRoom = Integer.parseInt(in.nextLine());

        int volumeRoom = widthRoom * lenghtRoom * heightRoom;
        int sum = 0;

        while (true) {
            String keyWord = in.nextLine();
            char i = keyWord.charAt(0);

            if (Character.isDigit(i)) {
                sum += Integer.parseInt(keyWord);
            }
            if (volumeRoom < sum) {
                System.out.println("No more free space! You need " + Math.abs(volumeRoom - sum) + " Cubic meters more.");
                break;
            } else if (keyWord.equals("Done")) {
                System.out.println(Math.abs(volumeRoom - sum) + " Cubic meters left.");
                break;
            }
        }

    }
}

import java.util.Scanner;

public class SU_07_Sum_Seconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int player1 = in.nextInt();
        int player2 = in.nextInt();
        int player3 = in.nextInt();
        int totalTime = player1 + player2 + player3;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }
}

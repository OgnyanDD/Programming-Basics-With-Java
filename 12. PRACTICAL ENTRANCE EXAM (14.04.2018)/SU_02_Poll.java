import java.text.DecimalFormat;
import java.util.Scanner;

public class SU_02_Poll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        double numberParticipants = Double.parseDouble(in.nextLine());
        double votesFirstPlace = Double.parseDouble(in.nextLine());
        final double percentSecondPlace = 0.20;
        final double percentSThirdPlace = 0.10;

        double votesSecondPlace = votesFirstPlace - (votesFirstPlace * percentSecondPlace);
        double votesThirdPlace = votesSecondPlace - (votesSecondPlace * percentSThirdPlace);
        double totalVotes = votesFirstPlace + votesSecondPlace + votesThirdPlace;
        double halfVotesFirstPlace = numberParticipants / 2;
        double total = totalVotes - halfVotesFirstPlace;

        if (totalVotes >= halfVotesFirstPlace) {
            System.out.println("First three languages have " + df.format(Math.abs(total)) + " votes more");
        } else {
            System.out.println("First three languages have " + df.format(Math.abs(total)) + " votes less of half votes");
        }

    }
}

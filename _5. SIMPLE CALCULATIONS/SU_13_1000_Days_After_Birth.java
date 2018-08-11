import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SU_13_1000_Days_After_Birth {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        String ourDate = in.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse(ourDate));
        calendar.add(Calendar.DATE, 999);
        Date newDate = calendar.getTime();
        System.out.println(dateFormat.format(newDate));

    }
}

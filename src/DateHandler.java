import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateHandler {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String currentDateTime = formatter.format(time);
        long day = 1;

        System.out.println(currentDateTime);
        Month moneht = time.getMonth();
        System.out.println(moneht);
    }
}

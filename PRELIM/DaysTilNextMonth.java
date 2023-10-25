import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH);
        String formattedDate = day.format(formatter);
        System.out.println("Current date: " + formattedDate);
    }
}
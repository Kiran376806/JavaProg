import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePrinter {

    public static void main(String[] args) {

        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate yesterday's date
        LocalDate yesterday = today.minusDays(1);

        // Calculate tomorrow's date
        LocalDate tomorrow = today.plusDays(1);

        // Define a date format (optional, for custom display)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Print the dates
        System.out.println("Yesterday: " + yesterday.format(formatter));
        System.out.println("Today:     " + today.format(formatter));
        System.out.println("Tomorrow:  " + tomorrow.format(formatter));
    }
}
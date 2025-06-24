import java.time.LocalDate;

public class DayCalcee {

    public static void main(String[] args) {
        // Define the two dates
        LocalDate date1 = LocalDate.of(2025, 6, 24);
        LocalDate date2 = LocalDate.of(2025, 6, 26); 

        LocalDate dayBetween = date1.plusDays(1);

        System.out.println("The day between " + date1 + " and " + date2 + " is: " + dayBetween);
    }
}
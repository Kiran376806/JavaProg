import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BirthDateTime {

    public static void main(String[] args) 
    {
        int birthYear = 2007;
        int birthMonth = 10;
        int birthDay = 17;
        int birthHour = 11;
        int birthMinute = 30;
        int birthSecond = 0;
        LocalDateTime birthDateTime = LocalDateTime.of(birthYear, birthMonth, birthDay, birthHour, birthMinute, birthSecond);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedBirthDateTime = birthDateTime.format(formatter);
        System.out.println("My birth date and time: " + formattedBirthDateTime);
    }
}
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Today {
    public static void print(){
        LocalDateTime todaysDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimeDay = todaysDate.format(formatter);
        System.out.println("Todays date is: " + formattedTimeDay);
    }
}

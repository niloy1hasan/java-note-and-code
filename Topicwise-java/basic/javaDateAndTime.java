import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class javaDateAndTime {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        System.out.println("today's Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        LocalDateTime dateAndtime = LocalDateTime.now();
        System.out.println("Date and time: " + dateAndtime);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MM-dd-yyyy HH:mm:ss");

        String formatedDate = dateAndtime.format(dateFormat);
        System.out.println("Formated Date: " + formatedDate);

    }
}

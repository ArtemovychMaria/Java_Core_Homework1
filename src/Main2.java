import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {

        Date date=new Date();
        System.out.println("Date:" + date);
        System.out.println("LocalDate:" + convertDatetoLocalDate(date));
        System.out.println("LocalTime:" + convertDateToLocalTime(date));
        System.out.println("LocaDateTime:" + convertDatetoLocalDateTime(date));
    }

    public static LocalDate convertDatetoLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime convertDateToLocalTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime convertDatetoLocalDateTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

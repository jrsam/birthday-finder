import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static LocalDate parseBirthday(String birthday) {
        String pattern = "yyyy/MM/dd";
        return LocalDate
                .from(DateTimeFormatter.ofPattern(pattern)
                        .parse(birthday));
    }
}

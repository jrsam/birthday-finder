import java.time.LocalDate;

public class BirthdayFinder {
    public static boolean isTodayBirthday(LocalDate birthday, LocalDate today) {
        if(birthday.isLeapYear() && birthday.getDayOfMonth() == 29 && !today.isLeapYear()
        && today.getDayOfMonth() == 28) {
            return true;
        }
        return birthday.getDayOfMonth() == today.getDayOfMonth()
                && birthday.getMonth() == today.getMonth()
                ? true : false;
    }

}

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;

public class BirthdayFinderTest {
    static Person person;
    static BirthdayFinder birthdayFinder;
    static LocalDate birthday;
    LocalDate today;

    @BeforeClass
    public static void setUp() {
        person = new Person("Sam", "J", birthday);
        birthdayFinder = new BirthdayFinder();
    }

    @Test
    public void todayIsBirthday() {
        birthday = LocalDate.of(1982, 03, 10);
        today = LocalDate.of(2023, 03, 10);

        Boolean result = birthdayFinder.isTodayBirthday(birthday, today);
        Assert.assertTrue(person.getFname() + " birthday should be today", result);
    }

    @Test
    public void todayIsNotBirthday() {
        birthday = LocalDate.of(1982, 03, 10);
        today = LocalDate.of(2023, 02, 10);

        Boolean result = birthdayFinder.isTodayBirthday(birthday, today);
        Assert.assertFalse(person.getFname() + " birthday should not be today", result);
    }

    @Test
    public void whenFeb29IsBirthdayAndNonLeapYear() {
        birthday = LocalDate.of(1992, 02, 29);
        today = LocalDate.of(2023, 02, 28);
        Boolean result = birthdayFinder.isTodayBirthday(birthday, today);
        Assert.assertTrue(person.getFname() + " birthday is 29th. So Feb 28 should be birthday in Non-leap year", result);

    }

    @Test
    public void whenFeb29IsBirthdayAndLeapYear() {
        birthday = LocalDate.of(1996, 02, 29);
        today = LocalDate.of(2024, 02, 29);

        Boolean result = birthdayFinder.isTodayBirthday(birthday, today);
        Assert.assertTrue(person.getFname() + " birthday should be today as it is leap year", result);
    }

}
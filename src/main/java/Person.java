import java.time.LocalDate;

public class Person {
    String fname;
    String lname;
    LocalDate birthday;

    public Person(String fname, String lname, LocalDate birthday) {
        this.fname = fname;
        this.lname = lname;
        this.birthday = birthday;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

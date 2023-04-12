import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        readJson();
//        readTextFile();
    }

    private static void readTextFile() throws IOException {
        InputStream inputStream = App.class.getClassLoader().getResourceAsStream("input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String inputs[] = line.split(",");
            LocalDate birthday = DateUtils.parseBirthday(inputs[2]);

            Person person = new Person(inputs[0], inputs[1], birthday);

            BirthdayFinder birthdayFinder = new BirthdayFinder();
            System.out.println(birthdayFinder.isTodayBirthday(person.getBirthday(), LocalDate.now()));

        }
    }

    public static void readJson() throws IOException {
        List<List<Person>> personList = FileUtils.getPersonList();
        System.out.println("People celebrating birthday today");
        System.out.println("---------------------------------");

        for (List item : personList) {
            Person person = new Person((String) item.get(1), (String) item.get(0), DateUtils.parseBirthday((String) item.get(2)));

            if(BirthdayFinder.isTodayBirthday(person.getBirthday(), LocalDate.now())) {
                System.out.println(person.getFname()+" "+person.getLname());
            }
        }
//        for(int i=0; i<personList.size(); i++) {
//            System.out.println(personList.get(i));
//        }
//        System.out.println(personList.size());
//        System.out.println(personList.get(0));
//        System.out.println(personList.get(1));
//        System.out.println(personList.get(2));
//        System.out.println(personList.get(3));

    }


}






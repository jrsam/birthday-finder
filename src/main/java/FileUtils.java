import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    static String filePath = "src/main/resources/inputJson";

    public static List<List<Person>> getPersonList() {
        try {
            File inputFile = new File(filePath);
            ObjectMapper objectMapper = new ObjectMapper();
            List<List<Person>> personList;
            personList = objectMapper.readValue(inputFile, List.class);
            return personList;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

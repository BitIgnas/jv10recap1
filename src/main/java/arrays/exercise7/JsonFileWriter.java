package arrays.exercise7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonFileWriter {

    private static ObjectMapper mapper = new ObjectMapper();
    private static String file = "src/main/resources/test.json";

    public static String convertToJson(List<Product> products) throws JsonProcessingException {
        return mapper.writeValueAsString(products);
    }

    public static void write(List<Product> products) throws Exception {
        String json = convertToJson(products);

       try {
           FileWriter file = new FileWriter(JsonFileWriter.file);
           file.write(json);
           file.flush();
           file.close();
       } catch (Exception e) {

       }
    }
}

package arrays.exercise7;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JsonFileReader {

    public static final List<Product> productList = getAllProductsFromJsonFile();

    public static List<Product> getAllProductsFromJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file = "src/main/resources/test.json";
            String json = readFileAsString(file);
            Product[] products = mapper.readValue(json, Product[].class);

            return new ArrayList<>(Arrays.asList(products));
        } catch (Exception e) {

        }
        return null;
    }

    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}

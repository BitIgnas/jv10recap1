package arrays.exercise7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        WarehouseWorker warehouseWorker = new WarehouseWorker();

        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Car", 23223, 32, 2),
                new Product("Chair", 23, 12, 54),
                new Product("Table", 23, 100, 233)
        ));

        JsonFileWriter.write(products);

    }
}

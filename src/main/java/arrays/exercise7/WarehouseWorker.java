package arrays.exercise7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

public class WarehouseWorker {

    public static final List<Product> productFinal = JsonFileReader.productList;

    private static List<Product> initProducts() {
        return new ArrayList<>(Arrays.asList(
                new Product("Phone", 300.5, 0.2, 180),
                new Product("Table", 200, 3.2, 50),
                new Product("Camera", 400, 1.3, 30),
                new Product("House", 345454, 2000, 3),
                new Product("Timber", 32, 0.5, 8),
                new Product("Computer", 700, 1.6, 1),
                new Product("Car", 3004, 187, 22),
                new Product("Plane", 232345, 1442, 1),
                new Product("Nails", 0.5, 0.1, 908),
                new Product("Headphones", 2323, 0.4, 56)
        ));
    }

    public Optional<Product> findMostExpensive(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getPrice));
    }

    public Optional<Product> findCheapestExpensive(List<Product> products) {
        return products.stream().min(Comparator.comparing(Product::getPrice));
    }

    public Optional<Product> findHeaviestProduct(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getWeight));
    }

    public Optional<Product> findBiggestQuantity(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getQuantity));
    }

    public double findAveragePrice() {
        return productFinal.stream().mapToDouble(Product::getPrice).average().getAsDouble();
    }

    public void viewAllProducts() {
        productFinal.forEach(System.out::println);
    }

    public void updateProduct(Product product, List<Product> productList) {
        productList.stream()
                .filter(productToUpdate -> productToUpdate.getName().equals(product.getName()))
                .forEach(product1 -> {
                    product1.setName(product.getName());
                    product1.setPrice(product.getPrice());
                    product1.setWeight(product.getWeight());
                    product1.setQuantity(product.getQuantity());
                });
    }

    public void deleteProductByName(String name, List<Product> productList) {
        productList.removeIf(product -> product.getName().equals(name));
    }
}

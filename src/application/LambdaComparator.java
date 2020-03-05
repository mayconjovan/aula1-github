package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import model.services.ProductService;

public class LambdaComparator {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;
        /*
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);

    List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

    names.forEach(System.out::println);
         */

        ProductService ps = new ProductService();
        
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
        
        System.out.println("Sum = " + String.format("%.2f", sum));
    }

}

package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class SecondProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter product data.");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Price:");
        double price = sc.nextDouble();
       
        System.out.println();
        
        Product product = new Product(name, price);
        
        product.setName("Computador");
        
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }

}

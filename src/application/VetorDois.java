package application;

import entities.Product;
import entities.ProductVetorDois;
import java.util.Locale;
import java.util.Scanner;

public class VetorDois {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductVetorDois[] vect = new ProductVetorDois[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVetorDois(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        
        double avg = sum / n;
        
        System.out.printf("Avarage price: %.2f%n", avg);

        sc.close();
    }
}

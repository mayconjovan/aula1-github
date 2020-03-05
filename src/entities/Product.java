package entities;

import java.util.List;
import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int quantity;
    
    public Product(){
    
    }
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;    
    }
    
     public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {

        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
    public  void nonStaticPriceUpdate() {
       price = price * 1.1;
    }
    
    public double filteredSum(List<Product> list) {
        double sum = 0.0;
        for (Product p : list) {
            if (p.getName().charAt(0) == 'T') {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

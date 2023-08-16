package lexicon;

import lexicon.data.VendingMachineImpl;
import lexicon.model.Drinks;
import lexicon.model.Product;
import lexicon.model.Snacks;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Snacks snickers = new Snacks(1, 20, "Snickers");
        Drinks cola = new Drinks(2, 30, "Coca-Cola");
        Snacks mars = new Snacks(3, 10, "Mars");
        Product[] products = new Product[3];
        products[0] = snickers;
        products[1] = cola;
        products[2] = mars;
        VendingMachineImpl sjukhuset = new VendingMachineImpl(products);

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product id: " + products[i].getId() + ", Product Name: " + products[i].getProductName() + ", Price: " + products[i].getPrice());
        }

        sjukhuset.addCurrency(50);
        System.out.println(sjukhuset.getBalance());

        System.out.println("\nRequest #1");
        Product product1 = sjukhuset.request(1);
        if (product1 == null) {
            System.out.println("Out of stock");
        } else if (sjukhuset.getBalance() < 0) {
            System.out.println(sjukhuset.getBalance());
            System.out.println(product1.getPrice());
            System.out.println("Not enough money!");
        } else {
            System.out.println(product1.use());
            System.out.println(sjukhuset.getBalance());
            System.out.println("You just bought a " + product1.getProductName());
        }

        System.out.println("\nRequest #2");
        System.out.println(sjukhuset.getBalance());

        Product product2 = sjukhuset.request(2);
        if (product2 == null) {
            System.out.println("Out of stock");
        } else if (sjukhuset.getBalance() < 0) {
            System.out.println(sjukhuset.getBalance());
            System.out.println(product2.getPrice());
            System.out.println("Not enough money!");
        } else {
            System.out.println(product2.use());
            System.out.println(sjukhuset.getBalance());
            System.out.println("You just bought a " + product2.getProductName());
        }
        System.out.println("\nRequest #3");
        System.out.println(sjukhuset.getBalance());

        Product product3 = sjukhuset.request(3);
        if (product3 == null) {
            System.out.println("Out of stock");
        } else if (sjukhuset.getBalance() < 0) {
            System.out.println(sjukhuset.getBalance());
            System.out.println(product3.getPrice());
            System.out.println("Not enough money!");
        } else {
            System.out.println(product3.use());
            System.out.println(sjukhuset.getBalance());
            System.out.println("You just bought a " + product3.getProductName());
        }
    }
}
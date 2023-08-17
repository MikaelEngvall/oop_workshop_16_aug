package lexicon.data;

import lexicon.model.Product;

public class VendingMachineImpl implements VendingMachine {

    // ******
    // Fields
    // ******

    private Product[] products;
    private int depositPool;

    // **************
    // Constructor(s)
    // **************

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    // *******
    // Methods
    // *******
    @Override
    public void addCurrency(int amount) {
        switch (amount) {
            case 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000:
                depositPool += amount;
                System.out.println("You added " + amount + " to your balance");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }

    // *****************
    // Getters & Setters
    // *****************
    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                }
                return product;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        depositPool = 0;
        return 0;
    }

    @Override
    public String getDescription(Product id) {
        return null;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println("Product #" + product.getId() + " is " + product.getProductName() + " and costs " + product.getPrice() + " kr a piece");
            }
        }
        return null;
    }

    @Override
    public Product[] getProducts() {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product[i])!=null)
                System.out.println(products);
        }

        return products;
    }
}
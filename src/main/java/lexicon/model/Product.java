package lexicon.model;

public abstract class Product {

    // ******
    // Fields
    // ******

    private final int id;
    private final int price;
    private final String productName;

    // **************
    // Constructor(s)
    // **************

    public Product(int id, int price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    // *******
    // Methods
    // *******

    public abstract String examine();
    public abstract String use();

    // *****************
    // Getters & Setters
    // *****************


    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
}
package lexicon.data;

import lexicon.model.Product;

public interface VendingMachine {

    void addCurrency(int amount);

    int getBalance();

    Product request(int id);

    int endSession();

    String getDescription(Product id);

    String getDescription(int id);

    Product[] getProducts();
}
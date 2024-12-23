package org.example.dayOne.solidAssignment;

import java.util.HashMap;
import java.util.Map;

public class Product implements IStockManager {
    private String name;
    private int price;
    private static int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        Product.stock = stock;
    }

    public Map<String, String> getDetails() {
        Map<String, String> productInfo = new HashMap<>();
        productInfo.put("Name", name);
        productInfo.put("price", Integer.toString(price));
        productInfo.put("Stock", Integer.toString(stock));

        return productInfo;
    }

    public void reduceStock(int quantity) throws Exception {
        if (quantity < stock) {
            stock = stock - quantity;
        } else
            throw new Exception("Reduced quantity is more than current stock");
    }

    @Override
    public int checkStock() {
        return stock;
    }

    @Override
    public void updateStock() {
//        stock =
    }
}

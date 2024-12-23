package org.example.dayOne.solidAssignment;

public class Order {
    void addProduct(Product product, IPaymentProcessor paymentProcessor) throws Exception {
        new OrderProcessor().processOrder(1, paymentProcessor, product);

    }

    void addMultipleProduct(int numProducts, Product product, IPaymentProcessor paymentProcessor) throws Exception {
        new OrderProcessor().processOrder(numProducts, paymentProcessor, product);
    }
}

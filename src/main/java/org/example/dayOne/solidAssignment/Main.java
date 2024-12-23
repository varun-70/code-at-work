package org.example.dayOne.solidAssignment;

public class Main {
    public static void main(String[] args) throws Exception {
        Order order = new Order();
        Product product = new Product("Shoe", 1000, 10);
        IPaymentProcessor paymentProcessor = new CreditCardProcessor();

        order.addProduct(product, paymentProcessor);
        order.addMultipleProduct(2, product, paymentProcessor);
    }
}

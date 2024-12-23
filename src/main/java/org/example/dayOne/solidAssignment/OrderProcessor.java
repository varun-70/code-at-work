package org.example.dayOne.solidAssignment;

public class OrderProcessor {
    void processOrder(int order, IPaymentProcessor paymentProcessor, Product product) throws Exception {
        if (product.checkStock() >= order) {
            paymentProcessor.processPayment(Integer.parseInt(product.getDetails().get("price")));
            new InvoiceGenerator().generateInvoice(order);
            product.reduceStock(order);
        } else
            throw new Exception("Not enough stock");
    }
}

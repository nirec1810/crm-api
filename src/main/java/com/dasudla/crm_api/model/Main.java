package com.dasudla.crm_api.model;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1L, "Juan Pérez", "juan@example.com", "0999999999",
                "Quito", "CUST001", "1728392012", TaxIdType.CEDULA, CustomerType.REGULAR);

        Product product = new Product(10L, "Laptop Lenovo", 950.0f, "laptop.png");

        SaleOrder order = new SaleOrder(100L, "SO-001", 950.0f, Calendar.getInstance(),
                OrderStatus.PENDING, customer);

        OrderLine line = new OrderLine(1L, product, 1, order);
        order.getOrderLines().add(line);

        Payment payment = new Payment(1L, order, 950.0f, Calendar.getInstance(), PaymentMethod.CASH);
        order.getPayments().add(payment);

        System.out.println(customer);
        System.out.println(product);
        System.out.println(order);
        System.out.println(line);
        System.out.println(payment);
    }
}
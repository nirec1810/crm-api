package com.dasudla.crm_api.model;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class SaleOrder {
    private Long id;
    private String refNumber;
    private Float total;
    private Calendar registDate;
    private OrderStatus status;
    private Customer customer;
    private Set<OrderLine> orderLines = new HashSet<>();
    private Set<Payment> payments = new HashSet<>();

    public SaleOrder() {
    }

    public SaleOrder(Long id, String refNumber, Float total, Calendar registDate,
                     OrderStatus status, Customer customer) {
        this.id = id;
        this.refNumber = refNumber;
        this.total = total;
        this.registDate = registDate;
        this.status = status;
        this.customer = customer;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRefNumber() { return refNumber; }
    public void setRefNumber(String refNumber) { this.refNumber = refNumber; }

    public Float getTotal() { return total; }
    public void setTotal(Float total) { this.total = total; }

    public Calendar getRegistDate() { return registDate; }
    public void setRegistDate(Calendar registDate) { this.registDate = registDate; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Set<OrderLine> getOrderLines() { return orderLines; }
    public void setOrderLines(Set<OrderLine> orderLines) { this.orderLines = orderLines; }

    public Set<Payment> getPayments() { return payments; }
    public void setPayments(Set<Payment> payments) { this.payments = payments; }

    @Override
    public String toString() {
        return "SaleOrder{" +
                "id=" + id +
                ", refNumber='" + refNumber + '\'' +
                ", total=" + total +
                ", status=" + status +
                ", customer=" + String.valueOf(customer) +
                '}';
    }
}
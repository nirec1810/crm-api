package com.dasudla.crm_api.model;
import java.util.Calendar;


public class Payment {
    private Long id;
    private SaleOrder saleOrder;
    private Float amount;
    private Calendar paydate;
    private PaymentMethod paymentMethod;

    public Payment() {
    }

    public Payment(Long id, SaleOrder saleOrder, Float amount, Calendar paydate, PaymentMethod paymentMethod) {
        this.id = id;
        this.saleOrder = saleOrder;
        this.amount = amount;
        this.paydate = paydate;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public SaleOrder getSaleOrder() { return saleOrder; }
    public void setSaleOrder(SaleOrder saleOrder) { this.saleOrder = saleOrder; }

    public Float getAmount() { return amount; }
    public void setAmount(Float amount) { this.amount = amount; }

    public Calendar getPaydate() { return paydate; }
    public void setPaydate(Calendar paydate) { this.paydate = paydate; }

    public PaymentMethod getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(PaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}

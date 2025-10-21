package com.dasudla.crm_api.model;

public class OrderLine {
    private Long id;
    private Product product;
    private Integer quantity;
    private SaleOrder saleOrder;

    public OrderLine() {
    }

    public OrderLine(Long id, Product product, Integer quantity, SaleOrder saleOrder) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.saleOrder = saleOrder;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public SaleOrder getSaleOrder() { return saleOrder; }
    public void setSaleOrder(SaleOrder saleOrder) { this.saleOrder = saleOrder; }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}

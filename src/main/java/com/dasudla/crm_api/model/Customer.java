package com.dasudla.crm_api.model;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;

    private String customerCode;
    private String taxId;
    private TaxIdType taxIdType;
    private CustomerType customerType;
    private Set<SaleOrder> saleOrders = new HashSet<>();

    public Customer() {
    }

    public Customer(Long id, String name, String email, String phone, String address,
                    String customerCode, String taxId, TaxIdType taxIdType,
                    CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.customerCode = customerCode;
        this.taxId = taxId;
        this.taxIdType = taxIdType;
        this.customerType = customerType;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCustomerCode() { return customerCode; }
    public void setCustomerCode(String customerCode) { this.customerCode = customerCode; }

    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }

    public TaxIdType getTaxIdType() { return taxIdType; }
    public void setTaxIdType(TaxIdType taxIdType) { this.taxIdType = taxIdType; }

    public CustomerType getCustomerType() { return customerType; }
    public void setCustomerType(CustomerType customerType) { this.customerType = customerType; }

    public Set<SaleOrder> getSaleOrders() { return saleOrders; }
    public void setSaleOrders(Set<SaleOrder> saleOrders) { this.saleOrders = saleOrders; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", taxId='" + taxId + '\'' +
                ", taxIdType=" + taxIdType +
                ", customerType=" + customerType +
                ", name='" + getName() + '\'' +
                '}';
    }
}
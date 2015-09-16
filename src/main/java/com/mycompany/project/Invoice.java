package com.mycompany.project;

import java.math.BigDecimal;
import java.util.Map;

public class Invoice {

    private String id;

    private BigDecimal total = BigDecimal.ZERO;

    private Map<Product, Integer> products;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}

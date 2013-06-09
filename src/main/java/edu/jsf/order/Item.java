package edu.jsf.order;

import java.io.Serializable;

public class Item implements Serializable {
    
    private Product product;
    private double quantity;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
    
    public double getTotal(){
        return this.quantity * product.getPrice();
    }
}

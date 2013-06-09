package edu.jsf.order;

import java.io.Serializable;

public class Product implements Serializable {

    private Integer id;
    private double price;
    private String name;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", name=" + name + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id =id;
    }
}

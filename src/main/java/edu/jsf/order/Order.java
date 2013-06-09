package edu.jsf.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Product product, int quantity) {
        if (items == null)
            items = new ArrayList<Item>();
        Item item = new Item();
        item.setProduct(product);
        item.setQuantity(quantity);
        this.items.add(item);
    }
}

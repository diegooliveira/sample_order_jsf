package edu.jsf.order;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository {
    
    private String[] names = { "Geladeira", "Fogão", "Micoondas", "Maquina de Lava"};
    private String[] brands = { "Sony", "Brastemp", "Philco"};
    
    List<Product> products;
    
    public ProductRepository() {
        products = new LinkedList<Product>();
        for (int i = 0; i < 10; i++) {
            final Product prod = new Product();
            prod.setId(i);
            prod.setPrice(Math.random() * 100);
            prod.setName( makeRandomName() );
            products.add(prod);
        }
    }

    public Product findById(Integer id) {
        for (Product product : products)
            if(product.getId().equals(id))
                return product;
        return null;
    }

    public List<Product> findByNameLike(String name) {
        List<Product> aux = new ArrayList<Product>();
        for (Product product : products)
            if (product.getName().toUpperCase().contains(name.toUpperCase()))
                aux.add(product);
        return aux;
    }

    private String makeRandomName() {
        String name = getFrom(names) + " " + getFrom(brands);
        return name;
    }

    private String getFrom(String[] names) {
        return names[(int)(Math.random() * (names.length -1))];
    }
}

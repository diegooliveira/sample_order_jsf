package edu.jsf.order;



import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean
public class OrderController implements Serializable {
    private Product product;
    private Order order;
    private int productQuantity = 1;
    
    public void setProduct(Product product) {
        System.out.println("setProduct");
        this.product = product;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public List<Product> listProducts(String name){
        
        ProductRepository prodRepo = Repositories.of(ProductRepository.class);
        
        return prodRepo.findByNameLike(name);
    }

    public void addItemToOrder(){
        if (order == null)
            order = new Order();
        order.add(product, productQuantity);
        System.out.println("Adicounou" + product);
        this.product = null;
        this.productQuantity = 1;
    }
    
}

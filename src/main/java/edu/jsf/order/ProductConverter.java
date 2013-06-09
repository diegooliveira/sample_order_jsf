package edu.jsf.order;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Product.class)
public class ProductConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null)
            return null;
        Integer value = new Integer(string);
        ProductRepository repo = Repositories.of(ProductRepository.class);
        return repo.findById(value);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return String.valueOf(((Product) o).getId());
    }
}

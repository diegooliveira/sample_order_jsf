package edu.jsf.order;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Repositories {
    
    public static <T> T of(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception ex) {
            return null;
        }
    }
    
}

package Prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase;

    public Manager() {
        showcase = new HashMap<>();
    }

    public void register(String name, Product product){
        showcase.put(name, product);
    }

    public Product create(String name) throws CloneNotSupportedException {
        Product product = showcase.get(name);
        return product.createClone();
    }

}

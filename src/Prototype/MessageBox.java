package Prototype;

import Prototype.framework.Product;

public class MessageBox implements Product {

    @Override
    public void use(String s) {
        System.out.println("MessageBox using string " + s);
    }

    @Override
    public Product createClone() throws CloneNotSupportedException {
        return (Product) this.clone();
    }
}

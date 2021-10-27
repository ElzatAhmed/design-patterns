package Prototype;

import Prototype.framework.Product;

public class UnderlinePen implements Product {
    @Override
    public void use(String s) {
        System.out.println("UnderlinePen using string " + s);
    }

    @Override
    public Product createClone() throws CloneNotSupportedException {
        return (Product) this.clone();
    }
}

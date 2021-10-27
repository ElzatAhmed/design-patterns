package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager();
        manager.register("MessageBox", new MessageBox());
        manager.register("UnderlinePen", new UnderlinePen());
        Product p = manager.create("MessageBox");
        p.use("hello world");
        p = manager.create("UnderlinePen");
        p.use("hello world");
    }

}

package flyweight;

import flyweight.model.Phone;
import flyweight.model.PhoneFactory;

public class Main {

    public static void main(String[] args) {
        PhoneFactory factory = PhoneFactory.getInstance();
        Phone p1 = factory.getPhone("p1");
        Phone p2 = factory.getPhone("p2");
        Phone p3 = factory.getPhone("p1");
        Phone p4 = factory.getPhone("p2");
        System.out.println(p1 == p3 && p2 == p4);
    }

}

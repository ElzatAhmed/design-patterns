package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.idcard.IdCard;
import factoryMethod.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        IdCard product = (IdCard) factory.create("Elzat");
        product.use();
        System.out.println(product.getOwner());
    }

}

package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IdCard extends Product {

    private String owner;

    IdCard(String owner){
        System.out.println("creating " + owner + "`s id card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("using " + owner + "`s id card");
    }

    public String getOwner() {
        return owner;
    }
}

package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {

    private List<String> owners;

    public IdCardFactory() {
        this.owners = new ArrayList<>();
    }

    @Override
    public Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IdCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}

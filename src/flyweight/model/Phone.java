package flyweight.model;

public class Phone {

    private String brand;

    Phone(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

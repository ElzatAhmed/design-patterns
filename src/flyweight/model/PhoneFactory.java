package flyweight.model;

import java.util.HashSet;
import java.util.Set;

public class PhoneFactory {

    private Set<Phone> phonePool;

    private static PhoneFactory phoneFactory = new PhoneFactory();

    private PhoneFactory(){
        phonePool = new HashSet<>();
    }

    public static PhoneFactory getInstance(){
        return phoneFactory;
    }

    public Phone getPhone(String brand){
        for(Phone phone : phonePool){
            if(phone.getBrand().equals(brand))
                return phone;
        }
        Phone phone = new Phone(brand);
        phonePool.add(phone);
        return phone;
    }

}

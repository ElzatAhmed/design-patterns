package abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{

    protected List<Item> items;

    public Tray(String caption) {
        super(caption);
        items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }
}

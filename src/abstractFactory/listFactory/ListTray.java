package abstractFactory.listFactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("tray ").append(super.caption).append(":\n");
        for(Item i : super.items){
            buffer.append(i.makeHtml()).append("\n");
        }
        return buffer.toString();
    }
}

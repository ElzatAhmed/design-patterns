package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        Factory factory = Factory.getFactory("abstractFactory.listFactory.ListFactory");
        Tray tray = factory.createTray("t");
        tray.add(factory.createLink("l1", "www.baidu.com"));
        tray.add(factory.createLink("l2", "www.github.com"));
        Page page = factory.createPage("title", "Elzat");
        page.add(tray);
        System.out.println(page.makeHtml());
    }

}

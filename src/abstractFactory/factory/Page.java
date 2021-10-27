package abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> content;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new ArrayList<>();
    }

    public void add(Item item){
        this.content.add(item);
    }

    public void output(){
        System.out.println(this.makeHtml());
    }

    public abstract String makeHtml();
}

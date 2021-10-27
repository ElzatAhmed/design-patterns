package abstractFactory.listFactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("title: ").append(super.title).append("\n");
        builder.append("author: ").append(super.author).append("\n");
        for(Item i : super.content){
            builder.append(i.makeHtml()).append("\n");
        }
        return builder.toString();
    }
}

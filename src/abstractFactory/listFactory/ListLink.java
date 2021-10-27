package abstractFactory.listFactory;

import abstractFactory.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "link " + super.caption + ": <" + super.url + ">";
    }
}

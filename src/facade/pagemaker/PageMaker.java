package facade.pagemaker;

public class PageMaker {

    private PageMaker(){}

    public static void make(String mail){
        String name = Database.getProperties(mail);
        new HtmlWriter().write(name);
    }

}

package abstractFactory.factory;

public abstract class Factory {

    public static Factory getFactory(String name){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(name).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}

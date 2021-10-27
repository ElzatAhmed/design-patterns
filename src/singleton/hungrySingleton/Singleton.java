package singleton.hungrySingleton;

public class Singleton {

    private final static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("initiated a singleton");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

package singleton.doubleCheck;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
        System.out.println("initiated a singleton");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}

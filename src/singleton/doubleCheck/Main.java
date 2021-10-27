package singleton.doubleCheck;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new CreationThread(5));
        Thread t2 = new Thread(new CreationThread(5));
        Thread t3 = new Thread(new CreationThread(5));
        t1.start();
        t2.start();
        t3.start();
    }

}

class CreationThread implements Runnable{

    public int count;

    public CreationThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            Singleton s = Singleton.getInstance();
        }
    }
}

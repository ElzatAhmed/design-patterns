package observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.print(GraphObserver.class + ": ");
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

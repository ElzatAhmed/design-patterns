package observer;

public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        generator.addObserver(o1);
        generator.addObserver(o2);
        generator.execute();
    }

}

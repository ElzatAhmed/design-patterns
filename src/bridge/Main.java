package bridge;

public class Main {

    public static void main(String[] args) {
        CountDisplay display = new CountDisplay(new StringDisplayImpl());
        display.multiDisplay(5);
    }

}

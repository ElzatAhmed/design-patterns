package bridge;

public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int count){
        super.open();
        for (int i = 0; i < count; i++) {
            super.print();
        }
        super.close();
    }
}

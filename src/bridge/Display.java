package bridge;

public class Display {

    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open(){
        display.rawOpen();
    }

    public void print(){
        display.rawPrint();
    }

    public void close(){
        display.rawClose();
    }
}

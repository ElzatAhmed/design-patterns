package templateMethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay display = new StringDisplay("string display");
        display.display(1);
        display = new CharDisplay('c');
        display.display(1);
    }

}

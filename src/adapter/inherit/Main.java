package adapter.inherit;

public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello world");
        print.printWeak();
        print.printStrong();
    }

}

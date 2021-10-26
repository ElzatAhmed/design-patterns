package adapter.authorize;

public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner(new Banner("Hello world"));
        print.printWeak();
        print.printStrong();
    }

}

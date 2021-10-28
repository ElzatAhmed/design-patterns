package decorator;

public class Main {

    public static void main(String[] args) {
        Display display = new FullBorder(
                new SideBorder(
                        new StringDisplay("Hello world"), '!'
                )
        );
        display.show();
    }

}

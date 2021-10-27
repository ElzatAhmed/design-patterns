package builder;

public class Main {

    public static void main(String[] args) {
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getResult());
    }

}

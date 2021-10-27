package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("title");
        builder.makeString("string");
        builder.makeItems(new String[]{"i1", "i2", "i3"});
        builder.close();
    }
}

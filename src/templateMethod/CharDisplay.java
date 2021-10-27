package templateMethod;

public class CharDisplay extends AbstractDisplay{

    private Character character;

    public CharDisplay(Character character){
        this.character = character;
    }

    @Override
    public void open() {
        System.out.print("<");
    }

    @Override
    public void print() {
        System.out.print(character);
    }

    @Override
    public void close() {
        System.out.println(">");
    }
}

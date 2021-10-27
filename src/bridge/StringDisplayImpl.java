package bridge;

public class StringDisplayImpl implements DisplayImpl{
    @Override
    public void rawOpen() {
        System.out.println("open");
    }

    @Override
    public void rawPrint() {
        System.out.println("print");
    }

    @Override
    public void rawClose() {
        System.out.println("close");
    }
}

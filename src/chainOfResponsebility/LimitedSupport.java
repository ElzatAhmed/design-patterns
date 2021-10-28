package chainOfResponsebility;

public class LimitedSupport extends Support{

    private int limit;

    public LimitedSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() <= limit;
    }
}

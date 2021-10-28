package chainOfResponsebility;

public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support support){
        next = support;
        return next;
    }

    public final void support(Trouble trouble){
        boolean solved = resolve(trouble);
        if(solved) {
            solved(trouble);
            return;
        }
        if (next == null){
            failed(trouble);
            return;
        }
        next.support(trouble);
    }

    protected abstract boolean resolve(Trouble trouble);

    protected final void solved(Trouble trouble){
        System.out.println(trouble.toString() + " has been solved by support " + name);
    }

    protected final void failed(Trouble trouble){
        System.out.println("support " + name + " attempted to solve trouble " + trouble + " and failed");
    }
}

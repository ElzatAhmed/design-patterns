package templateMethod;

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(int count){
        open();
        for(int i = 0; i < count; i++)
            print();
        close();
    }

}

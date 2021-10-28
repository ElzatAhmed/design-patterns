package state;

public interface Context {

    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void log(String msg);

}

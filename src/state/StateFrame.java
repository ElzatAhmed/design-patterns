package state;

public class StateFrame implements Context{

    private int clock;

    private State state;

    public StateFrame(){
        clock = 9;
        state = DayState.getInstance();
    }

    public void use(){
        state.doUse(this);
    }

    public void security(){
        state.doAlarm(this);
    }

    public void phone(){
        state.doPhone(this);
    }

    @Override
    public void setClock(int hour) {
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        System.out.println("calling security center with msg " + msg);
    }

    @Override
    public void log(String msg) {
        System.out.println("log: " + msg);
    }
}

package state;

public class DayState implements State{

    private static final DayState dayState = new DayState();

    private DayState(){}

    public static DayState getInstance(){
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || hour >= 17)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.log("using in day time");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("calling security center in day time");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("using phone in day time");
    }

    @Override
    public String toString() {
        return "DayTime";
    }
}

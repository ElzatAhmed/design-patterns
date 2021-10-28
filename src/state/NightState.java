package state;

public class NightState implements State{

    private static final NightState nightState = new NightState();

    private NightState(){}

    public static NightState getInstance(){
        return nightState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour >= 9 && hour < 17)
            context.changeState(DayState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("emergency! using in night time");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("calling security center in night time");
    }

    @Override
    public void doPhone(Context context) {
        context.log("phone at night time");
    }

    @Override
    public String toString() {
        return "NightTime";
    }
}

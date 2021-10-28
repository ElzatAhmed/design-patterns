package state;

public class Main {

    public static void main(String[] args) {
        StateFrame stateFrame = new StateFrame();
        stateFrame.use();
        stateFrame.phone();
        stateFrame.log("123456");
        stateFrame.setClock(18);
        stateFrame.use();
    }
}

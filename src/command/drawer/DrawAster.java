package command.drawer;

import command.command.MacroCommand;

public class DrawAster implements Drawable{

    private MacroCommand history;

    public DrawAster(MacroCommand history){
        this.history = history;
    }

    public void paint(){
        history.execute();
    }

    @Override
    public void draw(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

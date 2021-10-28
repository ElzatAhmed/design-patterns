package command;

import command.command.MacroCommand;
import command.drawer.DrawAster;
import command.drawer.DrawCommand;

public class Main {

    public static void main(String[] args) {
        MacroCommand history = new MacroCommand();
        DrawAster drawable = new DrawAster(history);
        history.append(new DrawCommand(drawable, 5));
        history.append(new DrawCommand(drawable, 10));
        drawable.paint();
    }

}

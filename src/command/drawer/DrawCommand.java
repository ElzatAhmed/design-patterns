package command.drawer;

import command.command.Command;

public class DrawCommand implements Command {

    protected Drawable drawable;
    private int count;

    public DrawCommand(Drawable drawable, int count) {
        this.drawable = drawable;
        this.count = count;
    }

    @Override
    public void execute() {
        drawable.draw(count);
    }
}

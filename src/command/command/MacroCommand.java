package command.command;

import java.util.Stack;

public class MacroCommand implements Command{

    private Stack<Command> commands;

    public MacroCommand(){
        commands = new Stack<>();
    }

    @Override
    public void execute() {
        for(Command command : commands)
            command.execute();
    }

    public void append(Command cmd){
        if(cmd == this) return;
        commands.push(cmd);
    }

    public void undo(){
        if(commands.empty()) return;
        commands.pop();
    }

    public void clear(){
        commands.clear();
    }
}

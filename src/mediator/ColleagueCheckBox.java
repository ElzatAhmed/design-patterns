package mediator;

import java.awt.*;
import java.awt.event.ItemEvent;

public class ColleagueCheckBox extends Checkbox implements Colleague {

    private Mediator mediator;

    public ColleagueCheckBox(String text, CheckboxGroup group, boolean state){
        super(text, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e){
        mediator.colleagueChanged();
    }
}

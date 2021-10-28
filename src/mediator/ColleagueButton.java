package mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String text){
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }
}

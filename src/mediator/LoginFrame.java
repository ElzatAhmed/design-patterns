package mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {

    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkUser;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton okButton;
    private ColleagueButton cancelButton;

    public LoginFrame(String title){
        super(title);
        super.setBackground(Color.LIGHT_GRAY);
        super.setLayout(new GridLayout(4, 2));
        createColleagues();
        super.add(checkGuest);
        super.add(checkUser);
        super.add(new Label("user name: "));
        super.add(textUser);
        super.add(new Label("password: "));
        super.add(textPass);
        super.add(okButton);
        super.add(cancelButton);
        colleagueChanged();
        super.pack();
        super.setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckBox("guest", g, true);
        checkUser = new ColleagueCheckBox("user", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        okButton = new ColleagueButton("ok");
        cancelButton = new ColleagueButton("cancel");

        checkGuest.setMediator(this);
        checkUser.setMediator(this);
        textPass.setMediator(this);
        textUser.setMediator(this);
        okButton.setMediator(this);
        cancelButton.setMediator(this);

        checkGuest.addItemListener(e -> checkGuest.itemStateChanged(e));
        checkUser.addItemListener(e -> checkUser.itemStateChanged(e));
        textUser.addTextListener(e -> textUser.textValueChanged(e));
        textPass.addTextListener(e -> textPass.textValueChanged(e));
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            okButton.setColleagueEnabled(true);
        }
        else {
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if(textUser.getText().length() > 0){
            textPass.setColleagueEnabled(true);
            okButton.setColleagueEnabled(textPass.getText().length() > 0);
        }
        else {
            textUser.setColleagueEnabled(false);
            okButton.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}

package task;

import actions.click;
import ui.homePage;
public class login extends homePage{
    click clickAction;


    public void login(){
       clickAction.clicking(btnIconUser);
    }
}

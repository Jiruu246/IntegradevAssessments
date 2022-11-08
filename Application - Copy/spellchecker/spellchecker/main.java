package spellchecker;

import spellchecker.interfaces.IViewInterface;
import spellchecker.views.UserInterface;

public class main {
    public static void main(String[] args){
        IViewInterface ui = new UserInterface();

        Launcher controller = new Launcher(ui);

        controller.start();

    }
}

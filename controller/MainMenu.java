package controller;

import views.Menu;

public class MainMenu extends Menu {
    static String[] menu = { "Count letter", "Count character", "Exit" };

    public MainMenu() {
        super("Menu", menu);
    }

    @Override
    public void excute(int n, int olen) {
        switch (n) {
            case 1:
                Count.cLetter();
                break;
            case 2:
                Count.cChar();
                break;
        }
    }
}

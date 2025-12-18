package se.bjan.menu;

import se.adlez.game.*;

public class PrintForest extends MenuItem {

    public PrintForest(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        //System.out.println(forest);
        System.out.println(forest.getGamePlan());
    }
}

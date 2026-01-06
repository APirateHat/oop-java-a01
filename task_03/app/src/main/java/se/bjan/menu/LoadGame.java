package se.bjan.menu;

import se.adlez.game.*;

public class LoadGame extends MenuItem {
    public LoadGame(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = ForestToFile.load("forest.ser");
        manager.setForest(forest);
        System.out.println("Game Loaded!💾");
    }
}

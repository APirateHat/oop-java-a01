package se.bjan.menu;

import se.adlez.game.*;

public class SaveGame extends MenuItem {
    public SaveGame(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        ForestToFile.save(forest, "forest.ser");
        System.out.println("Game Saved!💾");
    }
}

package se.bjan.menu;

import se.adlez.game.*;

public class SaveAsJson extends MenuItem {
    public SaveAsJson(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        ForestToJson.saveAsJson(forest);
    }
}

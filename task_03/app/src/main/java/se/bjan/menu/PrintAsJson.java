package se.bjan.menu;

import se.adlez.game.*;

public class PrintAsJson extends MenuItem {
    public PrintAsJson(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        String json = ForestToJson.printAsJson(forest);
        System.out.println(json);
    }
}

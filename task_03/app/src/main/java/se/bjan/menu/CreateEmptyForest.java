package se.bjan.menu;

import se.adlez.game.*;

public class CreateEmptyForest extends MenuItem{
    
    public CreateEmptyForest(String title, String symbol){
        super(title, symbol);
    }
    
    public void run(){
        Forest forest = new Forest();
        System.out.println(forest);
        manager.addForest(forest);
        forest.init();
    }
}

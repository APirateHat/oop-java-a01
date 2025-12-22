package se.bjan.menu;

import se.adlez.game.*;

public class ListItems extends MenuItem {
    
    public ListItems(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        System.out.println(forest.listItems());
    }
}

package se.bjan.menu;

import se.adlez.game.*;

public class AddPlayerHunterHome extends MenuItem{
    public AddPlayerHunterHome(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        AbstractMoveableItem player = new Robot(new Position(0,0));
        AbstractMoveableItem wolf = new Wolf(new Position(5,5));
        AbstractMoveableItem home = new Castle(new Position(9,9));
        forest.addPlayerItem(player);
        forest.addHomeItem(home);
        forest.addHunterItem(wolf);
    }
}

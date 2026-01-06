package se.bjan.menu;

import se.adlez.game.Forest;

public class GameManager {
    private Forest forest;

    public void setForest(Forest forest){
        this.forest = forest;
    }

    public Forest getForest(){
        return forest;
    }
}

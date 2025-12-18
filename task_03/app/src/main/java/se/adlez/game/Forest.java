package se.adlez.game;

import java.util.HashMap;
import java.util.Map;

public class Forest {
    private int WIDTH = 10;
    private int HEIGHT = 10;
    private Map <Position, Item> items = new HashMap<>();
    AbstractMoveableItem player;
    AbstractMoveableItem hunter;
    AbstractMoveableItem home;
    boolean gameOver;
    StringBuilder status;

    public Forest(){

    }

    public void init(){
        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                items.put(new Position(x, y), new FirTree());
            }
        }
    }

    public String getGamePlan(){
        // String plan = "";
        //  for(int x = 0; x < WIDTH; x++){
        //     for(int y = 0; y < HEIGHT; y++){
        //         plan += String.valueOf(x) + String.valueOf(y);
        //     }
        //     plan += "\n";
        // }
        // return plan;

        //ArrayList<> test = items.keySet();
        for(Position k: items.keySet()){
            System.out.println(items.get(k).getGraphic());
        }
        //System.out.println(test);
        return "";
    }

    public void addItem(Item item, Position position){

    }

    public String listItems(){
        return "";
    }

    public boolean tryAddItem(Item item, Position position){

        return false;
    }

    public void addPlayerItem(AbstractMoveableItem player){

    }

    public void addHunterItem(AbstractMoveableItem hunter){

    }

    public void addHomeItem(AbstractMoveableItem home){

    }

    public void movePlayer(Position relative){

    }

    public boolean isGameOver(){
        return false;
    }

    public String getStatus(){
        return "";
    }

}

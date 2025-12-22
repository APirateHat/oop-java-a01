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
        items.clear();
    }

    public String getGamePlan(){
        String plan = "";

        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                Position pos = new Position(x, y);
                if (items.containsKey(pos)) {
                    plan += items.get(pos).getGraphic();
                    System.out.println(pos);
                }
                else{
                    plan += "🟩";
                }
            }
            plan += "\n";
        }
        // int count = 0;
        // Position newPos = new Position(0,0);
        // items.remove("00");
        // addItem(new Rock(), new Position(0, 0));
        // for(Position k: items.keySet()){
        //     plan += items.get(k).getGraphic();
        //     count += 1;
        //     System.out.println(count);
        //     if (count >= WIDTH){
        //         count = 0;
        //         plan += "\n";
        //     }
        // }
        return plan;
    }

    public void addItem(Item item, Position position){
        items.put(position, item);
    }

    public String listItems(){
        String item = "";
        for(Position k: items.keySet()){
            item += k + " " + items.get(k) + "\n";
        }
        return item;
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

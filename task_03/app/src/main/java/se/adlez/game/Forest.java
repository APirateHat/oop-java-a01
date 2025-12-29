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
    StringBuilder status = new StringBuilder();

    public Forest(){

    }

    public void init(){
        items.clear();
    }

    public String getGamePlan(){
        String plan = "";

        for(int y = 0; y < HEIGHT; y++){
            for(int x = 0; x < WIDTH; x++){
                Position pos = new Position(x, y);
                if (items.containsKey(pos)) {
                    plan += items.get(pos).getGraphic();
                }
                else{
                    plan += "🟩";
                }
            }
            plan += "\n";
        }
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
        if(items.containsKey(position)){
            return false;
        }
        else{
            items.put(position, item);
            return true;
        }
    }

    public void addPlayerItem(AbstractMoveableItem player){
        this.player = player;
        addItem(player, player.getPosition());
    }

    public void addHunterItem(AbstractMoveableItem hunter){
        this.hunter = hunter;
        addItem(hunter, hunter.getPosition());
    }

    public void addHomeItem(AbstractMoveableItem home){
        this.home = home;
        addItem(home, home.getPosition());
    }

    public void movePlayer(Position relative){
        int x = player.getPosition().getX() + relative.getX();
        int y = player.getPosition().getY() + relative.getY();
        System.out.println(items.get(new Position(x, y)));
        Item item = items.get(new Position(x, y));
        if((x != -1 && x < WIDTH) && (y != -1 && y < HEIGHT)){
            if(item == null || home.getPosition().getX() == x && home.getPosition().getY() == y){
                items.remove(player.getPosition());
                this.player = new Robot(new Position(x, y));
                addItem(player, new Position(x, y));
                this.status.append("You move swiftly!\n");
            }
            else{
                this.status.append("Something is in the way, you can't move!\n");
            }
        }
        else{
            this.status.append("Can't move out of bounds!\n");
        }
        System.out.println(getStatus());
    }

    public boolean isGameOver(){
        return false;
    }

    public String getStatus(){
        return status.toString();
    }

}

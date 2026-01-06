package se.adlez.game;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Forest implements Serializable{
    private int WIDTH = 10;
    private int HEIGHT = 10;
    private Map <Position, Item> items = new HashMap<>();
    private AbstractMoveableItem player;
    private AbstractMoveableItem hunter;
    private AbstractMoveableItem home;
    private boolean gameOver;
    private StringBuilder status = new StringBuilder();

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

    private boolean isInsideOfBounds(int x, int y){
        if((x != -1 && x < WIDTH) && (y != -1 && y < HEIGHT)){
            return true;
        }
        else {
            return false;
        }
    }

    public void movePlayer(Position relative){
        int x = player.getPosition().getX() + relative.getX();
        int y = player.getPosition().getY() + relative.getY();
        Item item = items.get(new Position(x, y));
        if(isInsideOfBounds(x, y)){
            if(item == null){
                items.remove(player.getPosition());
                this.player = new Robot(new Position(x, y));
                addItem(player, new Position(x, y));
                this.status.append("You move swiftly!\n");
            }
            else if(item == home){
                items.remove(player.getPosition());
                this.player = new Robot(new Position(x, y));
                items.remove(home.getPosition());
                addItem(player, new Position(x, y));
                this.status.append("You reached " + home + "\n");
                this.status.append("Game Over!\n");
                gameOver = true;
            }
            else if(item == hunter){
                items.remove(player.getPosition());
                this.player = new Robot(new Position(x, y));
                addItem(player, new Position(x, y));
                this.status.append("Oh no, you found the " + hunter + "\n");
                this.status.append("Game Over!\n");
                gameOver = true;
            }
            else{
                this.status.append(item + " is in the way, you can't move!\n");
            }
        }
        else{
            this.status.append("Can't move out of bounds!\n");
        }
        if(!gameOver){
            moveHunter();
        }
        //System.out.println(getStatus());
    }

    public void moveHunter(){
        //Dumbass wolf logic
        Random random = new Random();
        int randX = random.nextInt(-1, 2);
        int randY = random.nextInt(-1, 2);
        int x = this.hunter.getPosition().getX() + randX;
        int y = this.hunter.getPosition().getY() + randY;
        Item item = items.get(new Position(x, y));
        if(isInsideOfBounds(x, y) && (x != 0 && y != 0)){
            if(item == null){
                items.remove(hunter.getPosition());
                this.hunter = new Wolf(new Position(x, y));
                addItem(hunter, new Position(x, y));
                this.status.append(hunter + " moves\n");
            }
            else if (item == player){
                this.status.append(hunter + " caught " + player + "\n" ); 
                this.status.append("Game Over!\n");
                gameOver = true;
            }
        }
        else{
            this.status.append(hunter + " waits\n");
        }
    }

    public boolean isGameOver(){
        return gameOver;
    }

    public String getStatus(){
        return status.toString();
    }

}

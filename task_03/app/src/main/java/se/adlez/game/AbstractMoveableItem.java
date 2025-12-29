package se.adlez.game;

public abstract class AbstractMoveableItem extends AbstractItem implements Moveable{
    private Position position;

    public AbstractMoveableItem(String description, String graphic, Position position){
        super(description, graphic);
        this.position = position;
    }

    public Position getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return getDescription() + " " + getGraphic();
    }
}

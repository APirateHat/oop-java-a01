package se.adlez.game;

public abstract class AbstractMoveableItem extends AbstractItem{
    private Position position;
    public AbstractMoveableItem(String description, String graphic, Position position){
        super(description, graphic);
        this.position = position;
    }
}

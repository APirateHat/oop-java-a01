package se.adlez.game;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position(Position position){

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        Position pos = (Position) o;
        return x == pos.x && y == pos.y;
    }

    @Override
    public int hashCode(){
        return 31 * x + y;
    }

    @Override
    public String toString(){
        String x = String.valueOf(getX());
        String y = String.valueOf(getY());
        return "("+x+", "+y+")";
    }

    public void move(Position relative){
        this.x += relative.getX();
        this.y += relative.getY();
    }
}



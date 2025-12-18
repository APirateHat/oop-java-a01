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

    public boolean equals(Object o){
        return false;
    }

    public int hashCode(){
        return 0;
    }

    @Override
    public String toString(){
        return "";
    }

    public void move(Position relative){

    }
}



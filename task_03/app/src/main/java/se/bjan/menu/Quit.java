package se.bjan.menu;

public class Quit extends MenuItem {
    
    public Quit(String title, String symbol){
        super(title, symbol);
    }
    
    public void run(){
        System.out.println("Bye, bye!");
    }
}

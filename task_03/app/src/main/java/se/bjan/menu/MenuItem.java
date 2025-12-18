package se.bjan.menu;

public abstract class MenuItem {
    private String title;
    private String symbol;
    protected GameManager manager;

    abstract void run();

    public MenuItem(String title, String symbol){
        this.title = title;
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getTitle(){
        return title;
    }

    public void addManager(GameManager manager){
        this.manager = manager;
    }
}

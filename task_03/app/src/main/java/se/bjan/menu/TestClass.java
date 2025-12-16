package se.bjan.menu;

public class TestClass extends MenuItem {
    
    public TestClass(String title, String symbol){
        super(title, symbol);
    }

    @Override
    public void run(){
        System.out.println("Calling from TestClass!");
    }
}

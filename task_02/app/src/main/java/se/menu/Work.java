package se.menu;

public class Work extends Option implements IClassManager{
    public Work(Menu menu, String optionText, String optionSymbol){
        super(menu, optionText, optionSymbol);
    }

    public void execute(){
        menu.displayEmployeesWork();
    }
}

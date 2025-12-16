package se.menu;

public class CreateSuperEmployee extends Option implements IClassManager {
    
    public CreateSuperEmployee(Menu menu, String optionText, String optionSymbol) {
        super(menu, optionText, optionSymbol);
    }

    public void execute(){
        super.menu.createSuperEmployee();
    }
}

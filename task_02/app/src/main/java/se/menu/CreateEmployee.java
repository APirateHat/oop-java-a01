package se.menu;

public class CreateEmployee extends Option implements IClassManager{

    public CreateEmployee(Menu menu, String optionText, String optionSymbol) {
        super(menu, optionText, optionSymbol);
    }

    public void execute(){
        super.menu.createEmployee();
    }
}

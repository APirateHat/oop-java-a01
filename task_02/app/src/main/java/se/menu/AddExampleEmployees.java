package se.menu;

class AddExampleEmployees extends Option implements IClassManager{

    public AddExampleEmployees(Menu menu, String optionText, String optionSymbol){
        super(menu, optionText, optionSymbol);
    }
    
    public void execute(){
        menu.addExampleEmployees();
    }
}
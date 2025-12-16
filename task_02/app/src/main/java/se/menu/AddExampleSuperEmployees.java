package se.menu;

class AddExampleSuperEmployees extends Option implements IClassManager {

     public AddExampleSuperEmployees(Menu menu, String optionText, String optionSymbol){
        super(menu, optionText, optionSymbol);
    }
    
    public void execute(){
        super.menu.addExampleSuperEmployeeWithSuperPower();
    }
}
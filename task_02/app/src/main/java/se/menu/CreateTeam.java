package se.menu;

public class CreateTeam extends Option implements IClassManager{

    public CreateTeam(Menu menu, String optionText, String optionSymbol){
        super(menu, optionText, optionSymbol);
    }

    public void execute() {
        super.menu.createTeam();
    }
}

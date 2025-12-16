package se.menu;

import se.company.resource.*;

public class Option{
    protected Menu menu;
    private String optionText;
    private String optionSymbol;
    

    public Option(Menu menu, String optionText, String optionSymbol) {
        this.menu = menu;
        this.optionText = optionText;
        this.optionSymbol = optionSymbol; 
    }

    public String getOptionText() {
        return optionText;
    }

    public String getOptionSymbol() {
        return optionSymbol;
    }

    protected Team addTeam(){
        Team team = new Team();
        return team;
    }


}

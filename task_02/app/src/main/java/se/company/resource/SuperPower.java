package se.company.resource;

public class SuperPower {
    private String type;
    private String description;

    public SuperPower(String type, String description){
        this.type = type;
        this.description = description;
    }

    public String usePower(){
        return description;
    }

    public String getType(){
        return type;
    }

    public String getDescription(){
        return description;
    }
}

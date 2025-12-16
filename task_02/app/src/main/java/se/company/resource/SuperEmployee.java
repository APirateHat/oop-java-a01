package se.company.resource;

import java.util.ArrayList;

public class SuperEmployee extends Employee{
    
    ArrayList<SuperPower> superPower = new ArrayList<SuperPower>();
    
    public SuperEmployee(String name, String work){
        super(name, work, 0);
    }

    @Override
    public String work(){
        String working = name + " saving the world in " + work;
        String usingPower = "Using superpower: " + superPower.get(0).getType() + " - " + superPower.get(0).getDescription();
        return working + "\n " + usingPower;
    }

    public void addPower(SuperPower power){
        superPower.add(power);
    }

    @Override
    public String toString(){
        return "Sup: " + name + " ("+work+") " + "-" + superPower.get(0).getType()+", "+superPower.get(1).getType();
    }
}

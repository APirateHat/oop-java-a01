package se.company.resource;

import java.util.ArrayList;

public class Team {
    private ArrayList<Employee> members = new ArrayList<Employee>();

    public Team(){

    }

    public void add(Employee emp){
        members.add(emp);
    }

    public String work(){
        String msg = "";
        for (Employee member: members) {
                msg += member.work() + "\n";
            }
        return msg;
    }

    @Override
    public String toString(){
        String msg = "";
        if (members.size() == 0) {
            msg = "(Empty team)";
        }
        else {
            for (Employee member: members) {
                msg += member + "\n";
            }
        }
        return msg;
    }
}

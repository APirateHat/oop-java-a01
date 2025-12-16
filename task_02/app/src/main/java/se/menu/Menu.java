package se.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import se.company.resource.*;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    private IClassManager[] options = {new CreateTeam(this, "Create a new empty team", "1"),
        new CreateEmployee(this, "Add normal employee to team", "2"), new AddExampleEmployees(this,"Add John, Jane and Little Jr", "3"),
        new Work(this, "Print out work being done", "4"), new CreateSuperEmployee(this, "Add super employee", "5"), new AddExampleSuperEmployees(this, "Add three super employees with powers", "6"),
        new Quit(this, "Quit", "qQ")
    };

    private ArrayList<Team> teams = new ArrayList<Team>();
    

    //Constructor method
    public Menu(){

    }

    public void run(){
        String choice;
        do {
            printMenu();
            choice = getChoice().toLowerCase();
            System.out.println("You enterered: " + choice);
            for (IClassManager option: options) {
                if (choice.equals(option.getOptionSymbol())) {
                    try{
                        option.execute();
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("ERROR: Create a team first!");
                    }
                }
            }
        }
        while (!choice.equals("q"));
        
    }

    public String getChoice(){
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine();

        return input;
    }

    public void printMenu(){
        makeDashes(20);
        for(IClassManager option: options) {
            System.out.println("|" + option.getOptionSymbol() +  ") " + option.getOptionText());
        }
        makeDashes(20);
    }

    private void makeDashes(int dashAmount){
        String dashes = "";
        for (int i = 0; i < dashAmount; i++){
            dashes += "-";
        }
        System.out.println(dashes);
    }

    private void printTeamInfo(){
        int currentTeamIndex = teams.size() - 1;
        makeDashes(20);
        System.out.println("#" + teams.size() + " TEAM");
        makeDashes(20);
        System.out.println(teams.get(currentTeamIndex).toString());
    }


     public void createTeam(){
        Team team = new Team();
        teams.add(team);
        printTeamInfo();
    }

    public void createEmployee(){
        int currentTeamIndex = teams.size() - 1;
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter work: ");
        String work = scanner.nextLine();
        try{
            System.out.print("Enter salary: ");
            int salary = scanner.nextInt();
            teams.get(currentTeamIndex).add(new NormalEmployee(name, work, salary));
            printTeamInfo();
        }
        catch(InputMismatchException e) {
            System.out.println("ERROR: Salary must be an int!");
        }
        
    }

    public void addExampleEmployees(){
        int currentTeamIndex = teams.size() - 1;
        teams.get(currentTeamIndex).add(new NormalEmployee("John", "Construction", 1000));
        teams.get(currentTeamIndex).add(new NormalEmployee("Jane", "Librarian", 1000));
        teams.get(currentTeamIndex).add(new NormalEmployee("Little Jr", "Unemployed", 1000));
        printTeamInfo();
    }

    public void displayEmployeesWork(){
        System.out.println("Work:");
        makeDashes(20);
        for(Team team: teams) {
            System.out.println(team.work());
        }
     
    }

    public void createSuperEmployee(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter work: ");
        String work = scanner.nextLine();
        int currentTeamIndex = teams.size() - 1;

        teams.get(currentTeamIndex).add(new SuperEmployee(name, work));
    }

    public void addExampleSuperEmployeeWithSuperPower(){
        SuperPower strength = new SuperPower("Super Strength", "Muscles that can break mountains in half");
        SuperPower brainiac = new SuperPower("Super Smart", "Intelligence is on another level");
        SuperPower sticky = new SuperPower("Sticky", "Stick to walls and other surfaces");
        SuperPower snäll = new SuperPower("Snäll", "Just a nice guy");

        SuperEmployee sup1 = new SuperEmployee("Peter Parker", "Photographer");
        sup1.addPower(strength);
        sup1.addPower(sticky);

        SuperEmployee sup2 = new SuperEmployee("The Tick", "Alien or something");
        sup2.addPower(brainiac);
        sup2.addPower(strength);

        SuperEmployee sup3 = new SuperEmployee("Bamse", "I skogen");
        sup3.addPower(strength);
        sup3.addPower(snäll);

        int currentTeamIndex = teams.size() - 1;
        teams.get(currentTeamIndex).add(sup1);
        teams.get(currentTeamIndex).add(sup2);
        teams.get(currentTeamIndex).add(sup3);

        printTeamInfo();
    }

}

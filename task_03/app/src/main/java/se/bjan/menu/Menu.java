package se.bjan.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<MenuItem> options = new ArrayList<MenuItem>();

    public Menu(){

    }

    public void run(){
        String choice;
        do {
            printMenu();
            choice = getChoice().toLowerCase();
            System.out.println("You enterered: " + choice);
            for (MenuItem option: options) {
                if (choice.equals(option.getSymbol())) {
                    try{
                        option.run();
                    }
                    catch (IndexOutOfBoundsException e){
                        
                    }
                }
            }
        }
        while (!choice.equals("q"));
        
    }

    public void addMenuItem(MenuItem item){
        options.add(item);
    }

    public String getChoice(){
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine();

        return input;
    }

    public void printMenu(){
        makeDashes(20);
        for(MenuItem option: options) {
            System.out.println("|" + option.getSymbol() +  ") " + option.getTitle());
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

}

package se.bjan.menu;

import java.util.Scanner;

import se.adlez.game.*;

public class AddItem extends MenuItem {
    
    FirTree firTree = new FirTree();
    Rock rock = new Rock();

    public AddItem(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Forest forest = manager.getForest();
        System.out.println("Add " + firTree + " (1) or " + rock + " (2)");
        System.out.print("Enter your choice: ");
        String itemType = scanner.nextLine();
        System.out.print("Set position x y (seperate by space) Enter your choice: ");
        String position = scanner.nextLine();
        String[] xy = position.split(" ");
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        if (itemType.equals("1")){
            forest.addItem(new FirTree(), new Position(x, y));
            System.out.println("A " + firTree + " sprouts out of the ground!");
        }
        else if(itemType.equals("2")){
            forest.addItem(new Rock(), new Position(x, y));
            System.out.println("A " + rock + " splits the ground and reveals itself!");
        }
    }
}

package se.bjan.menu;

import java.util.Scanner;
import se.adlez.game.*;

public class PlayGame extends MenuItem {
    public PlayGame(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        Scanner scanner = new Scanner(System.in);
        //String choice = scanner.nextLine();
        String choice = "";
        do{
            System.out.println(forest.getGamePlan());
            System.out.println("Move Player: ⬅️a, ➡️d, ⬆️w, ⬇️s | Quit: q");
            System.out.print("Direction: ");
            choice = scanner.nextLine();

            switch(choice){
                case "d": 
                    forest.movePlayer(new Position(1, 0));
                    break;
                case "a":
                    forest.movePlayer(new Position(-1, 0));
                    break;
                case "w":
                    forest.movePlayer(new Position(0, -1));
                    break;
                case "s":
                    forest.movePlayer(new Position(0, 1));
                    break;

            }
        }
        while(!choice.equals("q"));
    }
}

package se.bjan.menu;

import java.util.Random;

import se.adlez.game.*;

public class AddTreesAndRocks extends MenuItem{
    public AddTreesAndRocks(String title, String symbol){
        super(title, symbol);
    }

    public void run(){
        Forest forest = manager.getForest();
        Random random = new Random();
        int count = 0;
        while(count < 5){
            int randX = random.nextInt(10);
            int randY = random.nextInt(10);
            FirTree tree = new FirTree();
            Position position = new Position(randX, randY);
            if(forest.tryAddItem(tree, position) == false){
                System.out.println("Retrying");
            }
            else{
                System.out.println(tree + " " + position);
                count += 1;
            }
        }

        count = 0;

        while(count < 5){
            int randX = random.nextInt(10);
            int randY = random.nextInt(10);
            Rock rock = new Rock();
            Position position = new Position(randX, randY);
            if(forest.tryAddItem(rock, position) == false){
                System.out.println("Retrying");
            }
            else{
                System.out.println(rock + " " + position);
                count += 1;
            }
        }

        // for(int i = 0; i < 5; i++){
        //     int randX = random.nextInt(10);
        //     int randY = random.nextInt(10);
        //     FirTree tree = new FirTree();
        //     Position position = new Position(randX, randY);
        //     forest.tryAddItem(tree, position);
        //     System.out.println(tree + " " + position);
        // }

        // for(int i = 0; i < 5; i++){
        //     int randX = random.nextInt(10);
        //     int randY = random.nextInt(10);
        //     Rock rock = new Rock();
        //     Position position = new Position(randX, randY);
        //     forest.tryAddItem(rock, position);
        //     System.out.println(rock + " " + position);
        // }
        
    }
}

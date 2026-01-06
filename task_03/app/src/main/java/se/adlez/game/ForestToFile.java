package se.adlez.game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ForestToFile {
    public ForestToFile(){

    }

    public static void save(Forest forest, String fileName){
        try (ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream(fileName)
        )){
            out.writeObject(forest);
        }
        catch (IOException e){
            e.printStackTrace();
         }
    }

    public static Forest load(String fileName){
        Forest forest = null;
        try(ObjectInputStream in = new ObjectInputStream(
            new FileInputStream(fileName)
        )){
            forest = (Forest) in.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return forest;
    }
}

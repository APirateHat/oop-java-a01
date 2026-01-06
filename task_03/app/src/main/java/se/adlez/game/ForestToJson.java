package se.adlez.game;

import com.google.gson.*;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ForestToJson {
    
    public static String printAsJson(Forest forest){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json;

        json = gson.toJson(forest);
        return json;
    }

    public static void saveAsJson(Forest forest){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(forest);
        Path path = Path.of("forest.json");

        try{
            Files.writeString(path, json);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}

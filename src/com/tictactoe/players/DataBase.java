package com.tictactoe.players;

//import org.apache.commons.csv.CSVRecord;
import javafx.scene.shape.Path;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataBase {

    File dataBaseFIle = new File("resources/dataBase.csv");

    public List<String> playersList = null;


    public void addPlayer(NewPlayer newPlayer){
        System.out.println("Wchodze?");





        try (FileWriter fileWriter = new FileWriter(dataBaseFIle,true)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter out = new PrintWriter(bufferedWriter);
//            FileReader fileReader = new FileReader(dataBaseFIle);

            Stream<String> lines = Files.lines(Paths.get("resources/dataBase.csv"));
                playersList = lines.collect(Collectors.toList());

            if(!doesPlayerExist(newPlayer.toString().toUpperCase())){
                out.println(newPlayer.toString().toUpperCase());

            }
            System.out.println("Poka liste");
            for(String player : playersList){
                System.out.println(player);
            }
            out.close();
        }catch (IOException e){
            System.out.println("Exception " +e);
        }
    }

    public boolean doesPlayerExist(String playerRecord){
        for(String player: playersList){
            String stringToCompare = player;
            if(playerRecord.equals(stringToCompare)){
                return true;
            }
        }
        return false;
    }

//    public String textFormat(String text){
//        String result = text;
//        System.out.println("textFormat 1");
//        if(text.contains("NewPlayer{playerName='")){
//            System.out.println("textFormat 2");
//            result.replace("NewPlayer{playerName='","cos");
//            return result;
//        }
//        return null;
//    }
}

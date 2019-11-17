package com.tictactoe.players;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataBase {


    List<String> playersList;
    public DataBase(){
        playersList = new ArrayList<>();
        playersList.add("cos");
        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get("resources/dataBase.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        playersList = lines.collect(Collectors.toList());

//        addPlayer(new NewPlayer(null,0,0));
    }

    File dataBaseFIle = new File("resources/dataBase.csv");




    public List addPlayer(NewPlayer newPlayer){

        try (FileWriter fileWriter = new FileWriter(dataBaseFIle,true)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter out = new PrintWriter(bufferedWriter);
//            FileReader fileReader = new FileReader(dataBaseFIle);

            Stream<String> lines = Files.lines(Paths.get("resources/dataBase.csv"));
            playersList = lines.collect(Collectors.toList());

            if(!doesPlayerExist(newPlayer.toString().toUpperCase())){
                out.println(newPlayer.toString().toUpperCase());
                setPlayersList(playersList);
            }
            System.out.println("Poka liste");
            for(String player : playersList){
                System.out.println(player);
            }
            out.close();
        }catch (IOException e){
            System.out.println("Exception " +e);
        }
        return playersList;
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

    public void setPlayersList(List<String> playersList) {
        this.playersList = playersList;
    }

    public List<String> getPlayersList() {
        return playersList;
    }

}

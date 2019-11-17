package com.tictactoe.scenes;

import com.tictactoe.players.DataBase;
import com.tictactoe.players.NewPlayer;
import com.tictactoe.scenes.template.TemplateBackground;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.List;
import java.util.Observable;

public class Scoreboard {

    public DataBase dataBase = new DataBase();

    public void show(Stage primaryStage){
        TemplateBackground background = new TemplateBackground();
        Scene scene = background.mainMenuModel();

        List<String> list = dataBase.getPlayersList();

        GridPane scoreboardGirdPane = (GridPane)scene.getRoot();

        System.out.println("Wyswietla?");
        for(String item : list){
            System.out.println("co");
            System.out.println(list.size()+" "+ item);
        }

        ListView<String> listView = new ListView<>();

            ObservableList<String> items = FXCollections.observableArrayList(dataBase.getPlayersList());
            listView.setItems(items);


        scoreboardGirdPane.add(listView, 0, 0);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

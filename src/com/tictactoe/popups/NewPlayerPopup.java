package com.tictactoe.popups;

import com.tictactoe.players.DataBase;
import com.tictactoe.players.NewPlayer;
import com.tictactoe.scenes.InGame;
import com.tictactoe.scenes.MainMenu;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NewPlayerPopup {

    private Stage popupStage = new Stage();

    public void newPlayer(Stage primaryStage){
        popupStage = new Stage();
        GridPane popupGridPane = new GridPane();
        Scene popupScene = new Scene(popupGridPane,250,110);
        MainMenu mainMenu = new MainMenu();

        popupStage.setTitle("New Player");
        popupStage.setAlwaysOnTop(true);
        popupStage.setResizable(false);
        popupStage.initStyle(StageStyle.UTILITY);
        popupStage.setOnCloseRequest(event -> mainMenu.menu(primaryStage));

        Label label = new Label("Insert Player Name");
        label.setStyle("-fx-alignment: CENTER;-fx-font-size: 20");

        TextField textField = new TextField();
        textField.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.ENTER){
                acceptButtonFunction(textField, primaryStage);
            }
        });

        Button button = new Button("Accept!");
        button.setStyle("-fx-alignment: CENTER;-fx-font-size: 20");
        button.setOnAction(event -> acceptButtonFunction(textField, primaryStage));

        popupGridPane.add(label, 0, 0);
        popupGridPane.add(textField,0, 1);
        popupGridPane.add(button, 0, 2);

        popupStage.setScene(popupScene);
        popupStage.show();
    }

    private void acceptButtonFunction(TextField textField, Stage primaryStage) {

        InGame inGame = new InGame();
        String playerName = textField.getText();
        DataBase dataBase = new DataBase();

        if(!(playerName.isEmpty())){
            if (playerName.contains(" ")) {
                String replacedPlayerName = playerName.replace(" ", "");
                NewPlayer newPlayer = new NewPlayer(replacedPlayerName, 0, 0);
                dataBase.addPlayer(newPlayer);
            } else {
                NewPlayer newPlayer = new NewPlayer(playerName, 0, 0);
                dataBase.addPlayer(newPlayer);
            }
            inGame.gameScene(primaryStage);
            popupStage.close();
        }else{
            Stage warmingStage = new Stage();
            warmingStage.setTitle("Input is empty");
            warmingStage.setAlwaysOnTop(true);
            warmingStage.isFocused();
            warmingStage.initStyle(StageStyle.UTILITY);

            GridPane gridPane = new GridPane();
            Scene scene = new Scene(gridPane,250,100);
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setPadding(new Insets(10,10,10,10));

            Label label = new Label("Insert player name!");
            label.setStyle("-fx-font-size: 20");

            Button button = new Button("OK!");
            button.setStyle("-fx-font-size: 15");
            button.setMinSize(100,20);
            button.setOnKeyPressed(event -> {
                if(event.getCode() == KeyCode.ENTER){
                    acceptButtonFunction(textField, primaryStage);
                }
            });

            button.setOnAction(event -> warmingStage.close());
            gridPane.add(label,0,0);
            gridPane.add(button,0,1);

            warmingStage.setScene(scene);
            warmingStage.show();
        }
    }
}

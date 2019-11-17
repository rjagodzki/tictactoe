package com.tictactoe;

import com.tictactoe.scenes.MainMenu;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu(primaryStage);
    }
}

/*
* Czego brakuje?
* 1. Wstawianie X lub O i blokowanie komorek
* 2. Ustawienie comobosow i konczenie gry
* 3. Scoreboard - wyswietalnie, dodawanie wygranych do konkretnych graczy
* 4. Ciekawsza grafika?
* 5. */

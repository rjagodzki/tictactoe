package com.tictactoe;

import com.tictactoe.scenes.MainMenu;

import javafx.application.Application;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu(primaryStage);
    }
}

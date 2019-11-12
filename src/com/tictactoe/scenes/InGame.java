package com.tictactoe.scenes;

import com.tictactoe.buttons.BackButton;
import com.tictactoe.mechanic.GameCell;
import com.tictactoe.mechanic.MainMechanic;
import com.tictactoe.players.NewPlayer;
import com.tictactoe.scenes.template.TemplateBackground;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.lang.reflect.*;
import java.util.*;
public class InGame {

    private Image image = new Image("file:resources/board.png");



    private final int size = 6;

    public void gameScene(Stage primaryStage){
        TemplateBackground background = new TemplateBackground();
        Scene scene = background.inGameModel();

        GridPane boardGirdPane = (GridPane)scene.getRoot();

        boardGirdPane.setAlignment(Pos.CENTER_LEFT);

        boardGirdPane.setGridLinesVisible(false);
        boardGirdPane.setPadding(new Insets(0,0,0,0));




            for(int col = 0; col < size; col++){
                for(int row = 0; row < size; row++){
                    Button square = new Button();
                    if(!(col==5 || row == 5)) {
                        MainMechanic mainMechanic = new MainMechanic();
                        GameCell[][] gameCell = new GameCell[5][5];

                        gameCell[col][row] = new GameCell();
                        gameCell[col][row].setEnabled(true);
                        boardGirdPane.add(square, col, row);

                        if(gameCell[col][row].isEnabled()){
                            gameCell[col][row].setEnabled(false);
                            mainMechanic.settingPieces(square,col,row);
                            System.out.println("Col "+col+ " " +row+" " + gameCell[col][row].toString());
                        }
                    }
                }
            }
        System.out.println("1");
        System.out.println("2");



        //Menu in Game
        //TO DO
        //COL = 5 && ROW = 0 - PlayerName

//        Label label = new Label(newPlayer.getPlayerName().toString());


        //COL = 5 && ROW = 1 - "Scoreboard"
        //COL = 5 && ROW = 2 - WON/LOST
        //COL = 5 && ROW = 3 - NOTHING
        //COl = 5 && ROW = 4 - BackButton
        BackButton backButton = new BackButton();
//        boardGirdPane.add(label,5,0);
        boardGirdPane.add(backButton.show(primaryStage),5,4);

        for (int j = 0; j < size; j++) {
            if(j<=4){
                boardGirdPane.getColumnConstraints().add(new ColumnConstraints(5, Control.USE_PREF_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, false));
                boardGirdPane.getRowConstraints().add(new RowConstraints(5, Control.USE_PREF_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, false));
            }else{
                ColumnConstraints columnConstraints = new ColumnConstraints();
                columnConstraints.setPercentWidth(25);
                boardGirdPane.getColumnConstraints().add(columnConstraints);
            }
        }

        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

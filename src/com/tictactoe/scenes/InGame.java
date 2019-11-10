package com.tictactoe.scenes;

import com.tictactoe.buttons.BackButton;
import com.tictactoe.scenes.template.TemplateBackground;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InGame {

    private Image image = new Image("file:resources/board.png");

    private final int size = 6;

    public void gameScene(Stage primaryStage){
        TemplateBackground background = new TemplateBackground();
        Scene scene = background.inGameModel();

        GridPane boardGirdPane = (GridPane)scene.getRoot();

        boardGirdPane.setAlignment(Pos.CENTER_LEFT);

        boardGirdPane.setGridLinesVisible(true);
        boardGirdPane.setPadding(new Insets(0,0,0,0));

        Button square = new Button();
        for(int col = 0; col < size; col++){
            for(int row = 0; row < size; row++){
                if(!(col==5 || row == 5)){
                    boardGirdPane.add(square,col,row);
                    square = new Button();
                }

            }
        }
        //Menu in Game
        //TO DO
        //COL = 5 && ROW = 0 - PlayerName
        //COL = 5 && ROW = 1 - "Scoreboard"
        //COL = 5 && ROW = 2 - WON/LOST
        //COL = 5 && ROW = 3 - NOTHING
        //COl = 5 && ROW = 4 - BackButton
        BackButton backButton = new BackButton();
        boardGirdPane.add(backButton.show(),5,4);

        for (int i = 0; i < size; i++) {
            if(i<=4){
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

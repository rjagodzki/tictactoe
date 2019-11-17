package com.tictactoe.scenes;

import com.tictactoe.buttons.BackButton;
import com.tictactoe.mechanic.GameCell;
import com.tictactoe.mechanic.MainMechanic;
import com.tictactoe.players.NewPlayer;
import com.tictactoe.scenes.template.TemplateBackground;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class InGame {
    public GameCell[][] gameCell;

    public static boolean TURN_X = true;

    public InGame(){
        gameCell = new GameCell[5][5];
    }

    public void gameScene(Stage primaryStage){
        TemplateBackground background = new TemplateBackground();
        Scene scene = background.inGameModel();

        GridPane boardGirdPane = (GridPane)scene.getRoot();

        boardGirdPane.setAlignment(Pos.CENTER_LEFT);

        boardGirdPane.setGridLinesVisible(false);
        boardGirdPane.setPadding(new Insets(0,0,0,0));

        int size = 6;


        for(int col = 0; col < size; col++){
            for(int row = 0; row < size; row++){
                Button square = new Button();
                if(!(col==5 || row == 5)) {
                    MainMechanic mainMechanic = new MainMechanic();

                    gameCell[col][row] = new GameCell();
                    gameCell[col][row].setCol(col);
                    gameCell[col][row].setRow(row);
                    gameCell[col][row].setEnabled(true);
                    boardGirdPane.add(square, col, row);
                    mainMechanic.settingPieces(square, gameCell[col][row]);

                }
            }
        }
        //Menu in Game
        //TO DO
        //COL = 5 && ROW = 0 - PlayerName
        Label label = new Label("Player Name!");
        label.setStyle("-fx-font-size: 25; -fx-alignment: Center; -fx-font-color: Yellow "); // wstaw jakies grafiki lepiejd


        //COL = 5 && ROW = 1 - "Game Result"
        Label label2 = new Label("Game Result");
        //COL = 5 && ROW = 2 - WON/LOST
        Label label3 = new Label("0 : 0");
        //COL = 5 && ROW = 3 - NOTHING
        //COl = 5 && ROW = 4 - BackButton
        BackButton backButton = new BackButton();
        boardGirdPane.add(label,5,0);
        boardGirdPane.add(label2, 5, 1);
        boardGirdPane.add(label3,5,2);
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

    public GameCell[][] getGameCell() {
        return gameCell;
    }
}

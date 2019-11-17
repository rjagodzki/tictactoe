package com.tictactoe.mechanic;

import com.tictactoe.scenes.InGame;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;



public class MainMechanic {

    private Image imageX = new Image("file:resources/X.png");
    private Image imageO = new Image("file:resources/o.png");

    public InGame inGame = new InGame();
    private HashMap<GameCell,GameCell.Cell> settingEnum  = new HashMap<>();

    public void settingPieces(Button square, GameCell gameCell) {

        square.setOnMouseClicked(event -> {
            if (gameCell.isEnabled()) {
                if(InGame.TURN_X){
                    xPiece(square);
                    settingEnum.put(gameCell, GameCell.Cell.X);
//                    combos(gameCell, settingEnum);
                    System.out.println("X coor: "+ gameCell.getCol()+" "+gameCell.getRow());
                    InGame.TURN_X = false;
                }else {
                    oPiece(square);
                    settingEnum.put(gameCell,GameCell.Cell.O);
                    InGame.TURN_X = true;
                }
                gameCell.setEnabled(false);
            }
        });
    }
    private void combos() {


    }


    private void xPiece(Button square) {
//        System.out.println("X");
        square.setStyle("-fx-border-width: 0; -fx-background-color: transparent");
        square.setGraphic(new ImageView(imageX));
    }

    private void oPiece(Button square) {
//        System.out.println("O");
        square.setStyle("-fx-border-width: 0; -fx-background-color: transparent");
        square.setGraphic(new ImageView(imageO));
    }
}

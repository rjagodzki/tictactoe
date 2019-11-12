package com.tictactoe.mechanic;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class MainMechanic{

    private Image imageX = new Image("file:resources/X.png");
    private Image imageO = new Image("file:resources/hehe.png");





    public void settingPieces(Button square, int col, int row){
        boolean turnX = false;
        if(turnX){
            turnX = false;
            System.out.println("1: " + turnX);
            square.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xPiece(square);
            }
        });
        } else{
            turnX = true;
            System.out.println("2: " + turnX);
            square.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    oPiece(square);
                }
            });
        }

    }

//    public boolean isEnabled(Button board){
//        System.out.println("Button properties : " + board + " " + col + " " + row);
//        boolean result;
//        Button check = board[][];
//        if(){
//            result = false;
//            return true;
//        }
//        return false;
//
//
//    }




    //






//
//        square.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                xPiece(square);
//            }
//        });


    private Button xPiece(Button square){
        System.out.println("X");
        square.setGraphic(new ImageView(imageX));
        return square;
    }
    private Button oPiece(Button square){
        System.out.println("O");
        square.setGraphic(new ImageView(imageO));
        return square;
    }
}


//    public boolean gameOver(){
//
//        return true;
//    }}

//
//    public Node[] settingPieces(Button square) {
//        if (turnX) {
//            square.setOnMouseClicked(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    xPiece(square);
//                    turnX = false;
////                    square.setOnMouseClicked(null);
//                }
//            });
//        } else {
//            square.setOnMouseClicked(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    oPiece(square);
//                    turnX = true;
//                }
//            });
//        }
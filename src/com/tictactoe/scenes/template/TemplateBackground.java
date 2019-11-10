package com.tictactoe.scenes.template;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class TemplateBackground {

    private Image mainImage = new Image("file:resources/background");
    private Image boardImage = new Image("file:resources/board.png");

    public Scene inGameModel(){
        BackgroundSize backgroundSize = new BackgroundSize(600,600,false,false,false, false);
        BackgroundImage backgroundImage = new BackgroundImage(boardImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane gridPane = new GridPane();
        gridPane.setBackground(background);

        Scene scene = new Scene(gridPane,800,600, Color.WHITE);

        return scene;
    }

    public Scene mainMenuModel(){
        BackgroundSize backgroundSize = new BackgroundSize(800,600,true,true,true, true);
        BackgroundImage backgroundImage = new BackgroundImage(mainImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane gridPane = new GridPane();
        gridPane.setBackground(background);

        Scene scene = new Scene(gridPane,800,600, Color.WHITE);


        return scene;
    }
}

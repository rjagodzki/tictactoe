package com.tictactoe.logos;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainLogo {
    private Image image = new Image("file:resources/logo.png");

    public Label logo(){
        Label label = new Label();
        label.setGraphic(new ImageView(image));

        return label;
    }
}

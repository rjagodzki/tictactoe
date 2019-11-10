package com.tictactoe.buttons;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BackButton {

    private Image image = new Image("file:resources/backButton.png");

    public Button show(){
        Button button = new Button();
        button.setGraphic(new ImageView(image));

        button.setStyle("-fx-background-color:  transparent");


        return button;
    }
}

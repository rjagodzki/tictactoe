package com.tictactoe.buttons;

import com.tictactoe.popups.NewPlayerPopup;
import com.tictactoe.scenes.InGame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class PlayButton {

    private Image image = new Image("file:resources/playButton.png");

    public Button show(Stage primaryStage){
        Button button = new Button();
        button.setGraphic(new ImageView(image));

        button.setStyle("-fx-background-color:  transparent");

        NewPlayerPopup newPlayerPopup = new NewPlayerPopup();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newPlayerPopup.newPlayer(primaryStage);
            }
        });
        return button;
    }
}

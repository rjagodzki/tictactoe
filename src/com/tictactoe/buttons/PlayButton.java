package com.tictactoe.buttons;

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

        InGame inGame = new InGame();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inGame.gameScene(primaryStage);
                System.out.println("Przejscie!");
            }
        });
        return button;
    }
}

package com.tictactoe.buttons;

import com.tictactoe.scenes.Scoreboard;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ScoreboardButton {

    private Image image = new Image("file:resources/scoreboardButton.png");

    public Button show(Stage primaryStage){

        Button button = new Button();
        Scoreboard scoreboard = new Scoreboard();

        button.setGraphic(new ImageView(image));
        button.setStyle("-fx-background-color:  transparent");
        button.setOnAction(event -> scoreboard.show(primaryStage));

        return button;
    }

}

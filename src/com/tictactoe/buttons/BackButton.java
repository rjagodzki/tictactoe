package com.tictactoe.buttons;

import com.tictactoe.scenes.MainMenu;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BackButton {

    private Image image = new Image("file:resources/backButton.png");

    public Button show(Stage primaryStage){
        MainMenu mainMenu = new MainMenu();
        Button button = new Button();
        button.setGraphic(new ImageView(image));

        button.setStyle("-fx-background-color:  transparent");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainMenu.menu(primaryStage);
            }
        });


        return button;
    }
}

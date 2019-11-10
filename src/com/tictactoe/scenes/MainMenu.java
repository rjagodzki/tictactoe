package com.tictactoe.scenes;



import com.tictactoe.buttons.ExitButton;
import com.tictactoe.buttons.PlayButton;
import com.tictactoe.buttons.ScoreboardButton;
import com.tictactoe.logos.MainLogo;
import com.tictactoe.scenes.template.TemplateBackground;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class MainMenu {


    public void menu(Stage primaryStage){
        TemplateBackground background = new TemplateBackground();
        Scene scene = background.mainMenuModel();
        GridPane gridPane = (GridPane) scene.getRoot();

        MainLogo mainLogo = new MainLogo();
        PlayButton playButton = new PlayButton();
        ScoreboardButton scoreboardButton = new ScoreboardButton();
        ExitButton exitButton = new ExitButton();

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(mainLogo.logo(),0,0);
        gridPane.add(playButton.show(primaryStage),0,2);
        gridPane.add(scoreboardButton.show(),0,3);
        gridPane.add(exitButton.show(),0,4);



        for (int i = 0; i <= 4; i++) {
            RowConstraints row = new RowConstraints ();
            row.setValignment(VPos.CENTER);
            gridPane.getRowConstraints().add(row);

            ColumnConstraints col = new ColumnConstraints();
            col.setHalignment(HPos.CENTER);
            gridPane.getColumnConstraints().add(col);
        }
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

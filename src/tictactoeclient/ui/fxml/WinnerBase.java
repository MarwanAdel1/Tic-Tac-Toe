package tictactoeclient.ui.fxml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;

public class WinnerBase extends AnchorPane {

    protected final MediaView winnerVideo;
    protected final Blend blend;
    protected final Label congratLable;
    protected final Label winnerLable;
    protected final Button backButton;

    public WinnerBase() {

        winnerVideo = new MediaView();
        blend = new Blend();
        congratLable = new Label();
        winnerLable = new Label();
        backButton = new Button();

        setId("AnchorPane");
        setPrefHeight(600.0);
        setPrefWidth(500.0);

        winnerVideo.setFitHeight(300.0);
        winnerVideo.setFitWidth(400.0);
        winnerVideo.setLayoutX(100.0);
        winnerVideo.setLayoutY(130.0);

        winnerVideo.setEffect(blend);

        congratLable.setLayoutX(190.0);
        congratLable.setLayoutY(21.0);
        congratLable.setText("Congratulations!");
        congratLable.setFont(new Font(30.0));

        winnerLable.setLayoutX(148.0);
        winnerLable.setLayoutY(66.0);
        winnerLable.setText("YOU ARE THE WINNER");
        winnerLable.setFont(new Font(30.0));

        backButton.setLayoutX(260.0);
        backButton.setLayoutY(445.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(31.0);
        backButton.setPrefWidth(80.0);
        backButton.setText("Back");

        getChildren().add(winnerVideo);
        getChildren().add(congratLable);
        getChildren().add(winnerLable);
        getChildren().add(backButton);

    }
}

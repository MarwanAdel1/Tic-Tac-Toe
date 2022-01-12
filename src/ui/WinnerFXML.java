package ui;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class WinnerFXML extends AnchorPane {

    protected final MediaView winnerVideo;
    protected final Blend blend;
    protected final Label CongratLable;
    protected final Label winnerLable;
    protected final Button BackButton;

    private Stage stage;

    public WinnerFXML(Stage stage) {
        this.stage = stage;

        File vidoeURL = new File("/assets/vidoes/TrialVidoe.jpg");

        Media media = new Media(vidoeURL.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        winnerVideo = new MediaView();
        winnerVideo.setMediaPlayer(mediaPlayer);
        mediaPlayer.setAutoPlay(true);

        blend = new Blend();
        CongratLable = new Label();
        winnerLable = new Label();
        BackButton = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        winnerVideo.setFitHeight(300.0);
        winnerVideo.setFitWidth(400.0);
        winnerVideo.setLayoutX(100.0);
        winnerVideo.setLayoutY(130.0);

        winnerVideo.setEffect(blend);

        CongratLable.setLayoutX(190.0);
        CongratLable.setLayoutY(21.0);
        CongratLable.setText("Congratulations!");
        CongratLable.setFont(new Font("System Bold", 30.0));

        winnerLable.setLayoutX(148.0);
        winnerLable.setLayoutY(66.0);
        winnerLable.setText("YOU ARE THE WINNER");
        winnerLable.setFont(new Font(30.0));

        BackButton.setLayoutX(260.0);
        BackButton.setLayoutY(445.0);
        BackButton.setMnemonicParsing(false);
        BackButton.setPrefHeight(31.0);
        BackButton.setPrefWidth(80.0);
        BackButton.setText("Back");
        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = new MainPageFXML(stage);
                stage.setScene(new Scene(root, 600, 500));
            }
        });

        getChildren().add(winnerVideo);
        getChildren().add(CongratLable);
        getChildren().add(winnerLable);
        getChildren().add(BackButton);

    }
}

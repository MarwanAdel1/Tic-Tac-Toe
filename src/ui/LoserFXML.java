package ui;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoserFXML extends AnchorPane {

    protected final MediaView LoserVideo;
    protected final Label HardluckLable;
    protected final Label LoserLable;
    protected final Button BackButton;
     private Stage stage;

    public LoserFXML(Stage stage) {
       this.stage = stage;

        LoserVideo = new MediaView();
        HardluckLable = new Label();
        LoserLable = new Label();
        BackButton = new Button();
        File vidoeURL = new File("/assets/vidoes/TrialVidoe.jpg");

        Media media = new Media(vidoeURL.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        LoserVideo.setMediaPlayer(mediaPlayer);
        mediaPlayer.setAutoPlay(true);

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        LoserVideo.setFitHeight(300.0);
        LoserVideo.setFitWidth(400.0);
        LoserVideo.setLayoutX(100.0);
        LoserVideo.setLayoutY(130.0);

        HardluckLable.setLayoutX(229.0);
        HardluckLable.setLayoutY(21.0);
        HardluckLable.setText("Hard Luck!");
        HardluckLable.setFont(new Font("System Bold", 30.0));

        LoserLable.setLayoutX(148.0);
        LoserLable.setLayoutY(66.0);
        LoserLable.setText("YOU LOST THIS MATCH");
        LoserLable.setFont(new Font(30.0));

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

        getChildren().add(LoserVideo);
        getChildren().add(HardluckLable);
        getChildren().add(LoserLable);
        getChildren().add(BackButton);

    }
}

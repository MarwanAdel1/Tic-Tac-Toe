package ui;

import data.ClientRequestsHandler;
import java.io.File;
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
import utility.JsonConverter;

public class WinnerFXML extends AnchorPane {

    protected final MediaView WinnerVideo;
    protected final Blend blend;
    protected final Label CongratLable;
    protected final Label WinnerLable;
    protected final Button BackButton;

    private static String css;

    public WinnerFXML(Stage stage, String myName) {
        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        WinnerVideo = new MediaView();
        blend = new Blend();
        CongratLable = new Label();
        WinnerLable = new Label();
        BackButton = new Button();

        setId("greenStage");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        WinnerVideo.setFitHeight(300.0);
        WinnerVideo.setFitWidth(400.0);
        WinnerVideo.setLayoutX(150.0);
        WinnerVideo.setLayoutY(130.0);

        WinnerVideo.setEffect(blend);

        CongratLable.setLayoutX(190.0);
        CongratLable.setLayoutY(21.0);
        CongratLable.setText("Congratulations!");
        CongratLable.setFont(new Font("System Bold", 30.0));

        WinnerLable.setLayoutX(148.0);
        WinnerLable.setLayoutY(66.0);
        WinnerLable.setText("YOU ARE THE WINNER");
        WinnerLable.setFont(new Font(30.0));

        BackButton.setLayoutX(260.0);
        BackButton.setLayoutY(445.0);
        BackButton.setMnemonicParsing(false);
        BackButton.setPrefHeight(31.0);
        BackButton.setPrefWidth(80.0);
        BackButton.setText("Back");

        getChildren().add(WinnerVideo);
        getChildren().add(CongratLable);
        getChildren().add(WinnerLable);
        getChildren().add(BackButton);

        File vidoeURL = new File("src/assets/videos/win.mp4");

        Media media = new Media(vidoeURL.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        WinnerVideo.setMediaPlayer(mediaPlayer);
        mediaPlayer.setAutoPlay(true);

        WinnerVideo.setId("container");
        CongratLable.setId("greenText");
        WinnerLable.setId("greenText");
        BackButton.setId("orangeButton");

        BackButton.setOnAction((event) -> {
            mediaPlayer.stop();

            ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(myName, true));
            Parent root = new MainPageFXML(stage);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

    }
}

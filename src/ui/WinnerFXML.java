package ui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;

public class WinnerFXML extends AnchorPane {

    protected final MediaView WinnerVideo;
    protected final Blend blend;
    protected final Label CongratLable;
    protected final Label WinnerLable;
    protected final Button BackButton;

    public WinnerFXML() {

        WinnerVideo = new MediaView();
        blend = new Blend();
        CongratLable = new Label();
        WinnerLable = new Label();
        BackButton = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        WinnerVideo.setFitHeight(300.0);
        WinnerVideo.setFitWidth(400.0);
        WinnerVideo.setLayoutX(100.0);
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

    }
}

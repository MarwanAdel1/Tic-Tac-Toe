package ui.fxml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;

public class LoserFXML extends AnchorPane {

    protected final MediaView LoserVideo;
    protected final Label HardluckLable;
    protected final Label LoserLable;
    protected final Button BackButton;

    public LoserFXML() {

        LoserVideo = new MediaView();
        HardluckLable = new Label();
        LoserLable = new Label();
        BackButton = new Button();

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

        getChildren().add(LoserVideo);
        getChildren().add(HardluckLable);
        getChildren().add(LoserLable);
        getChildren().add(BackButton);

    }
}

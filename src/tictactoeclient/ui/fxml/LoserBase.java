package tictactoeclient.ui.fxml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;

public class LoserBase extends AnchorPane {

    protected final MediaView loserVideo;
    protected final Label hardluckLable;
    protected final Label loserLable;
    protected final Button backButton;

    public LoserBase() {

        loserVideo = new MediaView();
        hardluckLable = new Label();
        loserLable = new Label();
        backButton = new Button();

        setId("AnchorPane");
        setPrefHeight(600.0);
        setPrefWidth(500.0);

        loserVideo.setFitHeight(300.0);
        loserVideo.setFitWidth(400.0);
        loserVideo.setLayoutX(100.0);
        loserVideo.setLayoutY(130.0);

        hardluckLable.setLayoutX(229.0);
        hardluckLable.setLayoutY(21.0);
        hardluckLable.setText("Hard Luck!");
        hardluckLable.setFont(new Font(30.0));

        loserLable.setLayoutX(148.0);
        loserLable.setLayoutY(66.0);
        loserLable.setText("YOU LOST THIS MATCH");
        loserLable.setFont(new Font(30.0));

        backButton.setLayoutX(260.0);
        backButton.setLayoutY(445.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(31.0);
        backButton.setPrefWidth(80.0);
        backButton.setText("Back");

        getChildren().add(loserVideo);
        getChildren().add(hardluckLable);
        getChildren().add(loserLable);
        getChildren().add(backButton);

    }
}

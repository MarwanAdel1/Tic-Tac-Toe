package tic.tac.toe.client;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;

public class MainPageBase extends AnchorPane {

    protected final Label ticTacLable;
    protected final Button singleButton;
    protected final Box playerBox;
    protected final Label welcomeLable;
    protected final Label playedLable;
    protected final Label winLable;
    protected final Label pointsLable;
    protected final Button twoButton;
    protected final Button multiButton;
    protected final Button recordsButton;

    public MainPageBase() {

        ticTacLable = new Label();
        singleButton = new Button();
        playerBox = new Box();
        welcomeLable = new Label();
        playedLable = new Label();
        winLable = new Label();
        pointsLable = new Label();
        twoButton = new Button();
        multiButton = new Button();
        recordsButton = new Button();

        setId("AnchorPane");
        setPrefHeight(600.0);
        setPrefWidth(500.0);

        ticTacLable.setLayoutX(165.0);
        ticTacLable.setLayoutY(27.0);
        ticTacLable.setText("Tic Tac Toe");
        ticTacLable.setFont(new Font(55.0));

        singleButton.setLayoutX(368.0);
        singleButton.setLayoutY(132.0);
        singleButton.setMnemonicParsing(false);
        singleButton.setPrefHeight(61.0);
        singleButton.setPrefWidth(161.0);
        singleButton.setText("Single Player");

        playerBox.setDepth(100.0);
        playerBox.setDrawMode(javafx.scene.shape.DrawMode.LINE);
        playerBox.setHeight(290.0);
        playerBox.setLayoutX(151.0);
        playerBox.setLayoutY(277.0);
        playerBox.setWidth(250.0);

        welcomeLable.setLayoutX(45.0);
        welcomeLable.setLayoutY(146.0);
        welcomeLable.setText("Wlcome Ahmed");
        welcomeLable.setFont(new Font(30.0));

        playedLable.setLayoutX(38.0);
        playedLable.setLayoutY(229.0);
        playedLable.setText("You played: 5 Matches");
        playedLable.setFont(new Font(20.0));

        winLable.setLayoutX(40.0);
        winLable.setLayoutY(282.0);
        winLable.setText("Won: 3 Matches");
        winLable.setFont(new Font(20.0));

        pointsLable.setLayoutX(41.0);
        pointsLable.setLayoutY(338.0);
        pointsLable.setText("Score: 10 Points");
        pointsLable.setFont(new Font(20.0));

        twoButton.setLayoutX(368.0);
        twoButton.setLayoutY(210.0);
        twoButton.setMnemonicParsing(false);
        twoButton.setPrefHeight(61.0);
        twoButton.setPrefWidth(161.0);
        twoButton.setText("Two Players");

        multiButton.setLayoutX(368.0);
        multiButton.setLayoutY(285.0);
        multiButton.setMnemonicParsing(false);
        multiButton.setPrefHeight(61.0);
        multiButton.setPrefWidth(161.0);
        multiButton.setText("MultiPlayers");

        recordsButton.setLayoutX(368.0);
        recordsButton.setLayoutY(361.0);
        recordsButton.setMnemonicParsing(false);
        recordsButton.setPrefHeight(61.0);
        recordsButton.setPrefWidth(161.0);
        recordsButton.setText("Records");

        getChildren().add(ticTacLable);
        getChildren().add(singleButton);
        getChildren().add(playerBox);
        getChildren().add(welcomeLable);
        getChildren().add(playedLable);
        getChildren().add(winLable);
        getChildren().add(pointsLable);
        getChildren().add(twoButton);
        getChildren().add(multiButton);
        getChildren().add(recordsButton);

    }
}

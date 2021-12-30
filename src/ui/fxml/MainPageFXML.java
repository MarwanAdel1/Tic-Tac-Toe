package ui.fxml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;

public class MainPageFXML extends AnchorPane {

    protected final Label TicTacLable;
    protected final Button singleButton;
    protected final Box PlayerBox;
    protected final Label WelcomeLable;
    protected final Button twoButton;
    protected final Button multiButton;
    protected final Button recordsButton;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label PlayedLable;
    protected final Label WinLable;
    protected final Label PointsLable;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label playedLabel;
    protected final Label wonLabel;
    protected final Label scoreLabel;

    public MainPageFXML() {

        TicTacLable = new Label();
        singleButton = new Button();
        PlayerBox = new Box();
        WelcomeLable = new Label();
        twoButton = new Button();
        multiButton = new Button();
        recordsButton = new Button();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        PlayedLable = new Label();
        WinLable = new Label();
        PointsLable = new Label();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        playedLabel = new Label();
        wonLabel = new Label();
        scoreLabel = new Label();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        TicTacLable.setLayoutX(18.0);
        TicTacLable.setText("Tic-Tac-Toe  Game");
        TicTacLable.setFont(new Font("System Bold Italic", 65.0));

        singleButton.setLayoutX(368.0);
        singleButton.setLayoutY(132.0);
        singleButton.setMnemonicParsing(false);
        singleButton.setPrefHeight(61.0);
        singleButton.setPrefWidth(161.0);
        singleButton.setText("Single Player");

        AnchorPane.setRightAnchor(PlayerBox, 267.0);
        PlayerBox.setDepth(100.0);
        PlayerBox.setHeight(290.0);
        PlayerBox.setLayoutX(183.0);
        PlayerBox.setLayoutY(285.0);
        PlayerBox.setWidth(300.0);

        WelcomeLable.setLayoutX(45.0);
        WelcomeLable.setLayoutY(146.0);
        WelcomeLable.setText("Wlecome Ahmed");
        WelcomeLable.setFont(new Font("System Bold", 30.0));

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

        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.setLayoutX(45.0);
        gridPane.setLayoutY(210.0);
        gridPane.setPrefHeight(186.0);
        gridPane.setPrefWidth(259.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(81.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(66.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(95.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(29.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(171.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(165.0);

        rowConstraints.setMaxHeight(98.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(54.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(109.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(75.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(96.0);
        rowConstraints1.setMinHeight(0.0);
        rowConstraints1.setPrefHeight(61.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(PlayedLable, javafx.geometry.HPos.LEFT);
        GridPane.setValignment(PlayedLable, javafx.geometry.VPos.CENTER);
        PlayedLable.setAlignment(javafx.geometry.Pos.CENTER);
        PlayedLable.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        PlayedLable.setText("played:");
        PlayedLable.setFont(new Font(20.0));

        GridPane.setHalignment(WinLable, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(WinLable, 1);
        GridPane.setValignment(WinLable, javafx.geometry.VPos.CENTER);
        WinLable.setText("Won:");
        WinLable.setFont(new Font(20.0));

        GridPane.setHalignment(PointsLable, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(PointsLable, 2);
        GridPane.setValignment(PointsLable, javafx.geometry.VPos.CENTER);
        PointsLable.setText("Score:");
        PointsLable.setFont(new Font(20.0));

        GridPane.setColumnIndex(label, 2);
        label.setText("Game(s)");
        label.setFont(new Font(20.0));

        GridPane.setColumnIndex(label0, 2);
        GridPane.setRowIndex(label0, 1);
        label0.setText("Game(s)");
        label0.setFont(new Font(20.0));

        GridPane.setColumnIndex(label1, 2);
        GridPane.setRowIndex(label1, 2);
        label1.setText("Point(s)");
        label1.setFont(new Font(20.0));

        GridPane.setColumnIndex(playedLabel, 1);
        GridPane.setHalignment(playedLabel, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(playedLabel, javafx.geometry.VPos.CENTER);
        playedLabel.setText("0");

        GridPane.setColumnIndex(wonLabel, 1);
        GridPane.setHalignment(wonLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(wonLabel, 1);
        GridPane.setValignment(wonLabel, javafx.geometry.VPos.CENTER);
        wonLabel.setText("0");

        GridPane.setColumnIndex(scoreLabel, 1);
        GridPane.setHalignment(scoreLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(scoreLabel, 2);
        GridPane.setValignment(scoreLabel, javafx.geometry.VPos.CENTER);
        scoreLabel.setText("0");

        getChildren().add(TicTacLable);
        getChildren().add(singleButton);
        getChildren().add(PlayerBox);
        getChildren().add(WelcomeLable);
        getChildren().add(twoButton);
        getChildren().add(multiButton);
        getChildren().add(recordsButton);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(PlayedLable);
        gridPane.getChildren().add(WinLable);
        gridPane.getChildren().add(PointsLable);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(playedLabel);
        gridPane.getChildren().add(wonLabel);
        gridPane.getChildren().add(scoreLabel);
        getChildren().add(gridPane);

    }
}

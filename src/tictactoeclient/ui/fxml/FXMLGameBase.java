package tictactoeclient.ui.fxml;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public  class FXMLGameBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label title;
    protected final Button btnExit;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Label playerNameLabel;
    protected final Label xLabel;
    protected final Label yourTurnLabel;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final Label computerLabel;
    protected final Label oLabel;
    protected final Label opponentTurnLabel;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final Label symbol2;
    protected final Label symbol7;
    protected final Label symbol4;
    protected final Label symbol5;
    protected final Label symbol8;
    protected final Label symbol3;
    protected final Label symbol9;
    protected final Label symbol6;
    protected final Label symbol1;

    public FXMLGameBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        title = new Label();
        btnExit = new Button();
        gridPane0 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        playerNameLabel = new Label();
        xLabel = new Label();
        yourTurnLabel = new Label();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        computerLabel = new Label();
        oLabel = new Label();
        opponentTurnLabel = new Label();
        gridPane2 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        symbol2 = new Label();
        symbol7 = new Label();
        symbol4 = new Label();
        symbol5 = new Label();
        symbol8 = new Label();
        symbol3 = new Label();
        symbol9 = new Label();
        symbol6 = new Label();
        symbol1 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(117.0);
        gridPane.setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(519.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(449.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(293.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(151.0);

        rowConstraints.setMaxHeight(34.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(34.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(55.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(55.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(24.0);
        rowConstraints1.setMinHeight(1.0);
        rowConstraints1.setPrefHeight(1.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(title, 1);
        title.setPrefHeight(110.0);
        title.setPrefWidth(267.0);
        title.setText("Tic-Tac-Toe");
        title.setFont(new Font("System Bold Italic", 48.0));
        title.setOpaqueInsets(new Insets(0.0));
        GridPane.setMargin(title, new Insets(50.0, 0.0, 0.0, 180.0));
        title.setPadding(new Insets(40.0, 0.0, 0.0, -20.0));

        GridPane.setColumnIndex(btnExit, 1);
        btnExit.setMnemonicParsing(false);
        btnExit.setPrefHeight(39.0);
        btnExit.setPrefWidth(106.0);
        btnExit.setText("Exit Game");
        GridPane.setMargin(btnExit, new Insets(50.0, 0.0, 0.0, 30.0));
        btnExit.setFont(new Font(18.0));
        setTop(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(399.0);
        gridPane0.setPrefWidth(192.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(177.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(177.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(95.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(23.0);

        rowConstraints2.setMaxHeight(223.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(128.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(184.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(65.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(238.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(217.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        playerNameLabel.setText("Player Name");
        playerNameLabel.setFont(new Font("System Bold Italic", 20.0));
        GridPane.setMargin(playerNameLabel, new Insets(-30.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(xLabel, 1);
        xLabel.setText("X");
        GridPane.setMargin(xLabel, new Insets(-20.0, 0.0, 0.0, 60.0));
        xLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(yourTurnLabel, 2);
        yourTurnLabel.setText("Your Turn");
        yourTurnLabel.setFont(new Font("System Bold Italic", 20.0));
        GridPane.setMargin(yourTurnLabel, new Insets(-120.0, 0.0, 0.0, 20.0));
        BorderPane.setMargin(gridPane0, new Insets(60.0, 0.0, 0.0, 0.0));
        setLeft(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(196.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(196.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(93.0);
        columnConstraints4.setMinWidth(4.0);
        columnConstraints4.setPrefWidth(4.0);

        rowConstraints5.setMaxHeight(223.0);
        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(111.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMaxHeight(230.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(62.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(225.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(217.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        computerLabel.setText("Computer");
        computerLabel.setFont(new Font("System Bold Italic", 20.0));
        GridPane.setMargin(computerLabel, new Insets(-15.0, 0.0, 0.0, 60.0));

        GridPane.setRowIndex(oLabel, 1);
        oLabel.setText("O");
        oLabel.setFont(new Font("System Bold", 24.0));
        GridPane.setMargin(oLabel, new Insets(-20.0, 0.0, 0.0, 100.0));

        GridPane.setRowIndex(opponentTurnLabel, 2);
        opponentTurnLabel.setPrefHeight(36.0);
        opponentTurnLabel.setPrefWidth(188.0);
        opponentTurnLabel.setText("Opponent Turn");
        opponentTurnLabel.setFont(new Font("System Bold Italic", 20.0));
        GridPane.setMargin(opponentTurnLabel, new Insets(-110.0, 0.0, 0.0, 40.0));
        BorderPane.setMargin(gridPane1, new Insets(60.0, 0.0, 0.0, 0.0));
        setRight(gridPane1);

        BorderPane.setAlignment(gridPane2, javafx.geometry.Pos.CENTER);
        gridPane2.setGridLinesVisible(true);
        gridPane2.setMaxHeight(USE_PREF_SIZE);
        gridPane2.setMaxWidth(USE_PREF_SIZE);
        gridPane2.setMinHeight(USE_PREF_SIZE);
        gridPane2.setMinWidth(USE_PREF_SIZE);
        gridPane2.setPrefHeight(260.0);
        gridPane2.setPrefWidth(280.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(95.0);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(70.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(95.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(70.0);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(95.0);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(70.0);

        rowConstraints8.setMaxHeight(121.0);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(85.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMaxHeight(112195.0);
        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(85.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMaxHeight(121.0);
        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(85.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane2, new Insets(-80.0, 0.0, 0.0, -20.0));

        GridPane.setColumnIndex(symbol2, 1);
        symbol2.setText("X");
        symbol2.setVisible(false);
        symbol2.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol2, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setRowIndex(symbol7, 2);
        symbol7.setText("X");
        symbol7.setVisible(false);
        symbol7.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol7, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setRowIndex(symbol4, 1);
        symbol4.setText("X");
        symbol4.setVisible(false);
        symbol4.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol4, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol5, 1);
        GridPane.setRowIndex(symbol5, 1);
        symbol5.setText("X");
        symbol5.setVisible(false);
        symbol5.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol5, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol8, 1);
        GridPane.setRowIndex(symbol8, 2);
        symbol8.setText("X");
        symbol8.setVisible(false);
        symbol8.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol8, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol3, 2);
        symbol3.setText("X");
        symbol3.setVisible(false);
        symbol3.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol3, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol9, 2);
        GridPane.setRowIndex(symbol9, 2);
        symbol9.setText("X");
        symbol9.setVisible(false);
        symbol9.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol9, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol6, 2);
        GridPane.setRowIndex(symbol6, 1);
        symbol6.setText("X");
        symbol6.setVisible(false);
        symbol6.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol6, new Insets(0.0, 0.0, 0.0, 30.0));

        symbol1.setText("X");
        symbol1.setVisible(false);
        symbol1.setFont(new Font("System Bold", 30.0));
        GridPane.setMargin(symbol1, new Insets(0.0, 0.0, 0.0, 30.0));
        gridPane2.setPadding(new Insets(30.0, 0.0, 0.0, 10.0));
        setCenter(gridPane2);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(title);
        gridPane.getChildren().add(btnExit);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getChildren().add(playerNameLabel);
        gridPane0.getChildren().add(xLabel);
        gridPane0.getChildren().add(yourTurnLabel);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getRowConstraints().add(rowConstraints7);
        gridPane1.getChildren().add(computerLabel);
        gridPane1.getChildren().add(oLabel);
        gridPane1.getChildren().add(opponentTurnLabel);
        gridPane2.getColumnConstraints().add(columnConstraints5);
        gridPane2.getColumnConstraints().add(columnConstraints6);
        gridPane2.getColumnConstraints().add(columnConstraints7);
        gridPane2.getRowConstraints().add(rowConstraints8);
        gridPane2.getRowConstraints().add(rowConstraints9);
        gridPane2.getRowConstraints().add(rowConstraints10);
        gridPane2.getChildren().add(symbol2);
        gridPane2.getChildren().add(symbol7);
        gridPane2.getChildren().add(symbol4);
        gridPane2.getChildren().add(symbol5);
        gridPane2.getChildren().add(symbol8);
        gridPane2.getChildren().add(symbol3);
        gridPane2.getChildren().add(symbol9);
        gridPane2.getChildren().add(symbol6);
        gridPane2.getChildren().add(symbol1);

    }
}

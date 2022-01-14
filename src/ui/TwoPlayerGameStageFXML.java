package ui;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utility.BoardUtilities;

public class TwoPlayerGameStageFXML extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final Text gameText;
    protected final Button ExitBt;
    protected final FlowPane flowPane;
    protected final Label playerNameLabel;
    protected final Label mySybmolLabel;
    protected final Label myTurnLabel;
    protected final FlowPane flowPane0;
    protected final Label opponentNameLabel;
    protected final Label opponentSybmolLabel;
    protected final Label opponentTurnLabel;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Label cellGrid1;
    protected final Label cellGrid2;
    protected final Label cellGrid3;
    protected final Label cellGrid4;
    protected final Label cellGrid5;
    protected final Label cellGrid6;
    protected final Label cellGrid7;
    protected final Label cellGrid8;
    protected final Label cellGrid9;

    private Stage stage;
    private boolean symbolFlag, turnFlag;
    private String[][] xoBoard;

    public TwoPlayerGameStageFXML(Stage stage, String symbol, String myName, String opName) {
        this.stage = stage;
        if (symbol.equalsIgnoreCase("x")) {
            symbolFlag = false;
        } else {
            symbolFlag = true;
        }
        turnFlag = false;

        xoBoard = new String[3][3];
        xoBoard[0][0] = "d";
        xoBoard[0][1] = "d";
        xoBoard[0][2] = "d";
        xoBoard[1][0] = "d";
        xoBoard[1][1] = "d";
        xoBoard[1][2] = "d";
        xoBoard[2][0] = "d";
        xoBoard[2][1] = "d";
        xoBoard[2][2] = "d";

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        gameText = new Text();
        ExitBt = new Button();
        flowPane = new FlowPane();
        playerNameLabel = new Label();
        mySybmolLabel = new Label();
        myTurnLabel = new Label();
        flowPane0 = new FlowPane();
        opponentNameLabel = new Label();
        opponentSybmolLabel = new Label();
        opponentTurnLabel = new Label();
        gridPane0 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        cellGrid1 = new Label();
        cellGrid2 = new Label();
        cellGrid3 = new Label();
        cellGrid4 = new Label();
        cellGrid5 = new Label();
        cellGrid6 = new Label();
        cellGrid7 = new Label();
        cellGrid8 = new Label();
        cellGrid9 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(492.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(492.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(295.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(108.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowSpan(gameText, 2);
        gameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameText.setStrokeWidth(0.0);
        gameText.setText("Tic-Tac-Toe Game");
        gameText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameText.setWrappingWidth(516.099609375);
        gameText.setFont(new Font("Segoe UI", 46.0));

        GridPane.setColumnIndex(ExitBt, 1);
        GridPane.setHalignment(ExitBt, javafx.geometry.HPos.CENTER);
        GridPane.setRowSpan(ExitBt, 2);
        GridPane.setValignment(ExitBt, javafx.geometry.VPos.BOTTOM);
        ExitBt.setMnemonicParsing(false);
        ExitBt.setPrefHeight(41.0);
        ExitBt.setPrefWidth(97.0);
        ExitBt.setText("Exit Game");
        setTop(gridPane);

        BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
        flowPane.setColumnHalignment(javafx.geometry.HPos.CENTER);
        flowPane.setOrientation(javafx.geometry.Orientation.VERTICAL);
        flowPane.setPrefHeight(340.0);
        flowPane.setPrefWidth(180.0);
        flowPane.setVgap(30.0);

        playerNameLabel.setAlignment(javafx.geometry.Pos.CENTER);
        playerNameLabel.setPrefHeight(17.0);
        playerNameLabel.setPrefWidth(116.0);
        playerNameLabel.setText(myName);
        playerNameLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        playerNameLabel.setFont(new Font("System Bold", 19.0));

        mySybmolLabel.setAlignment(javafx.geometry.Pos.CENTER);
        mySybmolLabel.setPrefHeight(17.0);
        mySybmolLabel.setPrefWidth(104.0);
        mySybmolLabel.setText(symbol);
        mySybmolLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mySybmolLabel.setFont(new Font(59.0));

        myTurnLabel.setAlignment(javafx.geometry.Pos.CENTER);
        myTurnLabel.setPrefHeight(17.0);
        myTurnLabel.setPrefWidth(109.0);
        myTurnLabel.setText("Your Turn");
        myTurnLabel.setFont(new Font(24.0));
        myTurnLabel.setVisible(true);
        flowPane.setPadding(new Insets(70.0, 20.0, 30.0, 20.0));
        BorderPane.setMargin(flowPane, new Insets(50.0, 0.0, 0.0, 0.0));
        setLeft(flowPane);

        BorderPane.setAlignment(flowPane0, javafx.geometry.Pos.CENTER);
        flowPane0.setPrefHeight(340.0);
        flowPane0.setPrefWidth(180.0);
        flowPane0.setVgap(30.0);
        flowPane0.setPadding(new Insets(70.0, 20.0, 30.0, 20.0));

        opponentNameLabel.setAlignment(javafx.geometry.Pos.CENTER);
        opponentNameLabel.setPrefHeight(17.0);
        opponentNameLabel.setPrefWidth(116.0);

        opponentNameLabel.setText(opName);

        opponentTurnLabel.setVisible(false);
        opponentNameLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        opponentNameLabel.setFont(new Font("System Bold", 19.0));

        opponentSybmolLabel.setAlignment(javafx.geometry.Pos.CENTER);
        opponentSybmolLabel.setPrefHeight(86.0);
        opponentSybmolLabel.setPrefWidth(120.0);
        if (symbol.equalsIgnoreCase("x")) {
            opponentSybmolLabel.setText("O");
        } else if (symbol.equalsIgnoreCase("o")) {
            opponentSybmolLabel.setText("X");
        }

        opponentSybmolLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        opponentSybmolLabel.setFont(new Font(59.0));

        opponentTurnLabel.setAlignment(javafx.geometry.Pos.CENTER);
        opponentTurnLabel.setPrefHeight(25.0);
        opponentTurnLabel.setPrefWidth(139.0);
        opponentTurnLabel.setText("Opponent's Turn");
        opponentTurnLabel.setFont(new Font(18.0));
        BorderPane.setMargin(flowPane0, new Insets(50.0, 0.0, 0.0, 0.0));
        setRight(flowPane0);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setGridLinesVisible(true);
        gridPane0.setMaxHeight(USE_PREF_SIZE);
        gridPane0.setMaxWidth(USE_PREF_SIZE);
        gridPane0.setPrefHeight(260.0);
        gridPane0.setPrefWidth(240.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane0, new Insets(0.0, 0.0, 50.0, 0.0));

        GridPane.setHalignment(cellGrid1, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(cellGrid1, javafx.geometry.VPos.CENTER);
        cellGrid1.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        cellGrid1.setPrefHeight(84.0);
        cellGrid1.setPrefWidth(81.0);
        cellGrid1.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid2, 1);
        GridPane.setHalignment(cellGrid2, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(cellGrid2, javafx.geometry.VPos.CENTER);
        cellGrid2.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid2.setPrefHeight(84.0);
        cellGrid2.setPrefWidth(77.0);
        cellGrid2.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid3, 2);
        GridPane.setHalignment(cellGrid3, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(cellGrid3, javafx.geometry.VPos.CENTER);
        cellGrid3.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid3.setPrefHeight(84.0);
        cellGrid3.setPrefWidth(80.0);
        cellGrid3.setFont(new Font(57.0));

        GridPane.setHalignment(cellGrid4, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid4, 1);
        GridPane.setValignment(cellGrid4, javafx.geometry.VPos.CENTER);
        cellGrid4.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid4.setPrefHeight(84.0);
        cellGrid4.setPrefWidth(83.0);
        cellGrid4.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid5, 1);
        GridPane.setHalignment(cellGrid5, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid5, 1);
        GridPane.setValignment(cellGrid5, javafx.geometry.VPos.CENTER);
        cellGrid5.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid5.setPrefHeight(84.0);
        cellGrid5.setPrefWidth(77.0);
        cellGrid5.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid6, 2);
        GridPane.setHalignment(cellGrid6, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid6, 1);
        GridPane.setValignment(cellGrid6, javafx.geometry.VPos.CENTER);
        cellGrid6.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid6.setPrefHeight(84.0);
        cellGrid6.setPrefWidth(79.0);
        cellGrid6.setFont(new Font(57.0));

        GridPane.setHalignment(cellGrid7, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid7, 2);
        GridPane.setValignment(cellGrid7, javafx.geometry.VPos.CENTER);
        cellGrid7.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid7.setPrefHeight(84.0);
        cellGrid7.setPrefWidth(80.0);
        cellGrid7.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid8, 1);
        GridPane.setHalignment(cellGrid8, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid8, 2);
        GridPane.setValignment(cellGrid8, javafx.geometry.VPos.CENTER);
        cellGrid8.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid8.setPrefHeight(84.0);
        cellGrid8.setPrefWidth(79.0);
        cellGrid8.setFont(new Font(57.0));

        GridPane.setColumnIndex(cellGrid9, 2);
        GridPane.setHalignment(cellGrid9, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cellGrid9, 2);
        GridPane.setValignment(cellGrid9, javafx.geometry.VPos.CENTER);
        cellGrid9.setAlignment(javafx.geometry.Pos.CENTER);
        cellGrid9.setPrefHeight(84.0);
        cellGrid9.setPrefWidth(79.0);
        cellGrid9.setFont(new Font(57.0));
        setCenter(gridPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(gameText);
        gridPane.getChildren().add(ExitBt);
        flowPane.getChildren().add(playerNameLabel);
        flowPane.getChildren().add(mySybmolLabel);
        flowPane.getChildren().add(myTurnLabel);
        flowPane0.getChildren().add(opponentNameLabel);
        flowPane0.getChildren().add(opponentSybmolLabel);
        flowPane0.getChildren().add(opponentTurnLabel);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints1);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getChildren().add(cellGrid1);
        gridPane0.getChildren().add(cellGrid2);
        gridPane0.getChildren().add(cellGrid3);
        gridPane0.getChildren().add(cellGrid4);
        gridPane0.getChildren().add(cellGrid5);
        gridPane0.getChildren().add(cellGrid6);
        gridPane0.getChildren().add(cellGrid7);
        gridPane0.getChildren().add(cellGrid8);
        gridPane0.getChildren().add(cellGrid9);

        cellGrid1.setOnMouseClicked((event) -> {
            if (cellGrid1.getText().isEmpty()) {
                cellGrid1.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[0][0] = BoardUtilities.getSymbol(symbolFlag); /// return X - O

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName); //// check Win or Draw

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }

            }
        });

        cellGrid2.setOnMouseClicked((event) -> {
            if (cellGrid2.getText().isEmpty()) {
                cellGrid2.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[0][1] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid3.setOnMouseClicked((event) -> {
            if (cellGrid3.getText().isEmpty()) {
                cellGrid3.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[0][2] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid4.setOnMouseClicked((event) -> {
            if (cellGrid4.getText().isEmpty()) {
                cellGrid4.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[1][0] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid5.setOnMouseClicked((event) -> {
            if (cellGrid5.getText().isEmpty()) {
                cellGrid5.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[1][1] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid6.setOnMouseClicked((event) -> {
            if (cellGrid6.getText().isEmpty()) {
                cellGrid6.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[1][2] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid7.setOnMouseClicked((event) -> {
            if (cellGrid7.getText().isEmpty()) {
                cellGrid7.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[2][0] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid8.setOnMouseClicked((event) -> {
            if (cellGrid8.getText().isEmpty()) {
                cellGrid8.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[2][1] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        cellGrid9.setOnMouseClicked((event) -> {
            if (cellGrid9.getText().isEmpty()) {
                cellGrid9.setText(BoardUtilities.getSymbol(symbolFlag));
                xoBoard[2][2] = BoardUtilities.getSymbol(symbolFlag);

                BoardUtilities.checkBoard(stage, xoBoard, turnFlag, myName, opName);

                symbolFlag = !symbolFlag;
                turnFlag = !turnFlag;

                if (turnFlag) {
                    opponentTurnLabel.setVisible(true);
                    myTurnLabel.setVisible(false);
                } else {
                    opponentTurnLabel.setVisible(false);
                    myTurnLabel.setVisible(true);
                }
            }
        });

        ExitBt.setOnAction((ActionEvent event) -> {
            Parent root = new MainPageFXML(stage);
            stage.setScene(new Scene(root, 600, 500));
        });

    }

}

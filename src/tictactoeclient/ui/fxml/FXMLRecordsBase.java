package tictactoeclient.ui.fxml;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public  class FXMLRecordsBase extends BorderPane {

    protected final Label title;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label symbol4;
    protected final Label symbol3;
    protected final Label symbol2;
    protected final Label symbol9;
    protected final Label symbol8;
    protected final Label symbol7;
    protected final Label symbol6;
    protected final Label symbol5;
    protected final Label symbol1;
    protected final ScrollPane scrollPane;
    protected final ListView listView;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Button btnPlay;
    protected final Button btnBack;

    public FXMLRecordsBase() {

        title = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        symbol4 = new Label();
        symbol3 = new Label();
        symbol2 = new Label();
        symbol9 = new Label();
        symbol8 = new Label();
        symbol7 = new Label();
        symbol6 = new Label();
        symbol5 = new Label();
        symbol1 = new Label();
        scrollPane = new ScrollPane();
        listView = new ListView();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        btnPlay = new Button();
        btnBack = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(title, javafx.geometry.Pos.CENTER);
        title.setText("Records");
        title.setFont(new Font("System Bold Italic", 48.0));
        BorderPane.setMargin(title, new Insets(40.0, 0.0, 0.0, 0.0));
        setTop(title);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(250.0);
        gridPane.setPrefWidth(250.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane, new Insets(0.0, 30.0, 30.0, 0.0));

        GridPane.setRowIndex(symbol4, 1);
        symbol4.setText("O");
        symbol4.setVisible(false);
        symbol4.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol4, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol3, 2);
        symbol3.setText("O");
        symbol3.setVisible(false);
        symbol3.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol3, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol2, 1);
        symbol2.setText("O");
        symbol2.setVisible(false);
        symbol2.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol2, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol9, 2);
        GridPane.setRowIndex(symbol9, 2);
        symbol9.setText("O");
        symbol9.setVisible(false);
        symbol9.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol9, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol8, 1);
        GridPane.setRowIndex(symbol8, 2);
        symbol8.setText("O");
        symbol8.setVisible(false);
        symbol8.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol8, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setRowIndex(symbol7, 2);
        symbol7.setText("O");
        symbol7.setVisible(false);
        symbol7.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol7, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol6, 2);
        GridPane.setRowIndex(symbol6, 1);
        symbol6.setText("O");
        symbol6.setVisible(false);
        symbol6.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol6, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(symbol5, 1);
        GridPane.setRowIndex(symbol5, 1);
        symbol5.setText("O");
        symbol5.setVisible(false);
        symbol5.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol5, new Insets(0.0, 0.0, 0.0, 30.0));

        symbol1.setText("O");
        symbol1.setVisible(false);
        symbol1.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(symbol1, new Insets(0.0, 0.0, 0.0, 30.0));
        setRight(gridPane);

        BorderPane.setAlignment(scrollPane, javafx.geometry.Pos.CENTER);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);

        listView.setPrefHeight(323.0);
        listView.setPrefWidth(177.0);
        scrollPane.setContent(listView);
        BorderPane.setMargin(scrollPane, new Insets(55.0, 0.0, 80.0, 30.0));
        setLeft(scrollPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(95.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(95.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(50.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(15.0);

        rowConstraints2.setMaxHeight(174.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(174.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(123.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(86.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(130.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(130.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(btnPlay, 1);
        btnPlay.setMnemonicParsing(false);
        btnPlay.setText("Play");
        GridPane.setMargin(btnPlay, new Insets(-80.0, 0.0, 0.0, 10.0));

        GridPane.setRowIndex(btnBack, 2);
        btnBack.setMnemonicParsing(false);
        btnBack.setText("Back");
        GridPane.setMargin(btnBack, new Insets(-180.0, 0.0, 0.0, 10.0));
        setCenter(gridPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(symbol4);
        gridPane.getChildren().add(symbol3);
        gridPane.getChildren().add(symbol2);
        gridPane.getChildren().add(symbol9);
        gridPane.getChildren().add(symbol8);
        gridPane.getChildren().add(symbol7);
        gridPane.getChildren().add(symbol6);
        gridPane.getChildren().add(symbol5);
        gridPane.getChildren().add(symbol1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getChildren().add(btnPlay);
        gridPane0.getChildren().add(btnBack);

    }
}

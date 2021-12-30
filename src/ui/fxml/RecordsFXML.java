package ui.fxml;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RecordsFXML extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label label4;
    protected final Label label3;
    protected final Label label2;
    protected final Label label9;
    protected final Label label8;
    protected final Label label7;
    protected final Label label6;
    protected final Label label5;
    protected final Label label1;
    protected final ScrollPane scrollPane;
    protected final ListView listView;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Button btnPlay;
    protected final Button btnBack;
    protected final FlowPane flowPane;
    protected final Text text;
    protected final Label label;

    public RecordsFXML() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        label4 = new Label();
        label3 = new Label();
        label2 = new Label();
        label9 = new Label();
        label8 = new Label();
        label7 = new Label();
        label6 = new Label();
        label5 = new Label();
        label1 = new Label();
        scrollPane = new ScrollPane();
        listView = new ListView();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        btnPlay = new Button();
        btnBack = new Button();
        flowPane = new FlowPane();
        text = new Text();
        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

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

        GridPane.setRowIndex(label4, 1);
        label4.setText("O");
        label4.setVisible(false);
        label4.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label4, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label3, 2);
        label3.setText("O");
        label3.setVisible(false);
        label3.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label3, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label2, 1);
        label2.setText("O");
        label2.setVisible(false);
        label2.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label2, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label9, 2);
        GridPane.setRowIndex(label9, 2);
        label9.setText("O");
        label9.setVisible(false);
        label9.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label9, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label8, 1);
        GridPane.setRowIndex(label8, 2);
        label8.setText("O");
        label8.setVisible(false);
        label8.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label8, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setRowIndex(label7, 2);
        label7.setText("O");
        label7.setVisible(false);
        label7.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label7, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label6, 2);
        GridPane.setRowIndex(label6, 1);
        label6.setText("O");
        label6.setVisible(false);
        label6.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label6, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(label5, 1);
        GridPane.setRowIndex(label5, 1);
        label5.setText("O");
        label5.setVisible(false);
        label5.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label5, new Insets(0.0, 0.0, 0.0, 30.0));

        label1.setText("O");
        label1.setVisible(false);
        label1.setFont(new Font("System Bold", 36.0));
        GridPane.setMargin(label1, new Insets(0.0, 0.0, 0.0, 30.0));
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
        gridPane0.setAlignment(javafx.geometry.Pos.CENTER);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(95.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(95.0);

        rowConstraints2.setMaxHeight(123.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(86.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(130.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(130.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(btnPlay, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btnPlay, javafx.geometry.VPos.CENTER);
        btnPlay.setMnemonicParsing(false);
        btnPlay.setPrefHeight(39.0);
        btnPlay.setPrefWidth(56.0);
        btnPlay.setText("Play");
        GridPane.setMargin(btnPlay, new Insets(30.0, 0.0, 0.0, 10.0));

        GridPane.setHalignment(btnBack, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnBack, 1);
        GridPane.setValignment(btnBack, javafx.geometry.VPos.CENTER);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(33.0);
        btnBack.setPrefWidth(56.0);
        btnBack.setText("Back");
        GridPane.setMargin(btnBack, new Insets(-80.0, 0.0, 0.0, 10.0));
        BorderPane.setMargin(gridPane0, new Insets(50.0, 0.0, 0.0, 0.0));
        setCenter(gridPane0);

        BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
        flowPane.setAlignment(javafx.geometry.Pos.CENTER);
        flowPane.setColumnHalignment(javafx.geometry.HPos.CENTER);
        flowPane.setOrientation(javafx.geometry.Orientation.VERTICAL);
        flowPane.setPrefHeight(153.0);
        flowPane.setPrefWidth(632.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic-Tac-Toe Game");
        text.setFont(new Font("System Bold", 61.0));

        label.setText("Records");
        label.setUnderline(true);
        label.setFont(new Font("System Bold Italic", 48.0));
        setTop(flowPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label9);
        gridPane.getChildren().add(label8);
        gridPane.getChildren().add(label7);
        gridPane.getChildren().add(label6);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getChildren().add(btnPlay);
        gridPane0.getChildren().add(btnBack);
        flowPane.getChildren().add(text);
        flowPane.getChildren().add(label);

    }
}

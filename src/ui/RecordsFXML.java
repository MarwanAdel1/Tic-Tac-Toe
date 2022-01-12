package ui;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
import javafx.stage.Stage;
import pojo.GameStep;
import utility.RecordGame;

public class RecordsFXML extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label cell1;
    protected final Label cell2;
    protected final Label cell3;
    protected final Label cell4;
    protected final Label cell5;
    protected final Label cell6;
    protected final Label cell7;
    protected final Label cell8;
    protected final Label cell9;
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

    private Stage stage;

    private Label labels[][] = new Label[3][3];

    public RecordsFXML(Stage stage) {
        this.stage = stage;

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        cell1 = new Label();
        cell2 = new Label();
        cell3 = new Label();
        cell4 = new Label();
        cell5 = new Label();
        cell6 = new Label();
        cell7 = new Label();
        cell8 = new Label();
        cell9 = new Label();

        labels[0][0] = cell1;
        labels[0][1] = cell2;
        labels[0][2] = cell3;
        labels[1][0] = cell4;
        labels[1][1] = cell5;
        labels[1][2] = cell6;
        labels[2][0] = cell7;
        labels[2][1] = cell8;
        labels[2][2] = cell9;

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
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
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

        GridPane.setHalignment(cell1, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(cell1, javafx.geometry.VPos.CENTER);
        cell1.setAlignment(javafx.geometry.Pos.CENTER);
        cell1.setPrefHeight(89.0);
        cell1.setPrefWidth(105.0);
        cell1.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell2, 1);
        cell2.setAlignment(javafx.geometry.Pos.CENTER);
        cell2.setPrefHeight(111.0);
        cell2.setPrefWidth(146.0);
        cell2.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell3, 2);
        cell3.setAlignment(javafx.geometry.Pos.CENTER);
        cell3.setPrefHeight(103.0);
        cell3.setPrefWidth(129.0);
        cell3.setFont(new Font(56.0));

        GridPane.setRowIndex(cell4, 1);
        cell4.setAlignment(javafx.geometry.Pos.CENTER);
        cell4.setPrefHeight(110.0);
        cell4.setPrefWidth(150.0);
        cell4.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell5, 1);
        GridPane.setRowIndex(cell5, 1);
        cell5.setAlignment(javafx.geometry.Pos.CENTER);
        cell5.setPrefHeight(102.0);
        cell5.setPrefWidth(171.0);
        cell5.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell6, 2);
        GridPane.setRowIndex(cell6, 1);
        cell6.setAlignment(javafx.geometry.Pos.CENTER);
        cell6.setPrefHeight(98.0);
        cell6.setPrefWidth(157.0);
        cell6.setFont(new Font(56.0));

        GridPane.setRowIndex(cell7, 2);
        cell7.setAlignment(javafx.geometry.Pos.CENTER);
        cell7.setPrefHeight(88.0);
        cell7.setPrefWidth(155.0);
        cell7.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell8, 1);
        GridPane.setRowIndex(cell8, 2);
        cell8.setAlignment(javafx.geometry.Pos.CENTER);
        cell8.setPrefHeight(122.0);
        cell8.setPrefWidth(200.0);
        cell8.setFont(new Font(56.0));

        GridPane.setColumnIndex(cell9, 2);
        GridPane.setHalignment(cell9, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cell9, 2);
        GridPane.setValignment(cell9, javafx.geometry.VPos.CENTER);
        cell9.setAlignment(javafx.geometry.Pos.CENTER);
        cell9.setPrefHeight(105.0);
        cell9.setPrefWidth(174.0);
        cell9.setFont(new Font(56.0));
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
        gridPane.getChildren().add(cell1);
        gridPane.getChildren().add(cell2);
        gridPane.getChildren().add(cell3);
        gridPane.getChildren().add(cell4);
        gridPane.getChildren().add(cell5);
        gridPane.getChildren().add(cell6);
        gridPane.getChildren().add(cell7);
        gridPane.getChildren().add(cell8);
        gridPane.getChildren().add(cell9);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getChildren().add(btnPlay);
        gridPane0.getChildren().add(btnBack);
        flowPane.getChildren().add(text);
        flowPane.getChildren().add(label);

        btnBack.setOnAction((ActionEvent event) -> {
            Parent root = new MainPageFXML(stage);
            stage.setScene(new Scene(root, 600, 500));
        });

        btnPlay.setOnAction((ActionEvent event) -> {
            if (!listView.getSelectionModel().isEmpty()) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        labels[i][j].setText("");
                    }
                }

                String fileName = listView.getSelectionModel().getSelectedItem().toString();
                RecordGame recordGame = new RecordGame();
                ArrayList<GameStep> steps = recordGame.playGameSteps(fileName);
                
                for (int i = 0; i < steps.size(); i++) {
                    GameStep gameStep = steps.get(i);
                    labels[gameStep.getRow()][gameStep.getCol()].setText(gameStep.getSymbol());
                }
            }
        });

        String[] filesList = new RecordGame().getAllFiles();
        for (String s : filesList) {
            listView.getItems().add(s);
        }
    }
}

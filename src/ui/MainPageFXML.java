package ui;

import data.ClientRequestsHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.json.JSONException;
import org.json.JSONObject;
import utility.JsonConverter;

public class MainPageFXML extends AnchorPane {

    protected final Label TicTacLable;
    protected final Button singleButton;
    protected final Box PlayerBox;
    protected static Label WelcomeLable = new Label();
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
    protected static Label playedLabel = new Label();
    protected static Label wonLabel = new Label();
    protected static Label scoreLabel = new Label();

    private static Stage stage;
    private static String myName;
    private static String css;

    public MainPageFXML(Stage stage) {
        this.stage = stage;

        TicTacLable = new Label();
        singleButton = new Button();
        PlayerBox = new Box();
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
        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        TicTacLable.setLayoutX(120.0);
        TicTacLable.setLayoutY(20.0);
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
        multiButton.setText("Online Players");

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

        GridPane.setColumnIndex(wonLabel, 1);
        GridPane.setHalignment(wonLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(wonLabel, 1);
        GridPane.setValignment(wonLabel, javafx.geometry.VPos.CENTER);

        GridPane.setColumnIndex(scoreLabel, 1);
        GridPane.setHalignment(scoreLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(scoreLabel, 2);
        GridPane.setValignment(scoreLabel, javafx.geometry.VPos.CENTER);

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

        PlayerBox.setId("greenButton");
        singleButton.setId("greenButton");
        twoButton.setId("greenButton");
        multiButton.setId("greenButton");
        PlayedLable.setId("greentext");
        playedLabel.setId("greentext");
        wonLabel.setId("orangeText");
        WinLable.setId("orangeText");
        scoreLabel.setId("scoreText");
        recordsButton.setId("greenButton");

        WelcomeLable.setId("greentext");
        TicTacLable.setId("gameText");
        PointsLable.setId("scoreText");

        label.setId("greentext");
        label0.setId("orangeText");
        label1.setId("scoreText");

        singleButton.setOnAction((ActionEvent event) -> {
            Parent root = new ChooseLevelStageFXML(stage, myName, "Computer", 0, false);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        twoButton.setOnAction((ActionEvent event) -> {
            Parent root = new PlayerTwoNameStageFXML(stage, myName);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        multiButton.setOnAction((ActionEvent event) -> {
            Parent root = new MultiplayersStageFXML(stage);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        recordsButton.setOnAction((ActionEvent event) -> {
            Parent root = new RecordsFXML(stage);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        this.stage.setOnCloseRequest((event) -> {
            ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertGoOfflineToJson());
            Platform.exit();
            System.exit(0);
        });
    }

    public static void updateMainPageUI(JSONObject jSONObject) {
        try {
            myName = jSONObject.getString("myUsername");
            WelcomeLable.setText("Welcome " + myName);
            playedLabel.setText(String.valueOf(jSONObject.getInt("Played")));
            wonLabel.setText(String.valueOf(jSONObject.getInt("Win")));
            scoreLabel.setText(String.valueOf(jSONObject.getInt("Total_Score")));
        } catch (JSONException ex) {
            Logger.getLogger(MainPageFXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showInvitationDialog(JSONObject jSONObject) {
        try {
            Stage popUpStage = new Stage();

            String invitationOwner = jSONObject.getString("InvitationOwner");
            String invitationReciever = jSONObject.getString("OpponentReciever");
            Parent root = new InvitationPopUPStageFXML(stage, popUpStage, invitationReciever, invitationOwner);

            popUpStage.initModality(Modality.WINDOW_MODAL);
            popUpStage.initOwner(stage);
            popUpStage.setResizable(false);

            Scene dialogScene = new Scene(root, 400, 350);
            dialogScene.getStylesheets().add(css);

            popUpStage.setTitle("Invitation");
            popUpStage.setScene(dialogScene);
            popUpStage.show();
        } catch (JSONException ex) {
            Logger.getLogger(MainPageFXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

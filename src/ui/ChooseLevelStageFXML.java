package ui;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChooseLevelStageFXML extends AnchorPane {

    protected final Button button;
    protected final Text text;
    protected final Text text0;
    protected final Button button0;
    protected final Button button1;
    protected int level;

    public ChooseLevelStageFXML(Stage stage, String myName, String computer, int mode, boolean recordFlag) {

        button = new Button();
        text = new Text();
        text0 = new Text();
        button0 = new Button();
        button1 = new Button();
        level = 0;

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        button.setLayoutX(110.0);
        button.setLayoutY(200.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(63.0);
        button.setPrefWidth(384.0);
        button.setText("Easy");

        text.setLayoutX(223.0);
        text.setLayoutY(162.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choose a level");
        text.setFont(new Font(24.0));

        text0.setLayoutX(107.0);
        text0.setLayoutY(91.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Tic-Tac-Toe Game");
        text0.setFont(new Font(48.0));

        button0.setLayoutX(107.0);
        button0.setLayoutY(288.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(63.0);
        button0.setPrefWidth(384.0);
        button0.setText("Normal");

        button1.setLayoutX(107.0);
        button1.setLayoutY(383.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(63.0);
        button1.setPrefWidth(384.0);
        button1.setText("Hard");

        getChildren().add(button);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(button0);
        getChildren().add(button1);

        //set ID for CSS
        text.setId("greentext");
        text0.setId("gameText");
        button.setId("orangeBoldButton");
        button0.setId("greenButton");
        button1.setId("orangeButton");

        button.setOnAction((ActionEvent event) -> {
            Parent root = new ChooseSymbolStageFXML(stage, myName, "Computer", 0, false, 0);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        button0.setOnAction((ActionEvent event) -> {
            Parent root = new ChooseSymbolStageFXML(stage, myName, "Computer", 0, false, 1);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });

        button1.setOnAction((ActionEvent event) -> {
            Parent root = new ChooseSymbolStageFXML(stage, myName, "Computer", 0, false, 2);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            stage.setScene(scene);
        });
    }
}

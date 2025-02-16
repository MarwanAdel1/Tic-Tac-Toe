package ui;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ui.ChooseSymbolStageFXML;

public class PlayerTwoNameStageFXML extends AnchorPane {

    protected final Text text;
    protected final TextField playerTwoTextField;
    protected final Button submitButton;
    protected final Text warningText;

    private Stage stage;

    private static String css;

    public PlayerTwoNameStageFXML(Stage stage, String myName) {
        this.stage = stage;

        text = new Text();
        playerTwoTextField = new TextField();
        submitButton = new Button();
        warningText = new Text();

        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        text.setLayoutX(97.0);
        text.setLayoutY(94.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Player Two Name ");
        text.setWrappingWidth(399.125);
        text.setFont(new Font(48.0));
        text.setId("orangeText");

        playerTwoTextField.setLayoutX(119.0);
        playerTwoTextField.setLayoutY(169.0);
        playerTwoTextField.setPrefHeight(31.0);
        playerTwoTextField.setPrefWidth(344.0);
        playerTwoTextField.setId("whiteField");

        submitButton.setLayoutX(208.0);
        submitButton.setLayoutY(282.0);
        submitButton.setMnemonicParsing(false);
        submitButton.setPrefHeight(49.0);
        submitButton.setPrefWidth(121.0);
        submitButton.setText("Submit");
        submitButton.setId("greenButton");

        warningText.setFill(javafx.scene.paint.Color.valueOf("#f80505"));
        warningText.setLayoutX(119.0);
        warningText.setLayoutY(219.0);
        warningText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        warningText.setStrokeWidth(0.0);
        warningText.setFont(new Font(18.0));
        warningText.setVisible(false);

        getChildren().add(text);
        getChildren().add(playerTwoTextField);
        getChildren().add(submitButton);
        getChildren().add(warningText);

        submitButton.setOnAction((ActionEvent event) -> {
            if (!playerTwoTextField.getText().isEmpty()) {
                Parent root = new ChooseSymbolStageFXML(stage, myName, playerTwoTextField.getText(), 1, false, -1);
                Scene scene = new Scene(root, 600, 500);
                scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
                stage.setScene(scene);
            } else {
                warningText.setText("Please insert player's name");
                warningText.setVisible(true);
            }
        });

    }
}

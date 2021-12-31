package ui.fxml;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PlayerTwoNameStageFXML extends AnchorPane {

    protected final Text text;
    protected final TextField PlayerTwoTextField;
    protected final Button SubmitButton;
    protected final Text WarningText;

    public PlayerTwoNameStageFXML() {

        text = new Text();
        PlayerTwoTextField = new TextField();
        SubmitButton = new Button();
        WarningText = new Text();

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

        PlayerTwoTextField.setLayoutX(119.0);
        PlayerTwoTextField.setLayoutY(169.0);
        PlayerTwoTextField.setPrefHeight(31.0);
        PlayerTwoTextField.setPrefWidth(344.0);

        SubmitButton.setLayoutX(208.0);
        SubmitButton.setLayoutY(282.0);
        SubmitButton.setMnemonicParsing(false);
        SubmitButton.setPrefHeight(49.0);
        SubmitButton.setPrefWidth(121.0);
        SubmitButton.setText("Submit");

        WarningText.setFill(javafx.scene.paint.Color.valueOf("#f80505"));
        WarningText.setLayoutX(119.0);
        WarningText.setLayoutY(219.0);
        WarningText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        WarningText.setStrokeWidth(0.0);
        WarningText.setText("Please enter player two name");
        WarningText.setFont(new Font(18.0));

        getChildren().add(text);
        getChildren().add(PlayerTwoTextField);
        getChildren().add(SubmitButton);
        getChildren().add(WarningText);

    }
}

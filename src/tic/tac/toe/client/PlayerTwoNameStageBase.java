package tic.tac.toe.client;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class PlayerTwoNameStageBase extends AnchorPane {

    protected final Text text;
    protected final TextField playerTwoTextField;
    protected final Button submitButton;
    protected final Text warningText;

    public PlayerTwoNameStageBase() {

        text = new Text();
        playerTwoTextField = new TextField();
        submitButton = new Button();
        warningText = new Text();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        text.setLayoutX(97.0);
        text.setLayoutY(92.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Player Two Name ");
        text.setWrappingWidth(399.125);
        text.setFont(new Font(48.0));

        playerTwoTextField.setLayoutX(97.0);
        playerTwoTextField.setLayoutY(192.0);
        playerTwoTextField.setPrefHeight(31.0);
        playerTwoTextField.setPrefWidth(319.0);

        submitButton.setLayoutX(448.0);
        submitButton.setLayoutY(192.0);
        submitButton.setMnemonicParsing(false);
        submitButton.setText("Submit");

        warningText.setFill(javafx.scene.paint.Color.valueOf("#f80505"));
        warningText.setLayoutX(97.0);
        warningText.setLayoutY(256.0);
        warningText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        warningText.setStrokeWidth(0.0);
        warningText.setText("Please enter player two name");
        warningText.setFont(new Font(18.0));

        getChildren().add(text);
        getChildren().add(playerTwoTextField);
        getChildren().add(submitButton);
        getChildren().add(warningText);
        
        
        submitButton.addEventHandler(ActionEvent.ACTION, new EventHandler < ActionEvent> ()
        {
        @Override
        public void handle(ActionEvent event) {
//            if PlayerTwoTextField is empty 
//                    show WarningText
        }}
       ); 

    }
}

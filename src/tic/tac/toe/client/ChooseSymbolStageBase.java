package tic.tac.toe.client;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ChooseSymbolStageBase extends AnchorPane {

    protected final Button xButtonChoose;
    protected final Button oButtonChoose;
    protected final Text text;

    public ChooseSymbolStageBase() {

        xButtonChoose = new Button();
        oButtonChoose = new Button();
        text = new Text();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        xButtonChoose.setLayoutX(45.0);
        xButtonChoose.setLayoutY(158.0);
        xButtonChoose.setMnemonicParsing(false);
        xButtonChoose.setPrefHeight(265.0);
        xButtonChoose.setPrefWidth(227.0);
        xButtonChoose.setText("X");
        xButtonChoose.setFont(new Font(96.0));

        oButtonChoose.setLayoutX(329.0);
        oButtonChoose.setLayoutY(158.0);
        oButtonChoose.setMnemonicParsing(false);
        oButtonChoose.setPrefHeight(265.0);
        oButtonChoose.setPrefWidth(227.0);
        oButtonChoose.setText("O");
        oButtonChoose.setFont(new Font(96.0));

        text.setLayoutX(205.0);
        text.setLayoutY(95.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choose one ");
        text.setWrappingWidth(206.6708984375);
        text.setFont(new Font(36.0));

        getChildren().add(xButtonChoose);
        getChildren().add(oButtonChoose);
        getChildren().add(text);

        
        xButtonChoose.addEventHandler(ActionEvent.ACTION, new EventHandler < ActionEvent> ()
        {
        @Override
        public void handle(ActionEvent event) {
            
        }}
       ); 
                
        oButtonChoose.addEventHandler(ActionEvent.ACTION, new EventHandler < ActionEvent> ()
        {
        @Override
        public void handle(ActionEvent event) {
            
        }}
       ); 
        
    }
}

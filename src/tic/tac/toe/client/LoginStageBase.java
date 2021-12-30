package tic.tac.toe.client;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class LoginStageBase extends AnchorPane {

    protected final Button loginButton;
    protected final Text text;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final Text text0;
    protected final Text text1;
    protected final TextField UsernameTextField;
    protected final TextField PasswordTextField;
    protected final Text text2;
    protected final Hyperlink signupText;

    public LoginStageBase() {

        loginButton = new Button();
        text = new Text();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        text0 = new Text();
        text1 = new Text();
        UsernameTextField = new TextField();
        PasswordTextField = new TextField();
        text2 = new Text();
        signupText = new Hyperlink();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        loginButton.setLayoutX(250.0);
        loginButton.setLayoutY(327.0);
        loginButton.setMnemonicParsing(false);
        loginButton.setPrefHeight(32.0);
        loginButton.setPrefWidth(96.0);
        loginButton.setText("Login");
        loginButton.setFont(new Font(18.0));

        text.setLayoutX(160.0);
        text.setLayoutY(423.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Don't have an account ? ");
        text.setFont(new Font(18.0));

        gridPane.setLayoutX(35.0);
        gridPane.setLayoutY(134.0);
        gridPane.setPrefHeight(193.0);
        gridPane.setPrefWidth(531.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(270.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(159.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(431.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(431.0);

        rowConstraints.setMaxHeight(112.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(79.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(154.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(154.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username:");
        text0.setWrappingWidth(119.78515625);
        text0.setFont(new Font(24.0));

        GridPane.setRowIndex(text1, 1);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password:");
        text1.setFont(new Font(24.0));

        GridPane.setColumnIndex(UsernameTextField, 1);
        UsernameTextField.setMaxHeight(USE_PREF_SIZE);
        UsernameTextField.setMaxWidth(USE_PREF_SIZE);
        UsernameTextField.setMinHeight(USE_PREF_SIZE);
        UsernameTextField.setMinWidth(USE_PREF_SIZE);
        UsernameTextField.setPrefHeight(31.0);
        UsernameTextField.setPrefWidth(397.0);

        GridPane.setColumnIndex(PasswordTextField, 1);
        GridPane.setRowIndex(PasswordTextField, 1);
        PasswordTextField.setMaxHeight(USE_PREF_SIZE);
        PasswordTextField.setMaxWidth(USE_PREF_SIZE);
        PasswordTextField.setMinHeight(USE_PREF_SIZE);
        PasswordTextField.setMinWidth(USE_PREF_SIZE);
        PasswordTextField.setPrefHeight(31.0);
        PasswordTextField.setPrefWidth(393.0);

        text2.setLayoutX(101.0);
        text2.setLayoutY(74.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Login");
        text2.setFont(new Font(48.0));

        signupText.setLayoutX(350.0);
        signupText.setLayoutY(398.0);
        signupText.setPrefHeight(35.0);
        signupText.setPrefWidth(76.0);
        signupText.setText("SignUp");
        signupText.setUnderline(true);
        signupText.setFont(new Font(18.0));

        getChildren().add(loginButton);
        getChildren().add(text);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(UsernameTextField);
        gridPane.getChildren().add(PasswordTextField);
        getChildren().add(gridPane);
        getChildren().add(text2);
        getChildren().add(signupText);
        
        loginButton.addEventHandler(ActionEvent.ACTION, new EventHandler < ActionEvent> ()
        {
        @Override
        public void handle(ActionEvent event) {
//            if statement to match username and password with database
//{
//                UsernameTextField
//                PasswordTextField}
        }}
       ); 
        
        signupText.addEventHandler(ActionEvent.ACTION, new EventHandler < ActionEvent> ()
        {
        @Override
        public void handle(ActionEvent event) {
            
        }}
       );  
        


    }
}

package tictactoeclient.ui.fxml;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public  class FXMLRegistrationBase extends BorderPane {

    protected final Label label;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final TextField txtUsername;
    protected final Label alreadyUsedLBL;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final TextField txtPassword;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final TextField txtConPassword;
    protected final Label NOTMatchLBL;
    protected final GridPane gridPane3;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final RowConstraints rowConstraints14;
    protected final Button btnSingUp;
    protected final Label label3;
    protected final Hyperlink loginLink;

    public FXMLRegistrationBase() {

        label = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        gridPane0 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        txtUsername = new TextField();
        alreadyUsedLBL = new Label();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        txtPassword = new TextField();
        gridPane2 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        txtConPassword = new TextField();
        NOTMatchLBL = new Label();
        gridPane3 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints12 = new RowConstraints();
        rowConstraints13 = new RowConstraints();
        rowConstraints14 = new RowConstraints();
        btnSingUp = new Button();
        label3 = new Label();
        loginLink = new Hyperlink();

        setMaxHeight(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        label.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setText("Sign-up");
        label.setFont(new Font("System Bold Italic", 48.0));
        label.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        setTop(label);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(353.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(242.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(405.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(358.0);

        rowConstraints.setMaxHeight(188.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(95.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(188.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(57.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(188.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(83.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(255.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(167.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label0.setPrefHeight(53.0);
        label0.setPrefWidth(210.0);
        label0.setText("Username:");
        GridPane.setMargin(label0, new Insets(0.0, 0.0, 0.0, 20.0));
        label0.setFont(new Font("System Bold Italic", 24.0));

        GridPane.setRowIndex(label1, 1);
        label1.setPrefHeight(53.0);
        label1.setPrefWidth(210.0);
        label1.setText("Password:");
        label1.setFont(new Font("System Bold Italic", 24.0));
        GridPane.setMargin(label1, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(label2, 2);
        label2.setPrefHeight(53.0);
        label2.setPrefWidth(247.0);
        label2.setText("Confirm Password:");
        label2.setFont(new Font("System Bold Italic", 24.0));
        label2.setPadding(new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(gridPane0, 1);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(352.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(352.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(172.0);
        columnConstraints2.setMinWidth(6.0);
        columnConstraints2.setPrefWidth(6.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(txtUsername, 1);
        txtUsername.setMaxHeight(USE_PREF_SIZE);
        txtUsername.setMaxWidth(USE_PREF_SIZE);
        txtUsername.setPrefHeight(31.0);
        txtUsername.setPrefWidth(329.0);

        GridPane.setRowIndex(alreadyUsedLBL, 2);
        alreadyUsedLBL.setPrefHeight(27.0);
        alreadyUsedLBL.setPrefWidth(131.0);
        alreadyUsedLBL.setText("Already Used");
        alreadyUsedLBL.setTextFill(javafx.scene.paint.Color.RED);
        alreadyUsedLBL.setVisible(false);
        alreadyUsedLBL.setFont(new Font(18.0));
        alreadyUsedLBL.setPadding(new Insets(0.0, 0.0, 0.0, 5.0));

        GridPane.setColumnIndex(gridPane1, 1);
        GridPane.setRowIndex(gridPane1, 1);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(350.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(350.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(172.0);
        columnConstraints4.setMinWidth(8.0);
        columnConstraints4.setPrefWidth(8.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(txtPassword, 1);
        txtPassword.setMaxHeight(USE_PREF_SIZE);
        txtPassword.setMaxWidth(USE_PREF_SIZE);
        txtPassword.setPrefHeight(31.0);
        txtPassword.setPrefWidth(329.0);

        GridPane.setColumnIndex(gridPane2, 1);
        GridPane.setRowIndex(gridPane2, 2);
        gridPane2.setMaxWidth(USE_PREF_SIZE);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(358.0);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(351.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(174.0);
        columnConstraints6.setMinWidth(0.0);
        columnConstraints6.setPrefWidth(7.0);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(30.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(txtConPassword, 1);
        txtConPassword.setMaxHeight(USE_PREF_SIZE);
        txtConPassword.setMaxWidth(USE_PREF_SIZE);
        txtConPassword.setPrefHeight(31.0);
        txtConPassword.setPrefWidth(329.0);

        GridPane.setRowIndex(NOTMatchLBL, 2);
        NOTMatchLBL.setPrefHeight(27.0);
        NOTMatchLBL.setPrefWidth(127.0);
        NOTMatchLBL.setText("Not Matched");
        NOTMatchLBL.setTextFill(javafx.scene.paint.Color.RED);
        NOTMatchLBL.setVisible(false);
        NOTMatchLBL.setPadding(new Insets(0.0, 0.0, 0.0, 5.0));
        NOTMatchLBL.setFont(new Font("System Bold", 18.0));
        GridPane.setMargin(NOTMatchLBL, new Insets(0.0, 0.0, 0.0, 5.0));

        GridPane.setColumnIndex(gridPane3, 1);
        GridPane.setRowIndex(gridPane3, 3);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(195.0);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(175.0);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMaxWidth(243.0);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(183.0);

        rowConstraints12.setMaxHeight(51.0);
        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPrefHeight(19.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints13.setMaxHeight(93.0);
        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(61.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints14.setMaxHeight(74.0);
        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(74.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(btnSingUp, 1);
        btnSingUp.setMnemonicParsing(false);
        btnSingUp.setPrefHeight(56.0);
        btnSingUp.setPrefWidth(99.0);
        btnSingUp.setText("Sign-up");
        btnSingUp.setFont(new Font("System Bold Italic", 18.0));
        GridPane.setMargin(btnSingUp, new Insets(-60.0, 0.0, 0.0, 0.0));

        GridPane.setRowIndex(label3, 2);
        label3.setPrefHeight(21.0);
        label3.setPrefWidth(179.0);
        label3.setText("Already have an accont?...");
        GridPane.setMargin(label3, new Insets(-80.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(loginLink, 1);
        GridPane.setRowIndex(loginLink, 2);
        loginLink.setText("Login");
        loginLink.setUnderline(true);
        loginLink.setFont(new Font("System Italic", 15.0));
        GridPane.setMargin(loginLink, new Insets(-80.0, 0.0, 0.0, 0.0));
        gridPane.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));
        setCenter(gridPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getChildren().add(txtUsername);
        gridPane0.getChildren().add(alreadyUsedLBL);
        gridPane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getRowConstraints().add(rowConstraints7);
        gridPane1.getRowConstraints().add(rowConstraints8);
        gridPane1.getChildren().add(txtPassword);
        gridPane.getChildren().add(gridPane1);
        gridPane2.getColumnConstraints().add(columnConstraints5);
        gridPane2.getColumnConstraints().add(columnConstraints6);
        gridPane2.getRowConstraints().add(rowConstraints9);
        gridPane2.getRowConstraints().add(rowConstraints10);
        gridPane2.getRowConstraints().add(rowConstraints11);
        gridPane2.getChildren().add(txtConPassword);
        gridPane2.getChildren().add(NOTMatchLBL);
        gridPane.getChildren().add(gridPane2);
        gridPane3.getColumnConstraints().add(columnConstraints7);
        gridPane3.getColumnConstraints().add(columnConstraints8);
        gridPane3.getRowConstraints().add(rowConstraints12);
        gridPane3.getRowConstraints().add(rowConstraints13);
        gridPane3.getRowConstraints().add(rowConstraints14);
        gridPane3.getChildren().add(btnSingUp);
        gridPane3.getChildren().add(label3);
        gridPane3.getChildren().add(loginLink);
        gridPane.getChildren().add(gridPane3);

    }
}

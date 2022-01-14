package ui;

import data.ClientRequestsHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.JSONObject;
import utility.JsonConverter;

public class RegistrationStageFXML extends AnchorPane {

    protected final Button signUpButton;
    protected final Text text;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Text text0;
    protected final Text text1;
    protected final TextField usernameTextField;
    protected final PasswordField passwordTextField;
    protected final Text text2;
    protected final PasswordField confirmPasswordTextField;
    protected static Label username_error = new Label();

    protected static Label password_error = new Label();

    protected final Label confirmPass_error;
    protected final Text text3;
    protected final Hyperlink loginHyperText;
    protected final Text gameText;
    private static String css;
    private static Stage stage;

    public RegistrationStageFXML(Stage stage) {
        this.stage = stage;

        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        signUpButton = new Button();
        text = new Text();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        text0 = new Text();
        text1 = new Text();
        usernameTextField = new TextField();
        passwordTextField = new PasswordField();
        text2 = new Text();
        confirmPasswordTextField = new PasswordField();

        confirmPass_error = new Label();
        text3 = new Text();
        loginHyperText = new Hyperlink();
        gameText = new Text();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(403.0);
        setPrefWidth(464.0);

        signUpButton.setLayoutX(168.0);
        signUpButton.setLayoutY(316.0);
        signUpButton.setMnemonicParsing(false);
        signUpButton.setPrefHeight(32.0);
        signUpButton.setPrefWidth(96.0);
        signUpButton.setText("Register");
        signUpButton.setFont(new Font(18.0));

        text.setLayoutX(196.0);
        text.setLayoutY(391.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Already have an account?..");
        text.setFont(new Font(18.0));

        gridPane.setLayoutX(32.0);
        gridPane.setLayoutY(132.0);
        gridPane.setPrefHeight(180.0);
        gridPane.setPrefWidth(400.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(270.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(134.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(431.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(266.0);

        rowConstraints.setMaxHeight(40.0);
        rowConstraints.setMinHeight(40.0);
        rowConstraints.setPrefHeight(40.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(20.0);
        rowConstraints0.setMinHeight(20.0);
        rowConstraints0.setPrefHeight(20.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(40.0);
        rowConstraints1.setMinHeight(40.0);
        rowConstraints1.setPrefHeight(40.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(20.0);
        rowConstraints2.setMinHeight(20.0);
        rowConstraints2.setPrefHeight(20.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(40.0);
        rowConstraints3.setMinHeight(40.0);
        rowConstraints3.setPrefHeight(40.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(20.0);
        rowConstraints4.setMinHeight(20.0);
        rowConstraints4.setPrefHeight(20.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(text0, javafx.geometry.HPos.LEFT);
        GridPane.setValignment(text0, javafx.geometry.VPos.CENTER);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username:");
        text0.setWrappingWidth(119.78515625);
        text0.setFont(new Font(16.0));

        GridPane.setHalignment(text1, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text1, 2);
        GridPane.setValignment(text1, javafx.geometry.VPos.CENTER);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password:");
        text1.setFont(new Font(16.0));

        GridPane.setColumnIndex(usernameTextField, 1);
        GridPane.setHalignment(usernameTextField, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(usernameTextField, javafx.geometry.VPos.CENTER);
        usernameTextField.setMaxHeight(USE_PREF_SIZE);
        usernameTextField.setMaxWidth(USE_PREF_SIZE);
        usernameTextField.setMinHeight(USE_PREF_SIZE);
        usernameTextField.setMinWidth(USE_PREF_SIZE);
        usernameTextField.setPrefHeight(31.0);
        usernameTextField.setPrefWidth(239.0);

        GridPane.setColumnIndex(passwordTextField, 1);
        GridPane.setHalignment(passwordTextField, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(passwordTextField, 2);
        GridPane.setValignment(passwordTextField, javafx.geometry.VPos.CENTER);
        passwordTextField.setMaxHeight(USE_PREF_SIZE);
        passwordTextField.setMaxWidth(USE_PREF_SIZE);
        passwordTextField.setMinHeight(USE_PREF_SIZE);
        passwordTextField.setMinWidth(USE_PREF_SIZE);
        passwordTextField.setPrefHeight(31.0);
        passwordTextField.setPrefWidth(241.0);

        GridPane.setHalignment(text2, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text2, 4);
        GridPane.setValignment(text2, javafx.geometry.VPos.CENTER);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Confirm Password:");
        text2.setFont(new Font(16.0));

        GridPane.setColumnIndex(confirmPasswordTextField, 1);
        GridPane.setHalignment(confirmPasswordTextField, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(confirmPasswordTextField, 4);
        GridPane.setValignment(confirmPasswordTextField, javafx.geometry.VPos.CENTER);
        confirmPasswordTextField.setMaxHeight(USE_PREF_SIZE);
        confirmPasswordTextField.setMaxWidth(USE_PREF_SIZE);
        confirmPasswordTextField.setMinHeight(USE_PREF_SIZE);
        confirmPasswordTextField.setMinWidth(USE_PREF_SIZE);
        confirmPasswordTextField.setPrefHeight(31.0);
        confirmPasswordTextField.setPrefWidth(240.0);

        GridPane.setColumnIndex(username_error, 1);
        GridPane.setRowIndex(username_error, 1);
        username_error.setPrefHeight(17.0);
        username_error.setPrefWidth(229.0);
        username_error.setTextFill(javafx.scene.paint.Color.RED);
        GridPane.setMargin(username_error, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(password_error, 1);
        GridPane.setRowIndex(password_error, 3);
        password_error.setPrefHeight(17.0);
        password_error.setPrefWidth(233.0);
        password_error.setTextFill(javafx.scene.paint.Color.RED);
        GridPane.setMargin(password_error, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(confirmPass_error, 1);
        GridPane.setRowIndex(confirmPass_error, 5);
        confirmPass_error.setPrefHeight(17.0);
        confirmPass_error.setPrefWidth(228.0);
        confirmPass_error.setTextFill(javafx.scene.paint.Color.RED);
        GridPane.setMargin(confirmPass_error, new Insets(0.0, 0.0, 0.0, 20.0));

        text3.setLayoutX(149.0);
        text3.setLayoutY(113.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Register");
        text3.setFont(new Font(40.0));

        loginHyperText.setLayoutX(401.0);
        loginHyperText.setLayoutY(366.0);
        loginHyperText.setPrefHeight(35.0);
        loginHyperText.setPrefWidth(76.0);
        loginHyperText.setText("Login");
        loginHyperText.setUnderline(true);
        loginHyperText.setFont(new Font(18.0));

        gameText.setLayoutX(-17.0);
        gameText.setLayoutY(57.0);
        gameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameText.setStrokeWidth(0.0);
        gameText.setText("Tic-Tac-Toe Game");
        gameText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameText.setWrappingWidth(516.099609375);
        gameText.setFont(new Font("Segoe UI Bold", 46.0));

        getChildren().add(signUpButton);
        getChildren().add(text);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(usernameTextField);
        gridPane.getChildren().add(passwordTextField);
        gridPane.getChildren().add(text2);
        gridPane.getChildren().add(confirmPasswordTextField);
        gridPane.getChildren().add(username_error);
        gridPane.getChildren().add(password_error);
        gridPane.getChildren().add(confirmPass_error);
        getChildren().add(gridPane);
        getChildren().add(text3);
        getChildren().add(loginHyperText);
        getChildren().add(gameText);

        signUpButton.setId("greenButton");
        gameText.setId("gameText");
        usernameTextField.setId("field");
        passwordTextField.setId("field");
        confirmPasswordTextField.setId("field");
        gridPane.setId("STAGE");
        text3.setId("greentext");

        signUpButton.setOnAction((ActionEvent event) -> {
            username_error.setText("");
            password_error.setText("");
            confirmPass_error.setText("");

            if (usernameTextField.getText().trim().isEmpty()) {
                username_error.setText("Please Enter A Valid Username");
            }

            if (passwordTextField.getText().trim().isEmpty()) {
                password_error.setText("Please Enter The Password");
            }

            if (!passwordTextField.getText().equals(confirmPasswordTextField.getText())) {
                confirmPass_error.setText("Not Match");
            }

            if (!usernameTextField.getText().trim().isEmpty()
                    && !passwordTextField.getText().trim().isEmpty()
                    && !confirmPasswordTextField.getText().trim().isEmpty()
                    && passwordTextField.getText().equals(confirmPasswordTextField.getText())) {

                ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);

                JSONObject convertedMessage = JsonConverter.convertRegisterMessageToJson(usernameTextField.getText(), passwordTextField.getText());

                clientRequestsHandler.sendJsonMessageToServer(convertedMessage);

            }

        });

        loginHyperText.setOnAction((ActionEvent event) -> {
            Parent root = new LoginStageFXML(stage);
            Scene scene = new Scene(root, 460, 400);
            scene.getStylesheets().add(css);
            stage.setScene(scene);
        });

    }

    public static void updateRegisterationUI(int id) {
        if (id == -1) {
            username_error.setText("This username is already taken");
        } else {
            Parent root = new LoginStageFXML(stage);
            Scene scene = new Scene(root, 460, 400);
            scene.getStylesheets().add(css);
            stage.setScene(scene);
        }
    }
}

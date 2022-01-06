package ui;

import data.ClientRequestsHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
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
    protected final Text text0;
    protected final Text text1;
    protected final TextField usernameTextField;
    protected final TextField passwordTextField;
    protected final Text text2;
    protected final TextField confirmPasswordTextField;
    protected final Text text3;
    protected final Hyperlink loginHyperText;
    protected final Text gameText;

    private Stage stage;

    public RegistrationStageFXML(Stage stage) {
        this.stage = stage;

        signUpButton = new Button();
        text = new Text();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        text0 = new Text();
        text1 = new Text();
        usernameTextField = new TextField();
        passwordTextField = new TextField();
        text2 = new Text();
        confirmPasswordTextField = new TextField();
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

        signUpButton.setLayoutX(176.0);
        signUpButton.setLayoutY(277.0);
        signUpButton.setMnemonicParsing(false);
        signUpButton.setPrefHeight(32.0);
        signUpButton.setPrefWidth(96.0);
        signUpButton.setText("Sign-Up");
        signUpButton.setFont(new Font(18.0));
        signUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
            }
        });

        text.setLayoutX(196.0);
        text.setLayoutY(391.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Already hava an account?..");
        text.setFont(new Font(18.0));

        gridPane.setLayoutX(35.0);
        gridPane.setLayoutY(146.0);
        gridPane.setPrefHeight(120.0);
        gridPane.setPrefWidth(400.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(270.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(134.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(431.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(266.0);

        rowConstraints.setMaxHeight(128.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(70.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(154.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(70.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(154.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(70.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(text0, javafx.geometry.HPos.LEFT);
        GridPane.setValignment(text0, javafx.geometry.VPos.CENTER);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username:");
        text0.setWrappingWidth(119.78515625);
        text0.setFont(new Font(16.0));

        GridPane.setHalignment(text1, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text1, 1);
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
        GridPane.setRowIndex(passwordTextField, 1);
        GridPane.setValignment(passwordTextField, javafx.geometry.VPos.CENTER);
        passwordTextField.setMaxHeight(USE_PREF_SIZE);
        passwordTextField.setMaxWidth(USE_PREF_SIZE);
        passwordTextField.setMinHeight(USE_PREF_SIZE);
        passwordTextField.setMinWidth(USE_PREF_SIZE);
        passwordTextField.setPrefHeight(31.0);
        passwordTextField.setPrefWidth(241.0);

        GridPane.setHalignment(text2, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text2, 2);
        GridPane.setValignment(text2, javafx.geometry.VPos.CENTER);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Confirm Password:");
        text2.setFont(new Font(16.0));

        GridPane.setColumnIndex(confirmPasswordTextField, 1);
        GridPane.setHalignment(confirmPasswordTextField, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(confirmPasswordTextField, 2);
        GridPane.setValignment(confirmPasswordTextField, javafx.geometry.VPos.CENTER);
        confirmPasswordTextField.setMaxHeight(USE_PREF_SIZE);
        confirmPasswordTextField.setMaxWidth(USE_PREF_SIZE);
        confirmPasswordTextField.setMinHeight(USE_PREF_SIZE);
        confirmPasswordTextField.setMinWidth(USE_PREF_SIZE);
        confirmPasswordTextField.setPrefHeight(31.0);
        confirmPasswordTextField.setPrefWidth(241.0);

        text3.setLayoutX(149.0);
        text3.setLayoutY(125.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Sign-Up");
        text3.setFont(new Font(48.0));

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
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(usernameTextField);
        gridPane.getChildren().add(passwordTextField);
        gridPane.getChildren().add(text2);
        gridPane.getChildren().add(confirmPasswordTextField);
        getChildren().add(gridPane);
        getChildren().add(text3);
        getChildren().add(loginHyperText);
        getChildren().add(gameText);

        signUpButton.setOnAction((ActionEvent event) -> {
            ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(""); ///// xxxxxxx
            
            JSONObject convertedMessage = JsonConverter.convertRegisterMessageToJson(usernameTextField.getText(), passwordTextField.getText());

            clientRequestsHandler.sendJsonMessageToServer(convertedMessage);
            
            Parent root = new LoginStageFXML(stage);
            stage.setScene(new Scene(root, 460, 400));
        });

        loginHyperText.setOnAction((ActionEvent event) -> {

            Parent root = new LoginStageFXML(stage);
            stage.setScene(new Scene(root, 460, 400));
        });

    }
}

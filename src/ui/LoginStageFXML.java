package ui;

import data.ClientRequestsHandler;
import javafx.event.ActionEvent;
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

public class LoginStageFXML extends AnchorPane {

    protected final Button LoginButton;
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
    protected final Hyperlink signupHyperText;
    protected final Text gameText;
    
    private Stage stage;

    public LoginStageFXML(Stage stage) {
        this.stage=stage;

        LoginButton = new Button();
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
        signupHyperText = new Hyperlink();
        gameText = new Text();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(403.0);
        setPrefWidth(464.0);

        LoginButton.setLayoutX(171.0);
        LoginButton.setLayoutY(261.0);
        LoginButton.setMnemonicParsing(false);
        LoginButton.setPrefHeight(32.0);
        LoginButton.setPrefWidth(96.0);
        LoginButton.setText("Login");
        LoginButton.setFont(new Font(18.0));

        text.setLayoutX(200.0);
        text.setLayoutY(391.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Don't have an account?.. ");
        text.setFont(new Font(18.0));

        gridPane.setLayoutX(35.0);
        gridPane.setLayoutY(136.0);
        gridPane.setPrefHeight(120.0);
        gridPane.setPrefWidth(393.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(270.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(117.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(431.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(286.0);

        rowConstraints.setMaxHeight(128.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(70.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(154.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(70.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(text0, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(text0, javafx.geometry.VPos.CENTER);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username:");
        text0.setWrappingWidth(119.78515625);
        text0.setFont(new Font(24.0));

        GridPane.setHalignment(text1, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(text1, 1);
        GridPane.setValignment(text1, javafx.geometry.VPos.CENTER);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password:");
        text1.setFont(new Font(24.0));

        GridPane.setColumnIndex(UsernameTextField, 1);
        GridPane.setHalignment(UsernameTextField, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(UsernameTextField, javafx.geometry.VPos.CENTER);
        UsernameTextField.setMaxHeight(USE_PREF_SIZE);
        UsernameTextField.setMaxWidth(USE_PREF_SIZE);
        UsernameTextField.setMinHeight(USE_PREF_SIZE);
        UsernameTextField.setMinWidth(USE_PREF_SIZE);
        UsernameTextField.setPrefHeight(31.0);
        UsernameTextField.setPrefWidth(239.0);

        GridPane.setColumnIndex(PasswordTextField, 1);
        GridPane.setHalignment(PasswordTextField, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(PasswordTextField, 1);
        GridPane.setValignment(PasswordTextField, javafx.geometry.VPos.CENTER);
        PasswordTextField.setMaxHeight(USE_PREF_SIZE);
        PasswordTextField.setMaxWidth(USE_PREF_SIZE);
        PasswordTextField.setMinHeight(USE_PREF_SIZE);
        PasswordTextField.setMinWidth(USE_PREF_SIZE);
        PasswordTextField.setPrefHeight(31.0);
        PasswordTextField.setPrefWidth(241.0);

        text2.setLayoutX(167.0);
        text2.setLayoutY(126.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Login");
        text2.setFont(new Font(48.0));

        signupHyperText.setLayoutX(389.0);
        signupHyperText.setLayoutY(366.0);
        signupHyperText.setPrefHeight(35.0);
        signupHyperText.setPrefWidth(76.0);
        signupHyperText.setText("SignUp");
        signupHyperText.setUnderline(true);
        signupHyperText.setFont(new Font(18.0));

        gameText.setLayoutX(-17.0);
        gameText.setLayoutY(57.0);
        gameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameText.setStrokeWidth(0.0);
        gameText.setText("Tic-Tac-Toe Game");
        gameText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameText.setWrappingWidth(516.099609375);
        gameText.setFont(new Font("Segoe UI Bold", 46.0));

        getChildren().add(LoginButton);
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
        getChildren().add(signupHyperText);
        getChildren().add(gameText);
        
        
        signupHyperText.setOnAction((ActionEvent event) -> {
            Parent root = new RegistrationStageFXML(stage);
            stage.setScene(new Scene(root, 460, 400));
        });
        
        LoginButton.setOnAction((ActionEvent event) -> {
            ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(""); ///// xxxxxxx
            
            JSONObject convertedMessage = JsonConverter.convertLoginMessageToJson(UsernameTextField.getText(), PasswordTextField.getText());

            clientRequestsHandler.sendJsonMessageToServer(convertedMessage);
            
            stage.close();
            
           
            Parent root = new MainPageFXML(stage);
            stage.setScene(new Scene(root, 600, 500));
            stage.show();
        });

    }
}

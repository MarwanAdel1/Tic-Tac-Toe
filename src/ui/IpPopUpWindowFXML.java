package ui;

import data.ClientRequestsHandler;
import java.net.Socket;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import utility.RecordGame;

public class IpPopUpWindowFXML extends AnchorPane {

    protected static TextField IPTextField = new TextField();
    protected final Label label;
    protected static Button IPConfirmBt = new Button();
    protected static ProgressIndicator loadingIndicator = new ProgressIndicator();

    private static Stage stage;

    public IpPopUpWindowFXML(Stage stage, Stage primaryStage) {
        this.stage = stage;

        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(300.0);

        IPTextField.setLayoutX(95.0);
        IPTextField.setLayoutY(50.0);
        IPTextField.setPrefHeight(32.0);
        IPTextField.setPrefWidth(162.0);

        label.setLayoutX(45.0);
        label.setLayoutY(50.0);
        label.setText("IP :");
        label.setFont(new Font("System Bold Italic", 22.0));

        IPConfirmBt.setLayoutX(108.0);
        IPConfirmBt.setLayoutY(107.0);
        IPConfirmBt.setMnemonicParsing(false);
        IPConfirmBt.setPrefHeight(38.0);
        IPConfirmBt.setPrefWidth(96.0);
        IPConfirmBt.setText("Confirm");
        IPConfirmBt.setFont(new Font("System Bold", 13.0));

        loadingIndicator.setLayoutX(129.0);
        loadingIndicator.setLayoutY(74.0);
        loadingIndicator.setVisible(false);

        getChildren().add(IPTextField);
        getChildren().add(label);
        getChildren().add(IPConfirmBt);
        getChildren().add(loadingIndicator);

        IPConfirmBt.setOnAction((event) -> {
            if (!IPTextField.getText().isEmpty()) {
                ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(primaryStage);

                loadingIndicator.setVisible(true);
                IPConfirmBt.setDisable(true);
                IPTextField.setDisable(true);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        clientRequestsHandler.connectToServer(IPTextField.getText());
                    }
                }).start();
            }
        });

        stage.setOnCloseRequest((event) -> {
            Platform.exit();
            System.exit(0);
        });

    }

    public static void updateUi(Socket socket) {
        loadingIndicator.setVisible(false);
        IPConfirmBt.setDisable(false);
        IPTextField.setDisable(false);
        if (socket != null) {
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Something Went Wrong");
            alert.showAndWait();
        }
    }
}

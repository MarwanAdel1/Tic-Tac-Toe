/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Optional;
import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author elshamey
 */
public class MainStage extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        Parent root = new RegistrationStageFXML(primaryStage);

        primaryStage.setTitle("Tic-Tac-Toe Game");
        primaryStage.setScene(new Scene(root, 460, 400));
        primaryStage.show();

        Stage dialog = new Stage();
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);

        Parent dialogVbox = new IpPopUpWindowFXML(dialog, primaryStage);
        Scene dialogScene = new Scene(dialogVbox, 300, 200);

        dialog.setScene(dialogScene);
        dialog.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void showDisconnectionDialog() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Connection Lost :(");
        Optional<ButtonType> result = alert.showAndWait();

        if (!result.isPresent() || result.get() == ButtonType.OK) {
            stage.close();
            stage.setScene(new Scene(new LoginStageFXML(stage), 460, 400));
            stage.show();
        }

    }
}

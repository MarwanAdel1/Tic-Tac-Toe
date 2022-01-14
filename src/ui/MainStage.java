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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author elshamey
 */
public class MainStage extends Application {

    private static Stage stage;
    private static String css;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        Parent root = new RegistrationStageFXML(primaryStage);

        primaryStage.setTitle("Tic-Tac-Toe Game");
        Scene scene = new Scene(root, 460, 400);
        scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
        primaryStage.setScene(scene);
        stage.setResizable(false);

        primaryStage.show();

        Stage dialog = new Stage();
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);

        Parent dialogVbox = new IpPopUpWindowFXML(dialog, primaryStage);
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialogScene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());

        dialog.setTitle("Connection To Server");
        dialog.setScene(dialogScene);
        dialog.setResizable(false);
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
            Parent root = new LoginStageFXML(stage);
            Scene scene = new Scene(root, 460, 400);
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.show();

            Stage dialog = new Stage();
            dialog.initModality(Modality.WINDOW_MODAL);
            dialog.initOwner(stage);

            Parent dialogVbox = new IpPopUpWindowFXML(dialog, stage);
            Scene dialogScene = new Scene(dialogVbox, 300, 200);
            dialogScene.getStylesheets().add(css);

            dialog.setTitle("Connection To Server");
            dialog.setScene(dialogScene);
            dialog.setResizable(false);
            dialog.show();
        }

    }
}

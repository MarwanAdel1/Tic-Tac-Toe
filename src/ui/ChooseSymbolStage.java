/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.fxml.ChooseSymbolStageFXML;

/**
 *
 * @author Nour
 */
public class ChooseSymbolStage extends Application {
    
    @Override
    public void start(Stage stage) {
        Parent root = new ChooseSymbolStageFXML();
        Scene scene = new Scene(root, 600 , 500);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

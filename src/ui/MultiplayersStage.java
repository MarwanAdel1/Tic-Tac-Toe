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
import ui.fxml.MultiplayersStageFXML;

/**
 *
 * @author Marwan Adel
 */
public class MultiplayersStage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Parent root = new MultiplayersStageFXML();
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

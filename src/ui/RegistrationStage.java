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
import ui.fxml.RegistrationStageFXML;

/**
 *
 * @author elshamey
 */
public class RegistrationStage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        Parent root = new RegistrationStageFXML();
        
        Scene scene = new Scene(root, 460, 400);
        
      
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

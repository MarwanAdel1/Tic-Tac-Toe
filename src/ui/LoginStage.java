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
import ui.fxml.LoginStageFXML;

/**
 *
 * @author Nour
 */
public class LoginStage extends Application {
    
   
    @Override
    public void start(Stage stage) {
        Parent root = new LoginStageFXML();
        Scene scene = new Scene(root, 460 , 400);
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

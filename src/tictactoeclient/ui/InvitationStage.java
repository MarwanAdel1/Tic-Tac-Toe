/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient.ui;

import tictactoeclient.ui.fxml.InvitationStageFXMLRoot;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marwan Adel
 */
public class InvitationStage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Parent root = new InvitationStageFXMLRoot();
        
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("Tic-Tac-Toe Game");
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

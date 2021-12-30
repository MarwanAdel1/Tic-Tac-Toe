
package tictactoeclient.ui;

import tictactoeclient.ui.fxml.LoserBase;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoserPageStage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Parent root = new LoserBase();
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

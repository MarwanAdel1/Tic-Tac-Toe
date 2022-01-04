package ui;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MultiplayersStageFXML extends AnchorPane {

    protected final Text gameText;
    protected final Label label;
    protected final Button backBt;
    protected final Button refreshBt;
    protected final Button inviteBt;
    protected final ScrollPane scrollPane;
    protected final ListView listView;
    
    private Stage stage;

    public MultiplayersStageFXML(Stage stage) {
        this.stage=stage;
        
        gameText = new Text();
        label = new Label();
        backBt = new Button();
        refreshBt = new Button();
        inviteBt = new Button();
        scrollPane = new ScrollPane();
        listView = new ListView();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(600.0);

        gameText.setLayoutX(14.0);
        gameText.setLayoutY(69.0);
        gameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameText.setStrokeWidth(0.0);
        gameText.setText("Tic-Tac-Toe Game");
        gameText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameText.setWrappingWidth(571.13671875);
        gameText.setFont(new Font("Segoe UI Bold Italic", 64.0));

        label.setLayoutX(98.0);
        label.setLayoutY(105.0);
        label.setText("Online Players");
        label.setUnderline(true);
        label.setFont(new Font("System Italic", 61.0));

        backBt.setLayoutX(122.0);
        backBt.setLayoutY(426.0);
        backBt.setMnemonicParsing(false);
        backBt.setPrefHeight(36.0);
        backBt.setPrefWidth(87.0);
        backBt.setText("Back");

        refreshBt.setLayoutX(237.0);
        refreshBt.setLayoutY(426.0);
        refreshBt.setMnemonicParsing(false);
        refreshBt.setPrefHeight(36.0);
        refreshBt.setPrefWidth(94.0);
        refreshBt.setText("Refresh");

        inviteBt.setLayoutX(362.0);
        inviteBt.setLayoutY(426.0);
        inviteBt.setMnemonicParsing(false);
        inviteBt.setPrefHeight(36.0);
        inviteBt.setPrefWidth(94.0);
        inviteBt.setText("Invite");

        scrollPane.setLayoutX(109.0);
        scrollPane.setLayoutY(194.0);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(358.0);

        listView.setPrefHeight(207.0);
        listView.setPrefWidth(359.0);
        scrollPane.setContent(listView);

        getChildren().add(gameText);
        getChildren().add(label);
        getChildren().add(backBt);
        getChildren().add(refreshBt);
        getChildren().add(inviteBt);
        getChildren().add(scrollPane);
        
        
        refreshBt.setOnAction((ActionEvent event) -> {
            
        });
        
        backBt.setOnAction((ActionEvent event) -> {
            Parent root= new MainPageFXML(stage);
            stage.setScene(new Scene(root, 600, 500));     
        });
        
        inviteBt.setOnAction((ActionEvent event) -> {
            Parent root = new InvitationStageFXMLRoot(stage);
            stage.setScene(new Scene(root, 600, 500));
        });

    }
}

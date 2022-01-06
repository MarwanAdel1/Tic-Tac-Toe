package ui;

import data.ClientRequestsHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class IpPopUpWindowFXML extends AnchorPane {

    protected final TextField IPTextField;
    protected final Label label;
    protected final Button IPConfirmBt;

    public IpPopUpWindowFXML(Stage stage) {

        IPTextField = new TextField();
        label = new Label();
        IPConfirmBt = new Button();

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
        IPConfirmBt.setText("Connect");
        IPConfirmBt.setFont(new Font("System Bold", 13.0));

        getChildren().add(IPTextField);
        getChildren().add(label);
        getChildren().add(IPConfirmBt);
        
        
        IPConfirmBt.setOnAction((event) -> {
            if(!IPTextField.getText().isEmpty()){
                ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(IPTextField.getText());
                stage.close();
            }
        });

    }
}

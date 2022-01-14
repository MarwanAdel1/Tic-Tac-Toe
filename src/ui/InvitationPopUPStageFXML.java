package ui;

import data.ClientRequestsHandler;
import java.util.Optional;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utility.JsonConverter;

public class InvitationPopUPStageFXML extends AnchorPane {

    protected final Text nameOfOpponent;
    protected final Text text;
    protected final Text text0;
    protected final Button declineButton;
    protected final Button acceptButton;
    protected final Text text1;

    private static Stage popUpStage;
    private static Stage stage;
    private static String myName;
    private static String css;

    public InvitationPopUPStageFXML(Stage stage, Stage popUpStage, String invitationReciever, String invitationOwner) {
        this.popUpStage = popUpStage;
        this.stage = stage;
        this.myName = invitationReciever;

        nameOfOpponent = new Text();
        text = new Text();
        text0 = new Text();
        declineButton = new Button();
        acceptButton = new Button();
        text1 = new Text();
        css = getClass().getResource("/assets/styles/style.css").toExternalForm();

        setId("greenStage");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(350.0);
        setPrefWidth(400.0);

        nameOfOpponent.setLayoutX(109.0);
        nameOfOpponent.setLayoutY(160.0);
        nameOfOpponent.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        nameOfOpponent.setStrokeWidth(0.0);
        nameOfOpponent.setText(invitationOwner);
        nameOfOpponent.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        nameOfOpponent.setWrappingWidth(183.0);
        nameOfOpponent.setFont(new Font("System Bold", 27.0));

        text.setLayoutX(84.0);
        text.setLayoutY(193.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Invite you to play a game ");
        text.setFont(new Font(24.0));

        text0.setLayoutX(106.0);
        text0.setLayoutY(225.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Do you want to play ?");
        text0.setFont(new Font(24.0));

        declineButton.setLayoutX(100.0);
        declineButton.setLayoutY(250.0);
        declineButton.setMnemonicParsing(false);
        declineButton.setText("Decline");
        declineButton.setFont(new Font(18.0));

        acceptButton.setLayoutX(223.0);
        acceptButton.setLayoutY(250.0);
        acceptButton.setMnemonicParsing(false);
        acceptButton.setText("Accept");
        acceptButton.setFont(new Font(18.0));

        text1.setLayoutX(98.0);
        text1.setLayoutY(66.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Invitation");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(204.13671875);
        text1.setFont(new Font("System Bold Italic", 40.0));

        getChildren().add(nameOfOpponent);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(declineButton);
        getChildren().add(acceptButton);
        getChildren().add(text1);

        nameOfOpponent.setText(invitationOwner);

        text.setId("greenText");
        text0.setId("greenText");
        nameOfOpponent.setId("orangeText");
        acceptButton.setId("greenButton");
        declineButton.setId("orangeButton");

        ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
        clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(invitationReciever, false));

        acceptButton.setOnAction((event) -> {
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertInviteResponseMessageToJson(invitationReciever, invitationOwner, true));
            Parent root = new InvitationResponseStageFXML(stage, invitationReciever, invitationOwner);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(getClass().getResource("/assets/styles/style.css").toExternalForm());
            popUpStage.close();
            stage.setScene(scene);
        });

        declineButton.setOnAction((event) -> {
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertInviteResponseMessageToJson(invitationReciever, invitationOwner, false));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(invitationReciever, true));
            popUpStage.close();
        });

        popUpStage.setOnCloseRequest((event) -> {
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertInviteResponseMessageToJson(invitationReciever, invitationOwner, false));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(invitationReciever, true));
            popUpStage.close();
        });

    }

    public static void invitationCanceled() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Invitation Cancelled");
        Optional<ButtonType> result = alert.showAndWait();

        if (!result.isPresent() || result.get() == ButtonType.OK) {
            if (popUpStage != null) {
                popUpStage.close();
            }
            ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(myName, true));
            Parent root = new MainPageFXML(stage);
            Scene scene = new Scene(root, 600, 500);
            stage.setScene(scene);
        }
    }
}

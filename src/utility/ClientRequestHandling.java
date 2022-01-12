/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import org.json.JSONException;
import org.json.JSONObject;
import ui.InvitationPopUPStageFXML;
import ui.InvitationResponseStageFXML;
import ui.InvitationStageFXMLRoot;
import ui.LoginStageFXML;
import ui.MainPageFXML;
import ui.MainStage;
import ui.MultiplayersStageFXML;
import ui.OnlineGameStageFXML;
import ui.RegistrationStageFXML;

/**
 *
 * @author Marwan Adel
 */
public class ClientRequestHandling {

    public static void requestHandling(String messageFromClient) {
        try {
            final JSONObject jSONObject = new JSONObject(messageFromClient);//
            String header = jSONObject.getString("Header");

            if (header.equalsIgnoreCase("Database")) { /// to/from Database
                if (jSONObject.getString("SubHeader").equalsIgnoreCase("Register")) {
                    Platform.runLater(() -> {
                        try {
                            RegistrationStageFXML.updateRegisterationUI(jSONObject.getInt("Operation"));
                        } catch (JSONException ex) {
                            Logger.getLogger(ClientRequestHandling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });

                } else if (jSONObject.getString("SubHeader").equalsIgnoreCase("Login")) {
                    Platform.runLater(() -> {
                        try {
                            LoginStageFXML.updateLoginUI(jSONObject.getInt("Operation"));
                        } catch (JSONException ex) {
                            Logger.getLogger(ClientRequestHandling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
                }
            } else if (header.equalsIgnoreCase("Online")) {
                Platform.runLater(() -> {

                    MultiplayersStageFXML.updateOnlineListUI(jSONObject);

                });
            } else if (header.equalsIgnoreCase("MainPage")) {
                Platform.runLater(() -> {

                    MainPageFXML.updateMainPageUI(jSONObject);

                });
            } else if (header.equalsIgnoreCase("bye")) {
                Platform.runLater(() -> {
                    MainStage.showDisconnectionDialog();
                });
            } else if (header.equalsIgnoreCase("Invite")) { /// send to another client
                Platform.runLater(() -> {
                    MainPageFXML.showInvitationDialog(jSONObject);
                });
            } else if (header.equalsIgnoreCase("Invite_Response")) {
                Platform.runLater(() -> {
                    InvitationStageFXMLRoot.updateInvitationUI(jSONObject);
                });
            } else if (header.equalsIgnoreCase("NotAvailable")) {
                Platform.runLater(() -> {
                    InvitationStageFXMLRoot.showNotAvailable();
                });
            } else if (header.equalsIgnoreCase("Ready")) {
                Platform.runLater(() -> {
                    InvitationStageFXMLRoot.updateAcceptedInvitationUI(jSONObject);
                });
            }else if(header.equalsIgnoreCase("Start")){
                Platform.runLater(() -> {
                    InvitationResponseStageFXML.updateStartUI();
                });
            }else if(header.equalsIgnoreCase("ShowGame")){
                Platform.runLater(() -> {
                    InvitationResponseStageFXML.showGame(jSONObject);
                });
            } else if (header.equalsIgnoreCase("Game")) {
                Platform.runLater(() -> {
                    OnlineGameStageFXML.playAndChangeFlags(jSONObject);
                });
            }else if(header.equalsIgnoreCase("ExitGame")){
                Platform.runLater(() -> {
                    OnlineGameStageFXML.exitGame();
                });
            }else if(header.equalsIgnoreCase("CancelOwnerInvite")){
                Platform.runLater(() -> {
                    InvitationPopUPStageFXML.invitationCanceled();
                });
            }
            else if (header.equalsIgnoreCase("PlayerResult")) {
                Platform.runLater(() -> {
                  OnlineGameStageFXML.showLoseAlert(jSONObject);
                });
            }
        } catch (JSONException ex) {
            Logger.getLogger(ClientRequestHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

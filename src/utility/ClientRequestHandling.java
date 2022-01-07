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
import ui.LoginStageFXML;
import ui.MainPageFXML;
import ui.MultiplayersStageFXML;
import ui.RegistrationStageFXML;

/**
 *
 * @author Marwan Adel
 */
public class ClientRequestHandling {

    public static void requestHandling(String messageFromClient) {
        try {
            final JSONObject jSONObject;

            jSONObject = new JSONObject(messageFromClient);//
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
            } else if (header.equalsIgnoreCase("Invite") || header.equalsIgnoreCase("Invite_Response")) { /// send to another client

            } else if (header.equalsIgnoreCase("Game")) {

            }
        } catch (JSONException ex) {
            Logger.getLogger(ClientRequestHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

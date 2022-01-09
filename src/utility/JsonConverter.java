/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

/**
 *
 * @author Marwan Adel
 */
public class JsonConverter {

    public static JSONObject convertRegisterMessageToJson(String userName, String password) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Database");
            jSONObject.put("SubHeader", "Register");
            jSONObject.put("Username", userName);
            jSONObject.put("Password", password);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        return jSONObject;
    }

    //login 
    public static JSONObject convertLoginMessageToJson(String userName, String password) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Database");
            jSONObject.put("SubHeader", "Login");
            jSONObject.put("Username", userName);
            jSONObject.put("Password", password);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    //game
    public static JSONObject convertGameMessageToJson(String sourceIP, String destinationIP, int row, int col) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Game");
            jSONObject.put("Source IP", sourceIP);
            jSONObject.put("Destination IP", destinationIP);
            jSONObject.put("Row", row);
            jSONObject.put("Column", col);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    //invitation
    public static JSONObject convertInviteMessageToJson(String myUsername, String opponentUsername) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Invite");
            jSONObject.put("InvitationOwner", myUsername);
            jSONObject.put("OpponentReciever", opponentUsername);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    //invitation response
    public static JSONObject convertInviteResponseMessageToJson(String myUsername, String opponentUsername, boolean isResponse) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Invite_Response");
            jSONObject.put("InvitationOwner", myUsername);
            jSONObject.put("OpponentReciever", opponentUsername);
            jSONObject.put("Response", isResponse);
        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    public static JSONObject convertGoOfflineToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Database");
            jSONObject.put("SubHeader", "GoOffline");
        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jSONObject;
    }

    public static JSONObject convertReadyNotificationToJson(String myUsername, String opponentUsername, boolean ready) {
        JSONObject jSONObject = new JSONObject();

        try {
            jSONObject.put("Header", "Ready");
            jSONObject.put("ReadyOwner", myUsername);
            jSONObject.put("ReadyReciever", opponentUsername);
            jSONObject.put("Ready", ready);            
        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jSONObject;
    }

    //convert json to string (invite - invite response accordong to the sent object)
    public static String convertJsonToString(JSONObject jSONObject) {
        String message;
        jSONObject = new JSONObject();
        message = jSONObject.toString();

        System.out.println(jSONObject);
        return message;
    }

}

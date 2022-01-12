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
    public static JSONObject convertGameMessageToJson(String opponentUsername, String symbol, int row, int col) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "Game");
            jSONObject.put("OpponentPlayer", opponentUsername);
            jSONObject.put("Symbol", symbol);
            jSONObject.put("Row", row);
            jSONObject.put("Column", col);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }
    
    public static JSONObject convertShowGameToAllToJson(String opponentPlayer, String symbol) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Header", "ShowGame");
            jSONObject.put("OpponentPlayer", opponentPlayer);
            jSONObject.put("Symbol", symbol);
            
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

    public static JSONObject convertAvailablityToJson(String myUsername, boolean available) {
        JSONObject jSONObject = new JSONObject();

        try {
            jSONObject.put("Header", "Available");
            jSONObject.put("User", myUsername);
            jSONObject.put("Availablity", available);

        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jSONObject;
    }

    public static JSONObject convertStartGameToJson(String opponentUsername) {
        JSONObject jSONObject = new JSONObject();

        try {
            jSONObject.put("Header", "Start");
            jSONObject.put("OpponentReciever", opponentUsername);
            
        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jSONObject;
    }
    
    public static JSONObject convertExitOnGameToJson(String opName){
        JSONObject jSONObject = new JSONObject();
        
        try {
            jSONObject.put("Header","ExitGame");
            jSONObject.put("OpponentPlayer", opName);
        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jSONObject;
    }

    
    public static JSONObject convertCancelOwnerInvitationToJson(String opName){
        JSONObject jSONObject = new JSONObject();
        
        try {
            jSONObject.put("Header","CancelOwnerInvite");
            jSONObject.put("OpponentPlayer", opName);
        } catch (JSONException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jSONObject;
    }
    
    
    public static JSONObject convertResultTojson(int result,String opponent){
     JSONObject jSONObject = new JSONObject();

            try {
                jSONObject.put("Header", "PlayerResult");
                jSONObject.put("Result", result);
                jSONObject.put("Opponent", opponent);

            } catch (JSONException ex) {
                Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
            }

            return jSONObject;
    }
    
}

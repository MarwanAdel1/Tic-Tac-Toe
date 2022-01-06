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
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("Header", "Database");
            jSONObject.put("SubHeader", "Register");
            jSONObject.put("Username", userName);
            jSONObject.put("Password", password);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    //login 
    public static JSONObject convertLoginMessageToJson(String userName, String password) {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
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
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
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
    public static JSONObject convertInviteMessageToJson(String sourceIP, String destinationIP) {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("Header", "Invite");
            jSONObject.put("Source IP", sourceIP);
            jSONObject.put("Destination IP", destinationIP);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    //invitation response
    public static JSONObject convertInviteResponseMessageToJson(String sourceIP, String destinationIP, boolean isResponse) {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("Header", "Invite_Response");
            jSONObject.put("Source IP", sourceIP);
            jSONObject.put("Destination IP", destinationIP);
            jSONObject.put("Response", isResponse);

        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(jSONObject);
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

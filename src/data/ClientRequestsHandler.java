/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author Marwan Adel
 */
public class ClientRequestsHandler {
    private Socket socket;
    private PrintStream printStream;
    private DataInputStream dataInputStream;
    
    private static ClientRequestsHandler clientRequestsHandler;

    private ClientRequestsHandler(String address) {
        try {
            socket = new Socket(address, 11114);
            printStream = new PrintStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());

            Thread th =new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String messageFromServer = dataInputStream.readLine();
                            System.out.println("Server Message : " + messageFromServer);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ClientRequestsHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            th.start();

        } catch (IOException ex) {
            Logger.getLogger(ClientRequestsHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ClientRequestsHandler createClientRequest(String address){
        if(clientRequestsHandler==null){
            clientRequestsHandler= new ClientRequestsHandler(address);
        }
        return clientRequestsHandler;
    }
    
    public void sendJsonMessageToServer(JSONObject jSONObject){
        printStream.println(jSONObject);
    }
}

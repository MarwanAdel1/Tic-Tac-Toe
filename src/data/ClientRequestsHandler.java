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
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.json.JSONException;
import org.json.JSONObject;
import ui.IpPopUpWindowFXML;
import utility.ClientRequestHandling;
import utility.JsonConverter;

/**
 *
 * @author Marwan Adel
 */
public class ClientRequestsHandler {

    private Socket socket;
    private PrintStream printStream;
    private DataInputStream dataInputStream;

    private static ClientRequestsHandler clientRequestsHandler = null;

    private Thread th;
    private Stage stage;

    private ClientRequestsHandler(Stage stage) {
        this.stage = stage;

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {

                if (socket != null) {
                    printStream.println(JsonConverter.convertGoOfflineToJson());

                    closeClient();
                }

                Platform.exit();
                System.exit(0);

            }
        });
    }

    public static ClientRequestsHandler createClientRequest(Stage stage) {
        if (clientRequestsHandler == null) {
            clientRequestsHandler = new ClientRequestsHandler(stage);
        }
        return clientRequestsHandler;
    }

    public void sendJsonMessageToServer(JSONObject jSONObject) {
        printStream.println(jSONObject);
    }

    public void connectToServer(String address) {
        try {
            socket = new Socket(address, 11114);

            if (socket != null) {

                Platform.runLater(() -> {
                    IpPopUpWindowFXML.updateUi(socket);
                });

                printStream = new PrintStream(socket.getOutputStream());
                dataInputStream = new DataInputStream(socket.getInputStream());
                th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                String messageFromServer = dataInputStream.readLine();
                                System.out.println("Server Message : " + messageFromServer);

                                if (messageFromServer != null) {//////////////  nstop l thread 
                                    ClientRequestHandling.requestHandling(messageFromServer);
                                } else {
                                    th.stop();
                                }
                            }
                        } catch (SocketException se) {

                            printStream.println(JsonConverter.convertGoOfflineToJson()); //// msh hitb3t *******

                            closeClient();

                            th.stop();

                        } catch (IOException ex) {
                            Logger.getLogger(ClientRequestsHandler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                th.start();
            }

        } catch (IOException ex) {
            Platform.runLater(() -> {
                IpPopUpWindowFXML.updateUi(socket);
            });
        }

    }

    public void closeClient() {
        try {
            printStream.close();
            dataInputStream.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientRequestsHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

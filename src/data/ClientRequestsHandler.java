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

/**
 *
 * @author Marwan Adel
 */
public class ClientRequestsHandler {

    Socket socket;
    PrintStream printStream;
    DataInputStream dataInputStream;

    public ClientRequestsHandler(String address) {
        try {
            socket = new Socket(address, 11114);
            printStream = new PrintStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());

            Thread th =new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread in Client is Running\n");
                    try {
                        printStream.println("Message From The Client");
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ClientHandler extends Thread {
    Socket socket;
    PrintStream printStream;
    DataInputStream inputStream;

    public static void main(String[] args) {
        new ClientHandler();
    }
    public ClientHandler() {
        try {
            socket = new Socket("127.0.0.1", 6666);
            inputStream = new DataInputStream(socket.getInputStream());
            printStream = new PrintStream(socket.getOutputStream());
            printStream.println("This is a message from the clinet");
            start();
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run() {
        while (true) {
            try {
                String reply = inputStream.readLine();
                System.out.println("repy from the server: " + reply);
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

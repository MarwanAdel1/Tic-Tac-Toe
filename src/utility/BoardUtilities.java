/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import data.ClientRequestsHandler;
import java.util.Optional;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import ui.MainPageFXML;
import ui.WinnerFXML;

/**
 *
 * @author Marwan Adel
 */
public class BoardUtilities {

    private static String css;

    public BoardUtilities() {
        css = getClass().getResource("/assets/styles/style.css").toExternalForm();
    }

    public static int checkBoard(Stage stage, String[][] xoBoard, boolean flag, String myName, String opName) {
        ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
        int check = 0;
        if (isWin(xoBoard)) {
            check = 1;
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game End");
            if (!flag) {
                clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(myName, check));
                alert.setHeaderText(myName + " Win");
            } else {
                clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(myName, 3));
                alert.setHeaderText(opName + " Win");
            }
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                Parent root = new MainPageFXML(stage);
                Scene scene = new Scene(root, 600, 500);
                scene.getStylesheets().add(css);
                stage.setScene(scene);
            }
        }

        if (isDraw(xoBoard)) {
            check = 2;
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(myName, check));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game End");
            alert.setHeaderText("Draw");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {

                Parent root = new MainPageFXML(stage);
                Scene scene = new Scene(root, 600, 500);
                scene.getStylesheets().add(css);
                stage.setScene(scene);
            }

        }

        return check;
    }

    public static int checkBoardOnline(Stage stage, String[][] xoBoard, String myName, String opName) {
        ClientRequestsHandler clientRequestsHandler = ClientRequestsHandler.createClientRequest(stage);
        int check = 0;
        if (isWin(xoBoard)) {
            check = 1;
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertWinToJson(opName, check));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(myName, check));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(opName, 3));

            Parent root = new WinnerFXML(stage, myName);
            Scene scene = new Scene(root, 600, 500);
            scene.getStylesheets().add(css);
            stage.setScene(scene);
        }

        if (isDraw(xoBoard)) {
            check = 2;

            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertWinToJson(opName, check));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(myName, check));
            clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertUpdateScoreToJson(opName, check));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game End");
            alert.setHeaderText("Draw");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                clientRequestsHandler.sendJsonMessageToServer(JsonConverter.convertAvailablityToJson(myName, true));

                Parent root = new MainPageFXML(stage);
                Scene scene = new Scene(root, 600, 500);
                scene.getStylesheets().add(css);
                stage.setScene(scene);
            }

        }
        return check;
    }

    public static boolean isWin(String[][] xoBoard) {
        boolean result = false;
        for (int i = 0; i < 3 && !result; i++) {
            // check rows
            if ((!xoBoard[i][0].equalsIgnoreCase("d")) && (xoBoard[i][0].equals(xoBoard[i][1])) && (xoBoard[i][0].equals(xoBoard[i][2]))) {
                result = true;
                break;
            }
            // check col
            if ((!xoBoard[0][i].equalsIgnoreCase("d")) && (xoBoard[0][i].equals(xoBoard[1][i])) && (xoBoard[0][i].equals(xoBoard[2][i]))) {
                result = true;
                break;
            }
        }
        // check diagonals
        if ((!xoBoard[0][0].equalsIgnoreCase("d")) && (xoBoard[0][0].equals(xoBoard[1][1])) && (xoBoard[0][0].equals(xoBoard[2][2]))) {
            result = true;
        }

        if ((!xoBoard[0][2].equalsIgnoreCase("d")) && (xoBoard[0][2].equals(xoBoard[1][1])) && (xoBoard[0][2].equals(xoBoard[2][0]))) {
            result = true;
        }

        return result;
    }

    public static boolean isDraw(String[][] xoBoard) {
        boolean result = true;
        if (!isWin(xoBoard)) {
            for (int i = 0; i < 3 && result; i++) {
                for (int j = 0; j < 3 && result; j++) {
                    result = !xoBoard[i][j].equals("d");
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static String getSymbol(boolean flag) {
        if (flag) {
            return "O";
        } else {
            return "X";
        }
    }
}

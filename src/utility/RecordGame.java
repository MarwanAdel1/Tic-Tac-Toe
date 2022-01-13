/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class RecordGame {

    
    File dir;
    File file;

    public RecordGame() {
        dir = new File("../Records");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        file = new File(dir, getFormatFromTime(getDateTime(), "Ghada"));
    }

    public File StartRecordingGame(int row, int col, String symbol) {

        FileOutputStream fileOutputStream = null;
        try {
            String Step = row + ";" + col + ";" + symbol + "\n";
            fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(Step.getBytes());
            fileOutputStream.flush();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<GameStep> playGameSteps(String fileName) {
        Scanner scanner = null;
        ArrayList<GameStep> gameSteps = new ArrayList<>();
        savedFile = new File(dir, fileName);
        try {
            fileInputStream = new FileInputStream(savedFile);
            scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(";");

                GameStep gameStep = new GameStep();
                gameStep.setSymbol(str[0]);
                gameStep.setRow(Integer.parseInt(str[1]));
                gameStep.setCol(Integer.parseInt(str[2]));
                
                gameSteps.add(gameStep);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return gameSteps;
    }

    public void deleteFile(String opName) {
        savedFile = new File(dir, opName + " " + time);
        savedFile.delete();
    }

    public String[] getAllFiles() {

        String[] files = dir.list();
        return files;
    }

}

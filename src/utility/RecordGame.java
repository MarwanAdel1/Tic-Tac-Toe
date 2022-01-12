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
        return file;
    }

    public String[] StartReadingRecord(File file) {
        String[] str = null;
        FileInputStream fileInputStream = null;
        Scanner scanner = null;

        try {
            fileInputStream = new FileInputStream(file);
            scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                str = scanner.nextLine().split(";");

                /*for (int i = 0; i < str.length; i++) {
                    System.out.print(str[i]+"\n");
                }*/
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                fileInputStream.close();
                scanner.close();
            } catch (IOException ex) {
                Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return str; //returns an array that contains row, col, symbol
    }

    public String[] getAllFiles() {
        String[] files = dir.list();
 
        return files;
    }

    public String getFormatFromTime(LocalDateTime localDateTime, String opponentName) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd---HH-mm-ss");
        dtf.format(localDateTime);

        return opponentName + dtf.format(localDateTime);
    }

    public LocalDateTime getDateTime() {
        LocalDateTime now = LocalDateTime.now();

        return now;
    }

    public int printTime() {
        System.out.println(getFormatFromTime(getDateTime(), "Ghada"));
        return 1;
    }

    public static void main(String[] args) {

        String testStr = "1;2;3\n";

    }
}

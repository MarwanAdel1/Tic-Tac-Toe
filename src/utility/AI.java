/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Random;
import pojo.Move;

/**
 *
 * @author Marwan Adel
 */
public class AI {

    public static int COUNT = 0;

    public static Move easyAI(String[][] xoBoard) {
        Move move = new Move();
        for (int i = 0; i < 3 && move.getI() == -1; i++) {
            for (int j = 0; j < 3 && move.getI() == -1; j++) {
                if (xoBoard[i][j].equals("d")) {
                    move.setI(i);
                    move.setJ(j);
                    break;
                }
            }
        }

        return move;
    }

    public static Move normalAI(String[][] xoBoard) {
        Move move = new Move();

        if (COUNT < 4) {
            do {
                int random = new Random().nextInt(8);
                //System.out.println(random + "\n" + xoBoard[move.getI()][move.getJ()].getText().isEmpty() + "\n");
                switch (random) {
                    case 0:

                        move.setI(0);
                        move.setJ(0);

                        break;
                    case 1:

                        move.setI(0);
                        move.setJ(1);

                        break;
                    case 2:

                        move.setI(0);
                        move.setJ(2);

                        break;
                    case 3:

                        move.setI(1);
                        move.setJ(0);

                        break;
                    case 4:

                        move.setI(1);
                        move.setJ(1);

                        break;
                    case 5:

                        move.setI(1);
                        move.setJ(2);

                        break;
                    case 6:

                        move.setI(2);
                        move.setJ(0);

                        break;
                    case 7:

                        move.setI(2);
                        move.setJ(1);

                        break;
                    case 8:

                        move.setI(2);
                        move.setJ(2);

                        break;
                }

            } while (!xoBoard[move.getI()][move.getJ()].equalsIgnoreCase("d") && COUNT < 4);
            
            COUNT++;
        }
        

        return move;
    }

}

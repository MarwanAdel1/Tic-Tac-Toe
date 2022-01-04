/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;


import java.util.Random;
import javafx.scene.control.Label;
import pojo.Move;


/**
 *
 * @author Marwan Adel
 */
public class AI {
    
    public static int EasyAI(Label[] xoBoard){
        
        int random = new Random().nextInt(8);
        while(!xoBoard[random].getText().isEmpty()){
            random =new Random().nextInt(9);
        }
        
        return random;

    }
    
}

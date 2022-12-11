package com.mycompany.brickbreakergame;
/**
 * @author rishavranjan
 */
import javax.swing.JFrame;

public class BrickBreakerGame {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setTitle("BrickBreaker");
        obj.setSize(706, 600);
        obj.setVisible(true);
        obj.setResizable(true);
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //GamePlay object
        GamePlay gameplay = new GamePlay();
        obj.add(gameplay);
    }
}

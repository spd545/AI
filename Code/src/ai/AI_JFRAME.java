/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import static ai.AI_JFRAME.inp;
import static ai.AI_JFRAME.cap;
import static ai.AI_JFRAME.response;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author spd54
 */
public class AI_JFRAME extends JPanel{
    public static boolean cap = false;
    public static String status = "Stable";
    public static String inp = "";
    public static String response = "Hello";
    public static JFrame screen;
    public AI_JFRAME(){
        super();
        setFocusable(true);
        setBackground(java.awt.Color.WHITE);
        MouseListener ml = new Mouse();
        KeyListener kl = new Key();
        addMouseListener(ml);
        addKeyListener(kl);
    }
    public static void main(String[] args) throws InterruptedException{
        AI_JFRAME board = new AI_JFRAME();
        screen = new JFrame("AI");   
        screen.add(board);
        screen.setUndecorated(true);
        board.setSize(544, 384);
        screen.setPreferredSize(new Dimension(544, 384));
        screen.setResizable(false);// window is 500 pixels wide, 384 high
        screen.pack();
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                board.repaint();
            }
        }, 0, 100);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage exit = null;
        try {
            exit = ImageIO.read(getClass().getResourceAsStream("/Assets/exit.png"));
        } catch (IOException ex) {
            System.out.println("Something is not right");
        }
        Font f = new Font("Times New Roman",Font.BOLD,25);
        g.setFont(f);
        g.drawImage(exit, 512, 0, null);
        g.setColor(Color.BLUE);
        g.drawString("AI: "+response, 0, 25);
        g.drawString("Input "+inp, 0, 50);
        g.drawString("(AI: Status "+status+")", 300, 25);
        if(response.equalsIgnoreCase("does not compute")){
            status = "Error";
        }else{
            status = "Stable";
        }
}
}
class Key implements KeyListener{
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_SHIFT){
            cap = !cap;
        }
        if(cap){
        if(ke.getKeyCode() == KeyEvent.VK_A){
            inp += "A";
        }else if(ke.getKeyCode() == KeyEvent.VK_B){
            inp += "B";
        }else if(ke.getKeyCode() == KeyEvent.VK_C){
            inp += "C";
        }else if(ke.getKeyCode() == KeyEvent.VK_D){
            inp += "D";
        }else if(ke.getKeyCode() == KeyEvent.VK_E){
            inp += "E";
        }else if(ke.getKeyCode() == KeyEvent.VK_F){
            inp += "F";
        }else if(ke.getKeyCode() == KeyEvent.VK_G){
            inp += "G";
        }else if(ke.getKeyCode() == KeyEvent.VK_H){
            inp += "H";
        }else if(ke.getKeyCode() == KeyEvent.VK_I){
            inp += "I";
        }else if(ke.getKeyCode() == KeyEvent.VK_J){
            inp += "J";
        }else if(ke.getKeyCode() == KeyEvent.VK_K){
            inp += "K";
        }else if(ke.getKeyCode() == KeyEvent.VK_L){
            inp += "L";
        }else if(ke.getKeyCode() == KeyEvent.VK_M){
            inp += "M";
        }else if(ke.getKeyCode() == KeyEvent.VK_N){
            inp += "N";
        }else if(ke.getKeyCode() == KeyEvent.VK_O){
            inp += "O";
        }else if(ke.getKeyCode() == KeyEvent.VK_P){
            inp += "P";
        }else if(ke.getKeyCode() == KeyEvent.VK_Q){
            inp += "Q";
        }else if(ke.getKeyCode() == KeyEvent.VK_R){
            inp += "R";
        }else if(ke.getKeyCode() == KeyEvent.VK_S){
            inp += "S";
        }else if(ke.getKeyCode() == KeyEvent.VK_T){
            inp += "T";
        }else if(ke.getKeyCode() == KeyEvent.VK_U){
            inp += "U";
        }else if(ke.getKeyCode() == KeyEvent.VK_V){
            inp += "V";
        }else if(ke.getKeyCode() == KeyEvent.VK_W){
            inp += "W";
        }else if(ke.getKeyCode() == KeyEvent.VK_X){
            inp += "X";
        }else if(ke.getKeyCode() == KeyEvent.VK_Y){
            inp += "Y";
        }else if(ke.getKeyCode() == KeyEvent.VK_Z){
            inp += "Z";
        }else if(ke.getKeyCode() == KeyEvent.VK_0){
            inp += "0";
        }else if(ke.getKeyCode() == KeyEvent.VK_1){
            inp += "1";
        }else if(ke.getKeyCode() == KeyEvent.VK_2){
            inp += "2";
        }else if(ke.getKeyCode() == KeyEvent.VK_3){
            inp += "3";
        }else if(ke.getKeyCode() == KeyEvent.VK_4){
            inp += "4";
        }else if(ke.getKeyCode() == KeyEvent.VK_5){
            inp += "5";
        }else if(ke.getKeyCode() == KeyEvent.VK_6){
            inp += "6";
        }else if(ke.getKeyCode() == KeyEvent.VK_7){
            inp += "7";
        }else if(ke.getKeyCode() == KeyEvent.VK_8){
            inp += "8";
        }else if(ke.getKeyCode() == KeyEvent.VK_9){
            inp += "9";
            System.out.println("9");
        }
        }else if(cap == false){
        if(ke.getKeyCode() == KeyEvent.VK_A){
            inp += "a";
        }else if(ke.getKeyCode() == KeyEvent.VK_B){
            inp += "b";
        }else if(ke.getKeyCode() == KeyEvent.VK_C){
            inp += "c";
        }else if(ke.getKeyCode() == KeyEvent.VK_D){
            inp += "d";
        }else if(ke.getKeyCode() == KeyEvent.VK_E){
            inp += "e";
        }else if(ke.getKeyCode() == KeyEvent.VK_F){
            inp += "f";
        }else if(ke.getKeyCode() == KeyEvent.VK_G){
            inp += "g";
        }else if(ke.getKeyCode() == KeyEvent.VK_H){
            inp += "h";
        }else if(ke.getKeyCode() == KeyEvent.VK_I){
            inp += "i";
        }else if(ke.getKeyCode() == KeyEvent.VK_J){
            inp += "j";
        }else if(ke.getKeyCode() == KeyEvent.VK_K){
            inp += "k";
        }else if(ke.getKeyCode() == KeyEvent.VK_L){
            inp += "l";
        }else if(ke.getKeyCode() == KeyEvent.VK_M){
            inp += "m";
        }else if(ke.getKeyCode() == KeyEvent.VK_N){
            inp += "n";
        }else if(ke.getKeyCode() == KeyEvent.VK_O){
            inp += "o";
        }else if(ke.getKeyCode() == KeyEvent.VK_P){
            inp += "p";
        }else if(ke.getKeyCode() == KeyEvent.VK_Q){
            inp += "q";
        }else if(ke.getKeyCode() == KeyEvent.VK_R){
            inp += "r";
        }else if(ke.getKeyCode() == KeyEvent.VK_S){
            inp += "s";
        }else if(ke.getKeyCode() == KeyEvent.VK_T){
            inp += "t";
        }else if(ke.getKeyCode() == KeyEvent.VK_U){
            inp += "u";
        }else if(ke.getKeyCode() == KeyEvent.VK_V){
            inp += "v";
        }else if(ke.getKeyCode() == KeyEvent.VK_W){
            inp += "w";
        }else if(ke.getKeyCode() == KeyEvent.VK_X){
            inp += "x";
        }else if(ke.getKeyCode() == KeyEvent.VK_Y){
            inp += "y";
        }else if(ke.getKeyCode() == KeyEvent.VK_Z){
            inp += "z";
        }else if(ke.getKeyCode() == KeyEvent.VK_0){
            inp += "0";
        }else if(ke.getKeyCode() == KeyEvent.VK_1){
            inp += "1";
        }else if(ke.getKeyCode() == KeyEvent.VK_2){
            inp += "2";
        }else if(ke.getKeyCode() == KeyEvent.VK_3){
            inp += "3";
        }else if(ke.getKeyCode() == KeyEvent.VK_4){
            inp += "4";
        }else if(ke.getKeyCode() == KeyEvent.VK_5){
            inp += "5";
        }else if(ke.getKeyCode() == KeyEvent.VK_6){
            inp += "6";
        }else if(ke.getKeyCode() == KeyEvent.VK_7){
            inp += "7";
        }else if(ke.getKeyCode() == KeyEvent.VK_8){
            inp += "8";
        }else if(ke.getKeyCode() == KeyEvent.VK_9){
            inp += "9";
        }
        }
        if(!cap){if(ke.getKeyCode() == KeyEvent.VK_SPACE){
            inp += " ";
        }if(ke.getKeyCode() == KeyEvent.VK_PERIOD){
            inp += ".";
        }if(ke.getKeyCode() == KeyEvent.VK_COMMA){
            inp += ",";
        }if(ke.getKeyCode() == KeyEvent.VK_SLASH){
            inp += "/";
        }if(ke.getKeyCode() == KeyEvent.VK_BACK_SLASH){
            inp += "\\";
        }if(ke.getKeyCode() == KeyEvent.VK_QUOTE){
            inp += "\'";
        }if(ke.getKeyCode() == KeyEvent.VK_COLON){
            inp += ";";
        }}if(cap){
        if(ke.getKeyCode() == KeyEvent.VK_SPACE){
            inp += " ";
        }if(ke.getKeyCode() == KeyEvent.VK_PERIOD){
            inp += ">";
        }if(ke.getKeyCode() == KeyEvent.VK_COMMA){
            inp += "<";
        }if(ke.getKeyCode() == KeyEvent.VK_SLASH){
            inp += "?";
        }if(ke.getKeyCode() == KeyEvent.VK_BACK_SLASH){
            inp += "|";
        }if(ke.getKeyCode() == KeyEvent.VK_QUOTE){
            inp += "\"";
        }if(ke.getKeyCode() == KeyEvent.VK_COLON){
            inp += ":";
        }
        }
        if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            String inp1 = inp;
            inp = "";
            if(inp1.length()>0){
            for(int i = 0; i<inp1.length()-1;i++){
                inp += inp1.toCharArray()[i];
            }
            }else{
                inp = inp1;
            }
            inp1 = "";
        }
        if (ke.getKeyCode() == KeyEvent.VK_ENTER){
            if(inp.equalsIgnoreCase("hello")){
                response = "How are you";
                inp = "";
            }else if(inp.equalsIgnoreCase("good")){
                response = "I am doing good!";
                inp = "";
            }else if(inp.equalsIgnoreCase("bad")){
                response = "That is too bad";
                inp = "";
            }else{
                response = "Does not compute";
                inp = "";
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
class Mouse implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton() == MouseEvent.BUTTON1){
            if((me.getX()>=512&&me.getX()<=512+32)&&(me.getY()<=32&&me.getY()>=0)){System.exit(0);}//exitButton
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
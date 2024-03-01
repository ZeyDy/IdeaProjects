package tankas;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import static tankas.Tankas.y;

public class Main {
    public static void main(String[] args) {
        Tankas tankas = new Tankas();
        JFrame frame = new JFrame();
        JTextField textField = new JTextField();
        Scanner sc = new Scanner(System.in);
        sc.next();
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_W) {
                    tankas.pirmyn();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}

package org.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Type TankFrame.java
 * @Desc
 * @Author Oops
 * @Date 2020/9/24 2:51 下午
 */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);

        this.addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("paint");
        g.fillRect(x, y, 50, 50);
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 87:
                    // 向上
                    y -= 10;
                    break;
                case 65:
                    // 向左
                    x -= 10;
                    break;
                case 83:
                    // 向下
                    y += 10;
                    break;
                case 68:
                    // 向右
                    x += 10;
                    break;
                default:
                    break;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("key release");
        }
    }
}

package org.tank;

import java.awt.*;
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
        setSize(800,600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x,y,50,50);
        x+=10;
        y+=10;
    }
}

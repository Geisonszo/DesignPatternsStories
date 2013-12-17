package com.programcreek.designpatterns.observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 上午9:58
 * Description: To change this template use File | Settings | File Templates.
 */
public class SimpleSwingExample {
    public static void run() {
        JFrame frame = new JFrame("Frame Title");
        final JTextArea comp = new JTextArea();
        JButton btn = new JButton("click");
        frame.getContentPane().add(comp, BorderLayout.CENTER);
        frame.getContentPane().add(btn, BorderLayout.SOUTH);

        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comp.setText("Button has been clicked");
            }
        });

        int width = 300;
        int height = 300;
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}

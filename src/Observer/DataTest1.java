/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user1
 */
public class DataTest1 {

    JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Mowno ja nawmu ety knopku?");

        button.addActionListener(new FirstListener());
        button.addActionListener(new SecondListener());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

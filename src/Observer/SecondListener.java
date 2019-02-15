/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user1
 */
public class SecondListener implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sdelaj eto! ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author pc_owner
 */
public class CustomWindowListener extends WindowAdapter {
    private Gradebook gradebook;
    public CustomWindowListener(Gradebook g) {
        gradebook = g;
    }
    @Override
    public void windowClosing(WindowEvent e) {
        gradebook.saveGradebookAndQuit();
    }
}

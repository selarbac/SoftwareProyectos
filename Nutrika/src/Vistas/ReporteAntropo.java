/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author crisa
 */
public class ReporteAntropo {

    public static void main(String[] args) {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Repo_Antropo vista = new Repo_Antropo();
        JFrame frame = new JFrame("Evaluacion Antropometrica");
        frame.setSize(1180, 600);
        frame.setLocation(100, 100);
        frame.add(vista);
        frame.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JFrame;

/**
 *
 * @author crisa
 */
public class ReporteAntropo {
    public static void main(String[] args) {
        Repo_Antropo vista = new Repo_Antropo();
        JFrame frame = new JFrame("Evaluacion Antropometrica");
        frame.setSize(1180, 500);
        frame.setLocation(100, 100);
        frame.add(vista);
        frame.setVisible(true);
    }
}

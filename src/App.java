


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Heredia Chaves 
 */
import javax.swing.JFrame;
import view.viewPanel;

public class App {
    public static void main(String[] args) {
        viewPanel objetoVista = new viewPanel();

        JFrame ventana = new JFrame("Calculadora de IMC");
        ventana.add(objetoVista);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
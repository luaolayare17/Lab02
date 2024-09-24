/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


import ej04.Burbuja;
import ej04.Intersection;
import ej04.Seleccion;
import ej04.merge;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author juand
 */
public class Submenu {
   
    public static JFrame frame;
    public static JButton[] botones;

    public static void main(String[] args) {
      
        String titulo = "Lab02: Metodo de ordenamiento";

       
        String opciones[] = {"Ordenamiento Merge", "Ordenamiento Interseccion","Ordenamiento Seleccion","Ordenamiento Burbuja"};

        final int numop = opciones.length;

        
        frame = new JFrame(titulo);
       
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 50 * numop);
        frame.setLayout(new BorderLayout());

        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(numop, 1)); 

        
        botones = new JButton[numop];

        // Inicializar los botones y añadir ActionListener
        for (int i = 0; i < numop; i++) {
            final int index = i; 
            botones[i] = new JButton(opciones[i]);
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                    switch (index) {
                        case 0:
                            merge.main(new String[]{})
                           ;  break;
                        case 1:
                            Intersection.main(new String[]{})
                            ; break;
                        case 2:
                            Seleccion.main(new String[]{})
                            ;break;
                        case 3: 
                            Burbuja.main(new String[]{});
                        
                    }
                    // *** FINAL AJUSTES ***
                }
            });
            // Añadir el botón al panel
            panelBotones.add(botones[i]);
        }

        // Añadir el panel de botones al marco
        frame.add(panelBotones, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }  

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

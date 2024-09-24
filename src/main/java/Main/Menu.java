package Main;

import ej01.Calculo;
import ej02.Carro;
import ej03.Caracteres;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static JFrame frame;
    public static JButton[] botones;

    public static void main(String[] args) {
      
        String titulo = "Lab02: Algoritmos de ordenamiento";

       
        String opciones[] = {"Programa 1 de calculo", "Programa 2 linea de caracteres","Metodos de ordenamiento","Empresa de carros"};

        final int numop = opciones.length;

        
        frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                            Calculo.main(new String[]{})
                           ;  break;
                        case 1:
                            Caracteres.main(new String[]{})
                            ; break;
                        case 2:
                           Submenu.main(new String[]{});break;
                            
                        case 3: 
                            botones[index].setEnabled(!botones[index].isEnabled());
                            new Carro().setVisible(true); break;
                        
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
}
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){

        JFrame ventana = new JFrame("FORMULARIO REGISTRO");
            ventana.setSize(500, 500);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setear que cuando se cierre la ventana emergente la ejecucion del programa se detenga

            //JPanel panelNorte = new JPanel();
            JPanel panelCentro1 = new JPanel();
            JPanel panelCentro2 = new JPanel();

            panelCentro1.setBackground(Color.yellow);
            panelCentro2.setBackground(Color.black);

            JPanel panelSur = new JPanel();
            JPanel panelLeft = new JPanel();

            panelLeft.setBackground(Color.green);
            JPanel panelRight = new JPanel();
            panelRight.setBackground(Color.green);


            JLabel elemento1 = new JLabel("Ingrese algo: ");
            JTextField input1  = new JTextField();

            panelCentro1.add(elemento1);
            input1.setSize(20,100);
            panelCentro1.add(input1);

            JLabel elemento2 = new JLabel("Ingrese otra cosa:");
            JTextField input2 = new JTextField();

            panelCentro2.add(elemento2);
            input2.setSize(20,100);
            panelCentro2.add(input2);



            JButton boton = new JButton("Haga click");
        panelSur.add(boton);


        /*Mas elementos de swing
        ventana.add(boton2, BorderLayout.CENTER);
        boton.setSize(100,20);
        */
/*
        JLabel etiqueta = new JLabel("La Poli");
        panelNorte.add(etiqueta);

        JLabel texto = new JLabel("Contenido Disponible aqui...");
        panelCentro.add(texto);
*/

        //ventana.add(panelNorte, BorderLayout.NORTH);

        ventana.add(panelCentro1, BorderLayout.NORTH);
        ventana.add(panelCentro2, BorderLayout.CENTER);

        panelCentro1.setLayout(new GridLayout(1,2)); //dividir por segmentos el panel
        panelCentro2.setLayout(new GridLayout(1,3));


        ventana.add(panelSur, BorderLayout.SOUTH);
        ventana.add(panelLeft, BorderLayout.WEST);
        ventana.add(panelRight, BorderLayout.EAST);

        ventana.setVisible(true);
    }
}
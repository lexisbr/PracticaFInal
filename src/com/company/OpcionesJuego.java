package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcionesJuego extends JFrame {
    JFrame opcion = new JFrame("Opciones");

    private JPanel modo;
    private JButton nuevo;
    private JButton cargar;
    public void OpcionesJuego(){
        opcion.setSize(400,150);
        modo = new JPanel();
        nuevo = new JButton("Nueva Partida");
        cargar = new JButton("Cargar Partida");
        nuevo.setAlignmentX(Component.CENTER_ALIGNMENT);
        cargar.setAlignmentX(Component.CENTER_ALIGNMENT);
        TitledBorder borderPanelBotones = new TitledBorder("Seleccione su modo de juego");
        borderPanelBotones.setTitleJustification(TitledBorder.CENTER);
        borderPanelBotones.setTitlePosition(TitledBorder.TOP);
        modo.setBorder(borderPanelBotones);
        modo.setLayout(new BoxLayout(modo, BoxLayout.Y_AXIS));
        modo.add(nuevo);
        modo.add(cargar);
        opcion.add(modo);
        nuevo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SeleccionarModoJuego b = new SeleccionarModoJuego();
                        b.SeleccionarModoJuego();
                        opcion.setVisible(false);
                        opcion.dispose();

                    }
                }
        );
        cargar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    }
                }
        );
        opcion.setVisible(true);

    }
}

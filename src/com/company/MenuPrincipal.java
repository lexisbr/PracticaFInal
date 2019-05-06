package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    JFrame frame = new JFrame("Menu Principal");
    private JLabel titulo;
    private JPanel panelTitulo;
    private JPanel panelBotones;
    private JButton jugar;
    private JButton opciones;
    private JButton reportes;

    public void MenuPrincipal(){
        panelTitulo = new JPanel();
        panelBotones = new JPanel();
        jugar = new JButton("               Jugar                ");
        opciones = new JButton("  Opciones de Usuario   ");
        reportes = new JButton("Estadisticas y Reportes");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Tamaño Ventana
        frame.setSize(400,150);
        //Se muestra la Ventana
        titulo=new JLabel("TANQUES Y AVIONES");
        panelBotones.add(jugar);
        panelBotones.add(opciones);
        panelBotones.add(reportes);

        TitledBorder borderPanelBotones = new TitledBorder("TANQUES Y AVIONES");
        borderPanelBotones.setTitleJustification(TitledBorder.CENTER);
        borderPanelBotones.setTitlePosition(TitledBorder.TOP);
        panelBotones.setBorder(borderPanelBotones);

        jugar.setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones.setAlignmentX(Component.CENTER_ALIGNMENT);
        reportes.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));

        frame.add(panelBotones);

        jugar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       iniciarJuego();
                    }
                }
        );
        opciones.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        iniciarOpciones();
                    }
                }
        );
        reportes.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        iniciarReportes();
                    }
                }
        );


        frame.setVisible(true);
    }
    public void iniciarJuego(){
        OpcionesJuego a = new OpcionesJuego();
        a.OpcionesJuego();
        frame.setVisible(false);
        frame.dispose();
    }
    public void iniciarOpciones(){

    }
    public void iniciarReportes(){

    }
}

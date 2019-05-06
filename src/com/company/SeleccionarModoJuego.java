package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarModoJuego extends JFrame {
    private JPanel modo;
    private JButton jvsjBoton;
    private JButton jvspcBoton;
    private boolean modojuego1 = false;
    Juego a = new Juego();
    JFrame ventanaModo  = new JFrame();
    public void SeleccionarModoJuego(){
        ventanaModo.setSize(400,150);
        ventanaModo.setTitle("Modo de Juego");
        modo = new JPanel();
        jvspcBoton = new JButton("1 Jugador    ");
        jvsjBoton = new JButton("2 Jugadores");
        jvspcBoton.setAlignmentX(Component.CENTER_ALIGNMENT);
        jvsjBoton.setAlignmentX(Component.CENTER_ALIGNMENT);
        TitledBorder borderPanelBotones = new TitledBorder("Seleccione su modo de juego");
        borderPanelBotones.setTitleJustification(TitledBorder.CENTER);
        borderPanelBotones.setTitlePosition(TitledBorder.TOP);
        modo.setBorder(borderPanelBotones);
        modo.setLayout(new BoxLayout(modo, BoxLayout.Y_AXIS));
        modo.add(jvspcBoton);
        modo.add(jvsjBoton);
        ventanaModo.add(modo);
        jvspcBoton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jvspc();
                       a.Juego(modojuego1);
                        ventanaModo.setVisible(false);
                        ventanaModo.dispose();


                    }
                }
        );
        jvsjBoton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jvsj();
                        ventanaModo.setVisible(true);
                        ventanaModo.dispose();
                        a.Juego(modojuego1);
                    }
                }
        );
        ventanaModo.setVisible(true);
    }
    public void jvsj(){
        modojuego1 = false;
    }
    public void jvspc(){
        modojuego1 = true;
    }


    public boolean getModojuego1() {
        return modojuego1;
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class Juego extends JFrame {
    private JPanel inicioJuego;
    private JLabel modojuegoLabel = new JLabel();
    boolean modojuego;
    Espacio terreno;
    JButton[][] tablero;
    JFrame VentanaJuego = new JFrame("Tanques y Aviones");
    public Juego(){
        VentanaJuego.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tablero = new JButton[4][4];
        VentanaJuego.setLayout(new GridLayout(4,4));
        for(int i=0;i < tablero.length;i++){
            for(int j=0; j < tablero.length;j++){

               // tablero[i][j]= terreno.inicializarTanque();
                VentanaJuego.add(tablero[i][j]);
            }
        }

        OpcionesJuego op = new OpcionesJuego();
        op.OpcionesJuego();
        VentanaJuego.setVisible(true);
    }
    public void Juego(boolean modojuego){
        this.setVisible(true);
        this.modojuego=modojuego;
        this.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        if(modojuego) {
            SeleccionarVehiculos1 b = new SeleccionarVehiculos1();
            b.SeleccionarVehiculos1();
            for(int i=0 ; i<3;i++)
           // generarVehiculos(b.getV(i),b.getNv(i));
            this.setVisible(true);

        }else {

        }
    }
    public void generarVehiculos(String v, String nv){
        tablero[0][0] = terreno;
    }



}

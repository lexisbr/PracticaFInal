package com.company;

import javax.swing.*;
import java.awt.*;

public class Juego extends JFrame {
    private JPanel inicioJuego;
    private JLabel modojuegoLabel = new JLabel();
    boolean modojuego;
    Espacio[][] tablero;
    int j=0;
    JFrame VentanaJuego = new JFrame("Tanques y Aviones");
    public Juego(){
        VentanaJuego.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tablero = new Espacio[4][4];
        VentanaJuego.setLayout(new GridLayout(4,4));
        for(int i=0;i < tablero.length;i++){
            for(int j=0; j < tablero.length;j++){

                 tablero[i][j]= new Espacio() {
                     @Override
                     int getTipo() {
                         return 0;
                     }

                     @Override
                     int getTipoV() {
                         return 0;
                     }

                     @Override
                     void setTipo(int tipo) {

                     }

                     @Override
                     String getCuadroColor() {
                         return null;
                     }
                 };
                VentanaJuego.add(tablero[i][j]);
            }
        }

      //  VentanaJuego.setVisible(true);
    }
    public void Juego(boolean modojuego){
        VentanaJuego.setSize(700,700);
        VentanaJuego.setDefaultCloseOperation(EXIT_ON_CLOSE);

        if(modojuego) {
           vehiculos1J();
        }else {

        }
    }
    public void generarVehiculos(String v, String nv){
        System.out.println(j);
        System.out.println("*"+v);
        if(v=="Tanque") {
            System.out.println(v);
            tablero[3][0+j].inicializarTanque(nv);

            j++;
        }
        if(v=="Avion"){
            System.out.println(v);
            tablero[3][0+j].inicializarAvion(nv);

            j++;
        }
        VentanaJuego.setVisible(true);

    }
    public void vehiculos1J(){
        SeleccionarVehiculos1 b = new SeleccionarVehiculos1();
        b.SeleccionarVehiculos1();

    }



}
package com.company;

import javax.swing.*;
import java.awt.*;

public class Espacio extends JButton {//Abstraccion
    int tipoV;
    int hp=5;
    private JButton espacio;
    int ancho = 32;
    int alto = -1;
    protected static final String TanqueSRC  = "out/production/PracticaFInal/com/company/iconos/tanque.png";
    ImageIcon tanque = new ImageIcon(TanqueSRC);

    protected Vehiculo movil;//Polimorfismo
    /**
     * Constructor
     */
    Espacio(){
        JButton espacio = new JButton("kpdo");
        espacio.setText("Hola");
        espacio.setIcon(new ImageIcon(tanque.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
    }

    /**
     * Establece el movil
     * @param movil
     */
    public void setMovil(Vehiculo movil){
        this.movil = movil;

    }
    /**
     * Retorna movil
     * @return
     */
    public Vehiculo getMovil(){
        return movil;
    }
    /**
     * Metodo para inicializar tanque
     *
     */
    public void inicializarTanque(String nombre){
        movil = new Tanque();
        movil.setNickname(nombre);
        tipoV=4;
        movil.getVehiculo();


    }
    public void inicializarTanque(){
        movil = new Tanque();
        movil.getVehiculo();

    }
    /**
     * Metodo para inicializar avion
     *
     */
    public void inicializarAvion(String nombre){
        movil = new Avion();
        movil.setNickname(nombre);
        tipoV=5;
        movil.getVehiculo();
    }
    public void inicializarAvion(){
        movil = new Avion();
        tipoV=5;
        movil.getVehiculo();
    }
    /**
     * Metodo para inicializar Enemigo
     *
     */
    public void inicializarEnemigo(int nivel){
        movil = new Enemigos(nivel);
        movil.getVehiculo();

    }
    /**
     * Retorna hp
     * @return
     */
    public int getHp() {
        return hp;
    }
    /**
     * Establece el hp
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * Metodo para espacio en matriz
     *
     */
    String Escenario1(){
        if (movil!= null)
            return movil.getVehiculo();
        return "";
    }


    /**
     * Retorna tipo
     * @return
     */

    /**
     * Establece el tipo
     * @param tipo
     */

    /**
     * Retorna color y cuadro
     * @return
     */





}

package com.company;

import javax.swing.*;
import java.awt.*;

public abstract class Espacio extends JButton {//Abstraccion
    int tipoV;
    int hp=5;
    private JButton espacio;
    protected Vehiculo movil;//Polimorfismo
    int ancho = 32;
    int alto = -1;
    protected static final String Tierra  = "out/production/PracticaFInal/com/company/iconos/tierra.jpg";



    /**
     * Constructor
     */
    Espacio(){

        movil = null;

       // this.setText("holi");

        //JButton espacio = new JButton("kpdo");
       // espacio.setText("Hola");

    }

    /**
     * Establece el movil
     * @param movil
     */
    public void setMovil(Vehiculo movil){
        this.movil = movil;
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
    }
    public void eraseMovil(){
        this.setIcon(null);

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
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));


    }
    public void inicializarTanque(){
        movil = new Tanque();
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));

    }
    /**
     * Metodo para inicializar avion
     *
     */
    public void inicializarAvion(String nombre){
        movil = new Avion();
        movil.setNickname(nombre);
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
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



    /**
     * Retorna tipo
     * @return
     */
    abstract int getTipo();
    abstract int getTipoV();
    /**
     * Establece el tipo
     * @param tipo
     */
    abstract void setTipo(int tipo);
    /**
     * Retorna color y cuadro
     * @return
     */
    abstract String getCuadroColor();



}

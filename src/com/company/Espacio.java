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
    protected static final Color Tierra  = new Color(182, 77, 31);
    protected static final Color Agua  = new Color(44, 94, 255);
    protected static final Color Montana  = new Color(15, 170, 0);



    /**
     * Constructor
     * Espacio
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

    /**
     * eraseMovil
     * borra el vehiculo
     */
    public void eraseMovil(){
        this.movil=null;
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
     * inicializarTanque
     * Metodo para inicializar tanque
     * @param nombre nickname
     *
     */
    public void inicializarTanque(String nombre){
        movil = new Tanque();
        movil.setNickname(nombre);
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));


    }

    /**
     * inicializarTanque
     */
    public void inicializarTanque(){
        movil = new Tanque();
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));

    }
    /**
     * inicializarAvion
     * Metodo para inicializar avion
     * @param nombre nickname
     *
     */
    public void inicializarAvion(String nombre){
        movil = new Avion();
        movil.setNickname(nombre);
        ImageIcon vehiculo = new ImageIcon(movil.getVehiculo());
        this.setIcon(new ImageIcon(vehiculo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
    }

    /**
     * inicializarAvion
     */
    public void inicializarAvion(){
        movil = new Avion();
        tipoV=5;
        movil.getVehiculo();
    }
    /**
     * inicializarEnemigo
     * Metodo para inicializar Enemigo
     *
     */
    public void inicializarEnemigo(int nivel){
        movil = new Enemigos(nivel);
        movil.getVehiculo();

    }
    /**
     * Retorna hp
     * @return int
     */
    public int getHp() {
        return hp;
    }
    /**
     * Establece el hp
     * @param hp vida
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * Escenario1
     * Metodo para espacio en matriz
     *
     */
    String Escenario1(){
        if (movil!= null)
            return movil.getVehiculo();
        return "";
    }
    public void setColor(){
        this.setBackground(getCuadroColor());
    }
    /**
     * Retorna tipo
     * @return
     */
    abstract int getTipo();

    /**
     * Establece el tipo
     * @param tipo
     */
    abstract void setTipo(int tipo);
    /**
     * Retorna color y cuadro
     * @return
     */
    abstract Color getCuadroColor();



}

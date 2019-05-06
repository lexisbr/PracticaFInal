package com.company;

import javax.swing.*;

abstract public class Vehiculo extends JButton {//Abstraccion
    protected int hp, pp, nivel, xp;
    int ataque, defensa,punteria;
    protected String nickname, arma, tipoarma="Arma Basica";
    protected static final String TanqueSRC  = "src/com/company/iconos/tanque.png";
    protected static final String AvionSRC  = "src/com/company/iconos/avion.png";
    protected static final String EnemigoSRC  = "src/com/company/iconos/enemigo.png";
    protected static final String BootSRC  = "src/com/company/iconos/boot.png";
    /**
     * Constructor
     */
    public Vehiculo(int hp, int pp, int nivel, int xp, String nickname, String arma) {
        this();
        this.nickname = nickname;
        arma = tipoarma;
    }
    public Vehiculo(){
        hp=50;
        pp = 5;
        nivel = 1;
        xp = 0;
    }
    public Vehiculo(String nickname) {
        this();
        this.nickname = nickname;
        arma = tipoarma;
    }
    public Vehiculo(int nivel) {
        this.nivel=nivel;
    }
    /**
     * Retorna Vehiculo
     * @return
     */
    abstract String getVehiculo();
    /**
     * Retorna TipoV
     * @return
     */
    abstract int getTipoV();
    /**
     * Retorna ataque
     * @return
     */
    abstract int getAtaque();
    /**
     * Retorna defensa
     * @return
     */
    abstract int getDefensa();
    /**
     * Retorna punteria
     * @return
     */
    abstract int getPunteria();
    /**
     * Retorna nickname
     * @return
     */
    abstract String getNickname();




    /**
     * Retorna hp
     * @return
     */
    public int getHp() {
        return hp;
    }
    /**
     * Retorna pp
     * @return
     */

    public int getPp() {
        return pp;
    }
    /**
     * Retorna nivel
     * @return
     */
    public int getNivel() {
        return nivel;
    }
    /**
     * Retorna xp
     * @return
     */
    public int getXp() {
        return xp;
    }
    /**
     * Retorna nickname
     * @return
     */
    public String getTipoarma() {
        return tipoarma;
    }

    /**
     * Retorna arma
     * @return
     */
    public String getArma() {
        return arma;
    }
    /**
     * Establece el hp
     * @param hp
     */
    public void setHp(int hp, int nivel) {
        this.hp = hp+((nivel-1)*50);
    }
    public void setHp(int hp) {
        this.hp = hp;
    }


    public void setPp(int pp) {
        this.pp = pp;
    }
    /**
     * Establece el nivel
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    /**
     * Establece el Xp
     * @param xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }
    /**
     * Establece el Nickname
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    /**
     * Establece el arma
     * @param arma
     */
    public void setArma(String arma) {
        this.arma = arma;
    }
    /**
     * Establece el tipo de arma
     * @param tipoarma
     */
    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }
    /**
     * Establece el ataque
     * @param ataque,nivel
     */
    abstract void setAtaque(int ataque, int nivel);
    /**
     * Establece el defensa
     * @param defensa,nivel
     */
    abstract void setDefensa(int defensa, int nivel);
    /**
     * Establece el punteria
     * @param punteria,nivel
     */
    abstract void setPunteria(int punteria,int nivel);

}

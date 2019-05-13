package com.company;

import java.awt.*;

public class EspacioTierra extends Espacio {//Herencia
    int tipo=1;
    int hp=5;

    /**
     * Constructor
     * EspacioTierra
     * @param tipo tipo
     * @param hp vida
     */
    public EspacioTierra(int tipo, int hp) {
        this.tipo = tipo;
        this.hp = hp;
    }
    public EspacioTierra(){
        this.setBackground(new java.awt.Color(204, 109, 49));
    }

    /**
     * Retorna tipo
     * @return
     */
    public int getTipo() {
        return tipo;
    }
    /**
     * Retorna tipoV
     * @return
     */
    public int getTipoV() {
        return tipoV;
    }
    /**
     * Establece el tipo
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    /**
     * Retorna Color+Cuadro
     * @return
     */
    Color getCuadroColor() {
           tipo=1;
        return Tierra;
    }




}

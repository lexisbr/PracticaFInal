package com.company;

import java.awt.*;

public class EspacioAgua extends Espacio {//Herencia
    int tipo = 2;
    int hp = 5;
    /**
     * Constructor
     * EspacioAgua
     * @param tipo tipo
     * @param hp vida
     */
    public EspacioAgua(int tipo, int hp) {
        this.tipo = tipo;
        this.hp = hp;
    }

    public EspacioAgua() {
        this.setBackground(new java.awt.Color(44, 105, 238));
    }

    /**
     * Retorna tipo
     *
     * @return
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Retorna tipoV
     *
     * @return
     */
    public int getTipoV() {
        return tipoV;
    }

    /**
     * Establece el tipo
     *
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
        return Agua;
    }
}
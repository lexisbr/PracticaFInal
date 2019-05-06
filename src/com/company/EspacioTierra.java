package com.company;

import javax.swing.*;
import java.awt.*;

public class EspacioTierra extends Espacio {//Herencia
    int tipo=1;
    int hp=5;
    ImageIcon tierra = new ImageIcon(Tierra);

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
    String getCuadroColor() {
        //    tipo=1;
        return Tierra;
    }




}

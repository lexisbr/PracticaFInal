package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Estadistica {
    private JTable table1;
    private JPanel panel1;
    private DefaultTableModel modelo;
    int cont = 0;
    public Estadistica(){

    }
    public void CargarRegistrar(){
        String datos [][]= {};
        String columna[]= {"Nombre", "Nombre Vehículo1", "Tipo", "Nombre Vehículo2","Tipo","Nombre Vehículo3", "Tipo"};
        String columna1[] = { "V1" };
        modelo= new DefaultTableModel(datos, columna);
        table1.setModel(modelo);
    }
    public void Cargardatos(){
        Vehiculo a;
        for (int i = 0; i < 3; i++) {
            /*a= (Vehiculo) Registrar.contenedor.get(i);
            //  b= (Registrar) Registrar.contenedor.get(i);
            modelo.insertRow(cont, new Object []{ });
            modelo.setValueAt(a.getNombre(), cont, 0);
            modelo.setValueAt(a.getV1(), cont, 1);
            modelo.setValueAt(a.getV2(), cont, 3);
            modelo.setValueAt(a.getV3(), cont, 5);
            modelo.setValueAt(a.getTipo1(), cont, 2);
            modelo.setValueAt(a.getTipo2(), cont, 4);
            modelo.setValueAt(a.getTipo3(), cont, 6);*/

        }



    }
}

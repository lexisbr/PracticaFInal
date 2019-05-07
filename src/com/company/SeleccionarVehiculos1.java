package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarVehiculos1 extends JFrame {
    private JTextField textField1;
    private JRadioButton tanque1;
    private JRadioButton avion1;
    private JTextField nombre1;
    private JRadioButton tanque2;
    private JPanel panel1;
    private JPanel panel2;
    private JRadioButton tanque3;
    private JRadioButton avion3;
    private JRadioButton avion2;
    private JTextField nombre2;
    private JTextField nombre3;
    private JButton continuarButton;
    private  String[] v= new String[3];
    private  String[] nv= new String[3];
    Juego a=new Juego();
    JFrame selec = new JFrame("Seleccione sus vehiculos");

    public void SeleccionarVehiculos1() {
        selec.setSize(600,250);
        selec.add(panel1);
        selec.add(panel2);
        selec.getContentPane().add(BorderLayout.NORTH,panel1);

        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tanque1.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 1: Tanque Nombre: "+nombre1.getText());
                    v[0]="Tanque";
                    nv[0]=nombre1.getText();

                }else if(avion1.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 1: Avion Nombre: "+nombre1.getText());
                    v[0]="Avion";
                    nv[0]=nombre1.getText();
                }
                if(tanque2.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 2: Tanque Nombre: "+nombre2.getText());
                    v[1]="Tanque";
                    nv[1]=nombre2.getText();
                }else if(avion2.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 2: Avion Nombre: "+nombre2.getText());
                    v[1]="Avion";
                    nv[1]=nombre2.getText();
                }
                if(tanque3.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 3: Tanque Nombre: "+nombre3.getText());
                    v[2]="Tanque";
                    nv[2]=nombre3.getText();
                }else if(avion3.isSelected()){
                    JOptionPane.showMessageDialog(null,"Vehiculo 3: Avion Nombre: "+nombre3.getText());
                    v[2]="Avion";
                    nv[2]=nombre3.getText();
                }
                for(int i = 0; i<3;i++) {
                    System.out.println(v[i]+" - "+ nv[i]);
                    a.generarVehiculos(v[i], nv[i]);
                    selec.setVisible(false);
                    selec.dispose();
                }
            }
        });
        selec.setVisible(true);

    }

    public String getV(int i) {
        return v[i];
    }
    public String getNv(int i){
        return nv[i];
    }
    public void returnVehiculo(){
        for(int i=0 ; i<3;i++) {
            System.out.println(getV(i) + " " + getNv(i));
        }
    }


}

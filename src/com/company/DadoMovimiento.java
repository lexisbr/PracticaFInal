package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DadoMovimiento extends JFrame{
    private JButton dado;
    private JLabel valordado;
    private JPanel panel1;
    private JButton continuarButton;
    int ancho = 32;
    int alto = -1;
    protected static final String DADO  = "src/com/company/iconos/dado.png";
    ImageIcon dado1 = new ImageIcon(DADO);
    JFrame frame5 = new JFrame();
    Random rgen = new Random();
    int valor;
    boolean yap = false;
    DadoMovimiento(JFrame a){

        frame5.setSize(400,400);
        frame5.add(panel1);
        dado.setIcon(new ImageIcon(dado1.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
        frame5.setVisible(true);
        dado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorDado();
                String valor1 = String.valueOf(getDado());
                    valordado.setText(valor1);

            }
        });
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yap=true;
                frame5.setVisible(false);
                frame5.dispose();
            }
        });
    }
    public void valorDado(){
        valor = rgen.nextInt(6);
        valor++;
    }
    public int getDado(){
        return valor;
    }

}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego extends JFrame {
    int ancho = 32;
    int alto = -1;
    private JPanel inicioJuego;
    private JLabel modojuegoLabel = new JLabel();
    boolean modojuego;
    private JButton botones1 ;
    private JButton botones2 ;
    private JButton arribaB ;
    private JButton abajoB ;
    private JButton izquierdaB ;
    private JButton derechaB ;
    protected static final String TanqueSRC  = "src/com/company/iconos/tanque.png";
    protected static final String AvionSRC  = "src/com/company/iconos/avion.png";
    protected static final String EnemigoSRC  = "src/com/company/iconos/enemigo.png";
    protected static final String BootSRC  = "src/com/company/iconos/boot.png";
    protected static final String AtaqueSRC  = "src/com/company/iconos/atacar.png";
    protected static final String MoverSRC  = "src/com/company/iconos/mover.jpg";
    protected static final String ARRIBA  = "src/com/company/iconos/arriba.png";
    protected static final String ABAJO  = "src/com/company/iconos/abajo.png";
    protected static final String IZQUIERDA  = "src/com/company/iconos/izquierda.png";
    protected static final String DERECHA  = "src/com/company/iconos/derecha.png";
    ImageIcon tanque = new ImageIcon(TanqueSRC);
    ImageIcon avion = new ImageIcon(AvionSRC);
    ImageIcon atacar = new ImageIcon(AtaqueSRC);
    ImageIcon mover = new ImageIcon(MoverSRC);
    ImageIcon arriba = new ImageIcon(ARRIBA);
    ImageIcon abajo = new ImageIcon(ABAJO);
    ImageIcon izquierda = new ImageIcon(IZQUIERDA);
    ImageIcon derecha = new ImageIcon(DERECHA);
    Espacio[][] tablero;
    int j=0;
    String selec="";
    JFrame VentanaJuego = new JFrame("Tanques y Aviones");
      Juego(){
        VentanaJuego.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tablero = new Espacio[6][6];
        VentanaJuego.setLayout(new GridLayout(tablero.length,tablero.length));
        for(int i=0;i < tablero.length;i++){
            for(int j=0; j < tablero.length;j++){
                System.out.println(" "+i+" "+j);
                 tablero[i][j]= new Espacio() {
                     @Override
                     int getTipo() {
                         return 0;
                     }

                     @Override
                     int getTipoV() {
                         return 0;
                     }

                     @Override
                     void setTipo(int tipo) {

                     }

                     @Override
                     String getCuadroColor() {
                         return null;
                     }
                 };
                 tablero[i][j].setText(""+i+""+j);
                VentanaJuego.add(tablero[i][j]);
            }
        }
        accionesVehiculo();

      //  VentanaJuego.setVisible(true);
    }
    public void Juego(boolean modojuego){
        VentanaJuego.setSize(700,700);
        VentanaJuego.setDefaultCloseOperation(EXIT_ON_CLOSE);

        if(modojuego) {
           vehiculos1J();
        }else {

        }
    }
    public void generarVehiculos(String v, String nv){
        System.out.println(j);
        System.out.println("*"+v);
        if(v=="Tanque") {
            System.out.println(v);
            tablero[5][0+j].inicializarTanque(nv);

            j++;
        }
        if(v=="Avion"){
            System.out.println(v);
            tablero[5][0+j].inicializarAvion(nv);

            j++;
        }
        VentanaJuego.setVisible(true);

    }
    public void vehiculos1J(){
        SeleccionarVehiculos1 b = new SeleccionarVehiculos1();
        b.SeleccionarVehiculos1();

    }
    public void accionesVehiculo(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++){

                tablero[i][j].addActionListener(

                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                             {
                                if (tablero != null) {
                                    //Guarda la posicion del boton presionado
                                    JButton botonEvento = (JButton) e.getSource();
                                    System.out.println("apretado el boton " + botonEvento.getActionCommand());
                                    selec = botonEvento.getActionCommand();
                                    //Metodo para seleccionar Torre o Alfil
                                    seleccionAccion();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No valido");
                                }
                            }
                        }
                    }
                    );
              }


        }
    }
    public void moverVehiculo(int mov,boolean yap){
          if(yap) {
              //Crea nueva ventana
              JFrame frame2 = new JFrame("Mover Vehiculo");
              //Tamaño
              frame2.setSize(400, 200);
              //Cuadricula de 1*1
              frame2.setLayout(new GridLayout(4, 4));
              //Botones para Alfil y Torre
              arribaB = new JButton();
              abajoB = new JButton();
              derechaB = new JButton();
              izquierdaB = new JButton();
              //Set Icono
              arribaB.setIcon(new ImageIcon(arriba.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
              abajoB.setIcon(new ImageIcon(abajo.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
              derechaB.setIcon(new ImageIcon(derecha.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
              izquierdaB.setIcon(new ImageIcon(izquierda.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
              //Agregar a ventana
              frame2.add(arribaB);
              frame2.add(abajoB);
              frame2.add(derechaB);
              frame2.add(izquierdaB);


              //Presionar boton 1

              arribaB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              for (int i = 0; i < tablero.length; i++) {
                                  for (int j = 0; j < tablero.length; j++) {
                                      if (tablero[i][j].getText() == selec && tablero[i][j].getText() != " ") {
                                          // tablero[i][j].setText("");
                                          System.out.println(i + " " + j);
                                          tablero[i - mov][j].setMovil(tablero[i][j].getMovil());
                                          tablero[i][j].eraseMovil();

                                      }
                                  }
                              }
                              frame2.setVisible(false);
                              frame2.dispose();
                          }
                      }
              );
              //Presionar boton 2
              abajoB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              izquierdaB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              derechaB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              //Visible
              frame2.setVisible(true);
          }

    }
    public void seleccionAccion(){
        //Crea nueva ventana
        JFrame frame3 = new JFrame("Seleccionar Accion");

        //Tamaño
        frame3.setSize(400,200);
        //Cuadricula de 1*1
        frame3.setLayout(new GridLayout(1,1));
        //Botones para Alfil y Torre
        botones1 = new JButton();
        botones2 = new JButton();
        //Set Icono
        botones1.setIcon(new ImageIcon(atacar.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
        botones2.setIcon(new ImageIcon(mover.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
        //Agregar a ventana
        frame3.add(botones1);
        frame3.add(botones2);
        //Presionar boton 1
        botones1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        frame3.setVisible(false);
                        frame3.dispose();
                    }
                }
        );
        //Presionar boton 2
        botones2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        dadoMovimiento();

                        frame3.setVisible(false);
                        frame3.dispose();

                    }
                }
        );
        //Visible
        frame3.setVisible(true);
    }
    public void dadoMovimiento(){
          DadoMovimiento c = new DadoMovimiento();
          int valor = c.valorDado();

          moverVehiculo(valor,c.yap);
    }



}
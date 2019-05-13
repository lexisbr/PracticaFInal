package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Juego extends JFrame {
    int ancho = 32;
    int alto = -1;
    int valor = 0;
    int nuevos=0;
    private JPanel inicioJuego;
    private JLabel modojuegoLabel = new JLabel();
    private JLabel nombreVehiculo;
    private JLabel tipoVehiculo;
    private JLabel vidaVehiculo;
    private JLabel poderVehiculo;
    private JLabel armaVehiculo;
    private JLabel ataqueVehiculo;
    private JLabel punteriaVehiculo;
    private JLabel nivelVehiculo;
    private JLabel xpVehiculo;
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
    int e=0;
    String selec="";
    JFrame VentanaJuego = new JFrame("Tanques y Aviones");
    JPanel ventana = new JPanel();
    JPanel ventana1 = new JPanel();
    JButton fin = new JButton("Fin");
      Juego(){
        VentanaJuego.setSize(700,700);
        VentanaJuego.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tablero = new Espacio[6][6];
        ventana.setLayout(new GridLayout(tablero.length,tablero.length));
        ventana1.add(fin);

        for(int i=0;i < tablero.length;i++){
            for(int j=0; j < tablero.length;j++){
                System.out.println(" "+i+" "+j);
                Escenario1(i,j);
                tablero[i][j].setText(""+i+""+j);
                ventana.add(tablero[i][j]);
            }

        }

        VentanaJuego.getContentPane().add(ventana1, BorderLayout.SOUTH);
        VentanaJuego.add(ventana);

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
        System.out.println(e);
        System.out.println("*"+v);
        if(v=="Tanque") {
            System.out.println(v);
            tablero[5][0+e].inicializarTanque(nv);

            e++;
        }
        if(v=="Avion"){
            System.out.println(v);
            tablero[5][0+e].inicializarAvion(nv);

            e++;
        }

        VentanaJuego.setVisible(true);

    }
    public void vehiculos1J(){
        SeleccionarVehiculos1 b = new SeleccionarVehiculos1();
        b.SeleccionarVehiculos1();

    }
    public void Escenario1(int i, int j){

                if(i<3&&j<4)
                    tablero[i][j]= new EspacioAgua();
                else
                    tablero[i][j]= new EspacioTierra();
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
                                    for (int o = 0; o < tablero.length; o++) {
                                        for (int u = 0; u < tablero.length; u++) {
                                            if (tablero[o][u].getText() == selec && tablero[o][u].getText() != " ") {
                                                // tablero[i][j].setText("");
                                                seleccionAccion(o,u);
                                            }
                                        }
                                    }


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
    public void moverVehiculo(int mov){

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
                                          if(movimientoValido(i,j,8,mov)) {
                                              moverMovil(tablero[i][j], tablero[i - (mov)][j]);
                                              System.out.println(i + " " + j);
                                              System.out.println("*" + mov);
                                          }else{
                                              if (nuevos != 0) {
                                                  moverMovil(tablero[i][j], tablero[i - (nuevos)][j]);
                                                  System.out.println(i + " " + j);
                                                  System.out.println("*" + nuevos);
                                              }
                                          }


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
                              for (int i = 0; i < tablero.length; i++) {
                                  for (int j = 0; j < tablero.length; j++) {
                                      if (tablero[i][j].getText() == selec && tablero[i][j].getText() != " ") {
                                          // tablero[i][j].setText("");
                                          if(movimientoValido(i,j,2,mov)) {
                                              moverMovil(tablero[i][j], tablero[i + (mov)][j]);
                                              System.out.println(i + " " + j);
                                              System.out.println("*" + mov);
                                          }else{
                                              if (nuevos != 0) {
                                                  moverMovil(tablero[i][j], tablero[i + (nuevos)][j]);
                                                  System.out.println(i + " " + j);
                                                  System.out.println("*" + mov);
                                              }
                                          }

                                      }
                                  }
                              }
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              izquierdaB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              for (int i = 0; i < tablero.length; i++) {
                                  for (int j = 0; j < tablero.length; j++) {
                                      if (tablero[i][j].getText() == selec && tablero[i][j].getText() != " ") {
                                          // tablero[i][j].setText("");
                                          if(movimientoValido(i,j,4,mov)) {
                                              moverMovil(tablero[i][j], tablero[i][j - (mov)]);
                                              System.out.println(i + " " + j);
                                              System.out.println("*" + mov);
                                          }else{
                                              if (nuevos != 0) {
                                                  moverMovil(tablero[i][j], tablero[i][j - (nuevos)]);
                                                  System.out.println(i + " " + j);
                                                  System.out.println("*" + nuevos);
                                              }
                                          }

                                      }
                                  }
                              }
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              derechaB.addActionListener(
                      new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              for (int i = 0; i < tablero.length; i++) {
                                  for (int j = 0; j < tablero.length; j++) {
                                      if (tablero[i][j].getText() == selec && tablero[i][j].getText() != " ") {
                                          // tablero[i][j].setText("");
                                          if(movimientoValido(i,j,6,mov)) {
                                              moverMovil(tablero[i][j], tablero[i][j + (mov)]);
                                              System.out.println(i + " " + j);
                                              System.out.println("*" + mov);
                                          }else{
                                              if (nuevos != 0) {
                                                  moverMovil(tablero[i][j], tablero[i][j + (nuevos)]);
                                                  System.out.println(i + " " + j);
                                                  System.out.println("*" + nuevos);
                                              }else{
                                                  System.out.println("okas");
                                              }
                                          }

                                      }
                                  }
                              }
                              frame2.setVisible(false);
                              frame2.dispose();

                          }
                      }
              );
              //Visible
              frame2.setVisible(true);
          }


    public void seleccionAccion(int x, int y){
        //Crea nueva ventana
        JFrame frame3 = new JFrame("Seleccionar Accion");
        //Tamaño
        JPanel botonesPanel = new JPanel();
        JPanel atributosPanel = new JPanel();
        frame3.setSize(400,230);
        //Cuadricula de 1*1
        nombreVehiculo = new JLabel("Nombre: "+tablero[x][y].movil.getNickname());
        tipoVehiculo = new JLabel("Tipo: "+searchTipoVehiculo(x,y));
        vidaVehiculo = new JLabel("Vida: " + tablero[x][y].movil.getHp());
        poderVehiculo= new JLabel("Poder: " + tablero[x][y].movil.getPp());
        armaVehiculo= new JLabel("Arma: " + tablero[x][y].movil.getArma());
        ataqueVehiculo= new JLabel("Ataque: " + tablero[x][y].movil.getAtaque());
        punteriaVehiculo = new JLabel("Punteria: " + tablero[x][y].movil.getPunteria());
        nivelVehiculo= new JLabel("Nivel: " + tablero[x][y].movil.getNivel());
        xpVehiculo= new JLabel("Experiencia: " + tablero[x][y].movil.getXp());

        botonesPanel.setLayout(new GridLayout(1,1));
        atributosPanel.setLayout(new BoxLayout(atributosPanel,BoxLayout.Y_AXIS));
        //Botones para Alfil y Torre

        atributosPanel.add(nombreVehiculo);
        atributosPanel.add(tipoVehiculo);
        atributosPanel.add(vidaVehiculo);
        atributosPanel.add(poderVehiculo);
        atributosPanel.add(armaVehiculo);
        atributosPanel.add(ataqueVehiculo);
        atributosPanel.add(punteriaVehiculo);
        atributosPanel.add(nivelVehiculo);
        atributosPanel.add(xpVehiculo);
        botones1 = new JButton();
        botones2 = new JButton();
        //Set Icono
        botones1.setIcon(new ImageIcon(atacar.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
        botones2.setIcon(new ImageIcon(mover.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
        //Agregar a ventana

        botonesPanel.add(botones1);
        botonesPanel.add(botones2);

      // frame3.add(atributosPanel);
       // frame3.add(botonesPanel);

        frame3.getContentPane().add(BorderLayout.NORTH,atributosPanel);
        frame3.getContentPane().add(BorderLayout.SOUTH,botonesPanel);
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
        /*  DadoMovimiento c = new DadoMovimiento(VentanaJuego);
          moverVehiculo(c.getDado());*/
         JButton dado = new JButton();
         JLabel valordado = new JLabel("Tira el dado!");
         JPanel panel1 =new JPanel();
         JButton continuarButton =  new JButton("Continuar");
        int ancho = 32;
        int alto = -1;
        String DADO  = "src/com/company/iconos/dado.png";
        ImageIcon dado1 = new ImageIcon(DADO);
        JFrame frame5 = new JFrame();
        Random rgen = new Random();

        valor = rgen.nextInt(6);
        valor++;
        panel1.add(dado);
        panel1.add(valordado);
        panel1.add(continuarButton);



            frame5.setSize(400,100);
            frame5.add(panel1);
            dado.setIcon(new ImageIcon(dado1.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT)));
            frame5.setVisible(true);
            dado.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String valor1 = String.valueOf(valor);
                    valordado.setText(valor1);



                }
            });
            continuarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    moverVehiculo(valor);
                    frame5.setVisible(false);
                    frame5.dispose();
                }
            });
        }
    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
    public boolean movimientoValido(int x, int y, int d,int u){
        //Para saber que su movimiento es dentro del rango
        int contespacios=0;
        //Arriba
        if(d==8){
            for(int i=(x-1);i>=0;i--){
                contespacios++;
            }
            if(u<=contespacios){
                return true;
            }else {

                nuevos=contespacios;
                return false;
            }
        }
        //Abajo
        if(d==2){
            for(int i=(x+1);i<tablero.length;i++){
                contespacios++;
            }
            if(u<=contespacios){
                return true;
            }else {
                System.out.println("ilegal broer "+contespacios);
                nuevos=contespacios;
                return false;
            }
        }
        //Izquierda
        if(d==4){
            for(int i=(y-1);i>=0;i--){
                contespacios++;
            }
            if(u<=contespacios){
                return true;
            }else {
                System.out.println("ilegal broer "+contespacios);
                nuevos=contespacios;
                return false;
            }
        }
        //Derecha
        if(d==6){
            for(int i=(y+1);i<tablero.length;i++){
                contespacios++;
            }
            if(u<=contespacios){
                return true;
            }else {
                System.out.println("ilegal broer "+contespacios);
                nuevos=contespacios;
                return false;
            }
        }

        return false;
    }
    //Movimiento
    public void moverMovil(Espacio viejo, Espacio nuevo){
        //Set vehiculo en posicion nueva
        nuevo.setMovil(viejo.getMovil());
        //Borra posicion anterior
        viejo.eraseMovil();
    }
    public String searchTipoVehiculo(int i , int j){
          if(tablero[i][j].movil instanceof Tanque){
              return "Tanque";
          }else if( tablero[i][j].movil instanceof Avion){
              return "Avion";
          }
          return "";
    }



}
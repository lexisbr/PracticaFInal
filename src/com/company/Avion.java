package com.company;

public class Avion extends Vehiculo{//Herencia
    int ataque=7, defensa=3, punteria=70;
    int tipoV=5;
    String tipoarma="Arma Basica Avion";
    /**
     * Constructor
     */
    public Avion(){
        hp=50+((nivel-1)*50);
        pp = 5;
        nivel = 1;
        xp = 0;
        ataque=7+((nivel-1)*2);
        defensa=3+((nivel-1)*1);
        punteria=70+((nivel-1)*(1));
        tipoV=5;
        arma=tipoarma;
    }
    public Avion(int hp, int pp, int nivel, int xp, String nickname, String arma){
        super(hp,pp,nivel,xp,nickname,arma);
        ataque=7;
        defensa=3;
        punteria=70;
    }
    public Avion(String nickname){
        super(nickname);
        hp=50;
        pp = 5;
        nivel = 1;
        xp = 0;
        ataque=7;
        defensa=3;
        punteria=70;
        tipoV=5;
    }
    /**
     * Retorna TipoV
     * @return
     */
    public int getTipoV() {
        return tipoV;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    /**
     * Retorna Vehiculo
     * @return
     */
    String getVehiculo() {
        return AvionSRC;
    }

    @Override
    /**
     * Retorna ataque
     * @return
     */
    public int getAtaque() {
        return ataque;
    }

    @Override
    /**
     * Retorna defensa
     * @return
     */
    public int getDefensa() {
        return defensa;
    }

    @Override
    /**
     * Retorna punteria
     * @return
     */
    public int getPunteria() {
        return punteria;
    }
    /**
     * Retorna nickname
     * @return
     */
    public String getNickname(){
        return nickname;
    }

    public String getTipoarma() {
        return tipoarma;
    }
    /**
     * Establece el ataque
     * @param ataque,nivel
     */    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque+((nivel-1)*2);
    }
    /**
     * Establece el defensa
     * @param defensa,nivel
     */    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa+((nivel-1)*1);
    }
    /**
     * Establece el punteria
     * @param punteria,nivel
     */    public void setPunteria(int punteria, int nivel) {
        this.punteria = punteria+((nivel-1)*(1));
    }


}

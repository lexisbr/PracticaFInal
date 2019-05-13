package com.company;

public class Tanque extends Vehiculo{//Herencia
    int ataque=10, defensa=6, punteria=60;
    int tipoV=4;
    String tipoarma="Arma Basica Tanque";
    /**
     * Constructor
     * Tanque
     */
    public Tanque()
    {
        hp=50+((nivel-1)*50);
        pp = 5;
        xp = 0;
        ataque=10+((nivel-1)*2);
        defensa=6+((nivel-1)*1);
        punteria=60+((nivel-1)*(5/10));
        tipoV=4;
        arma=tipoarma;
    }

    /**
     * Tanque
     * @param hp
     * @param pp
     * @param nivel
     * @param xp
     * @param nickname
     * @param arma
     */
    public Tanque(int hp, int pp, int nivel, int xp, String nickname, String arma){
        //super(hp,pp,nivel,xp,nickname,arma);
        super(nickname);
        ataque=10;
        defensa=6;
        punteria=60;
    }
    public Tanque(String nickname){
        super(nickname);
        hp=50;
        pp = 5;
        nivel = 1;
        xp = 0;
        ataque=10;
        defensa=6;
        tipoV=4;
    }


    /**
     * Retorna defensa
     * @return
     */
    public int getDefensa() {
        return defensa;
    }
    /**
     * Retorna punteria
     * @return
     */
    public int getPunteria() {
        return punteria;
    }
    /**
     * Retorna ataque
     * @return
     */
    public int getAtaque(){
        return ataque;
    }
    /**
     * Establece el ataque
     * @param ataque,nivel
     */
    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque+((nivel-1)*2);
    }
    /**
     * Establece el defensa
     * @param defensa,nivel
     */
    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa+((nivel-1)*1);
    }
    /**
     * Establece el punteria
     * @param punteria,nivel
     */
    public void setPunteria(int punteria, int nivel) {
        this.punteria = punteria+((nivel-1)*(1));
    }

    public void setTipoV(int tipoV) {
        this.tipoV = tipoV;
    }
    /**
     * Retorna nickname
     * @return
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Override
    /**
     * Retorna Vehiculo
     * @return
     */
    String getVehiculo() {
        return TanqueSRC;
    }
    /**
     * Retorna TipoV
     * @return
     */
    public int getTipoV() {
        return tipoV;
    }
    public String getNickname(){
        return nickname;
    }
    public String getTipoarma() {
        return tipoarma;
    }
}

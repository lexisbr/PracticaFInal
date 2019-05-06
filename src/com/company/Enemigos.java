package com.company;

public class Enemigos extends Vehiculo{
    protected int hp=40+(nivel*5),punteria=50+(nivel*5),ataque=8+(nivel*2), defensa=2+(nivel*2);
    int tipoV=6;
    /**
     * Constructor
     *
     */
    public Enemigos(int nivel) {
        super(nivel);
        this.hp=hp;

    }

    @Override
    /**
     * Establece el hp
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * Establece el punteria
     * @param punteria
     */
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
    /**
     * Establece el ataque
     * @param ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    /**
     * Establece el defensa
     * @param defensa
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    /**
     * Retorna vehiculo
     * @return
     */
    String getVehiculo() {
        return EnemigoSRC;
    }
    /**
     * Retorna tipo
     * @return
     */
    int getTipoV() {
        return tipoV;
    }
    /**
     * Retorna Ataque
     * @return
     */
    int getAtaque(){
        return ataque;
    }
    /**
     * Retorna defensa
     * @return
     */
    int getDefensa(){
        return defensa;
    }
    /**
     * Retorna hp
     * @return
     */
    public int getHp() {
        return hp;
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
    /**
     * Establece el ataque
     * @param ataque
     */
    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque+((nivel-1)*5);
    }
    /**
     * Establece el defensa
     * @param defensa
     */
    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa+((nivel-1)*5);
    }
    /**
     * Establece el punteria
     * @param punteria
     */
    public void setPunteria(int punteria, int nivel) {
        this.punteria = punteria+((nivel-1)*(5));
    }
}

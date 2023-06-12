package model;

public class BolsilloVO {
    private int recargar;
    private int dinero;
    private int retiro;

    public BolsilloVO (){

    }

    public BolsilloVO(int recargar, int dinero, int retiro) {
        this.recargar = recargar;
        this.dinero = dinero;
        this.retiro = retiro;
    }

    public int getRecargar() {
        return recargar;
    }

    public void setRecargar(int recargar) {
        this.recargar = recargar;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    
}
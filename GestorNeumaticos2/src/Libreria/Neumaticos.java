package Libreria;

public abstract class Neumaticos {
    private String IdNeumatico;
    private int posicionNeumatico;
    private float presionActual;
    private float presionRecomendada;
    private float presionMaxima;
    private float nivelDesgaste;
    private int estadoRueda;

    public Neumaticos(){
        IdNeumatico="";
        posicionNeumatico=0;
        presionActual=0;
        presionRecomendada=0;
        presionMaxima=0;
        nivelDesgaste=0;
        estadoRueda=0;
    }

    public Neumaticos(String IdNeumatico, int posicionNeumatico, float presionActual, float presionRecomendada, float presionMaxima, float nivelDesgaste, int estadoRueda) {
        this.IdNeumatico = IdNeumatico;
        this.posicionNeumatico = posicionNeumatico;
        this.presionActual = presionActual;
        this.presionRecomendada = presionRecomendada;
        this.presionMaxima = presionMaxima;
        this.nivelDesgaste = nivelDesgaste;
        this.estadoRueda = estadoRueda;
    }

    public String getIdNeumatico() {
        return IdNeumatico;
    }

    public void setIdNeumatico(String IdNeumatico) {
        this.IdNeumatico = IdNeumatico;
    }

    public int getPosicionNeumatico() {
        return posicionNeumatico;
    }

    public void setPosicionNeumatico(int posicionNeumatico) {
        this.posicionNeumatico = posicionNeumatico;
    }

    public float getPresionActual() {
        return presionActual;
    }

    public void setPresionActual(float presionActual) {
        this.presionActual = presionActual;
    }

    public float getPresionRecomendada() {
        return presionRecomendada;
    }

    public void setPresionRecomendada(float presionRecomendada) {
        this.presionRecomendada = presionRecomendada;
    }

    public float getPresionMaxima() {
        return presionMaxima;
    }

    public void setPresionMaxima(float presionMaxima) {
        this.presionMaxima = presionMaxima;
    }

    public float getNivelDesgaste() {
        return nivelDesgaste;
    }

    public void setNivelDesgaste(float nivelDesgaste) {
        this.nivelDesgaste = nivelDesgaste;
    }

    public int getEstadoRueda() {
        return estadoRueda;
    }

    public void setEstadoRueda(int estadoRueda) {
        this.estadoRueda = estadoRueda;
    }
    
    abstract int getpresionActual();
    abstract int setpresionActual();
    abstract int getposicionRueda();
    abstract boolean estaDesgastado();
    abstract boolean necesitaAire();
    abstract boolean necesitaCambio();    
    abstract int setEstadoRueda();
    abstract int getEstadoRuedaN();


}

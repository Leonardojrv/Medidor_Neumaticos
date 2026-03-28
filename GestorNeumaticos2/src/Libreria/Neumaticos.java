package Libreria;

public class Neumaticos{
    private String IdNeumatico;
    private PosicionRueda posicion;
    private float presionActual;
    private float presionRecomendada;
    private float presionMaxima;
    private EstadoRueda estadoRueda;

    public Neumaticos(){
        IdNeumatico="";
        posicion=posicion;
        presionActual=0;
        presionRecomendada=0;
        presionMaxima=0;
        estadoRueda=estadoRueda;
    }

    public Neumaticos(String id, PosicionRueda pos, float pActual, float pRecomen) {
        this.IdNeumatico = id;
        this.posicion = pos;
        this.presionActual = pActual;
        this.presionRecomendada = pRecomen;
    }

    public String getIdNeumatico() {
        return IdNeumatico;
    }

    public void setIdNeumatico(String IdNeumatico) {
        this.IdNeumatico = IdNeumatico;
    }

    public PosicionRueda getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionRueda posicion) {
        this.posicion = posicion;
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

    public EstadoRueda getEstadoRueda() {
        return estadoRueda;
    }

    public void setEstadoRueda(EstadoRueda estadoRueda) {
        this.estadoRueda = estadoRueda;
    }
    
    
    

    @Override
    public String toString() {
        return "Posición: " + posicion + " | Presión: " + presionActual + " PSI";
    }

}
package Libreria;

public abstract class SensorPresion{
    private String IdSensor;
    
    public SensorPresion(){
        IdSensor="";
    }

    public SensorPresion(String IdSensor) {
        this.IdSensor = IdSensor;
    }

    public String getIdSensor() {
        return IdSensor;
    }

    public void setIdSensor(String IdSensor) {
        this.IdSensor = IdSensor;
    }
    
    public float medirPresion(Neumaticos n) {
        return n.getPresionActual();
    }    
    
    public EstadoRueda detectarEstado(Neumaticos n) {
        if (n.getPresionActual() <= 0) 
            return EstadoRueda.vacia;
        
        if (n.getPresionActual() <= 29)
            return EstadoRueda.baja_presion;
        
        if (n.getPresionActual()>= 45)
            return EstadoRueda.sobre_inflada;
        
        return EstadoRueda.presion_optima;
        
        
        
    }

}

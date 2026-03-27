package Libreria;

public abstract class SensorPresion extends Neumaticos {
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
    
    abstract float medirPresion();
    abstract float detectarEstadoPresion();
    
    
}

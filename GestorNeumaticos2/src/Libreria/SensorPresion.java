package Libreria;

public class SensorPresion implements ISensor{
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
    
    @Override
    public double medirPresion(Neumaticos neumatico) {
        return neumatico.getPresionActual();
    }  
    
    @Override
    public boolean esLecturaValida() {
        return true; // Por ahora digamos que siempre es válida
    }
    
    // 4. Método obligatorio por la Interfaz
    @Override
    public void calibrar() {
        System.out.println("Sensor " + IdSensor + " calibrado correctamente.");
    }
    
    public EstadoRueda detectarEstadoPresion(Neumaticos n) {
        if (n.getPresionActual() <= 0) 
            return EstadoRueda.vacia;
        
        if (n.getPresionActual() <= 29)
            return EstadoRueda.baja_presion;
        
        if (n.getPresionActual()>= 45)
            return EstadoRueda.sobre_inflada;
        
        return EstadoRueda.presion_optima;
      
    }
    
    

}


package Libreria;

public class Compresor {
    private String idCompresor;
    private double potenciaPSIPorSegundo;

    public String inflar(Neumaticos neumatico, ISensor sensor) {
        EstadoRueda estado = sensor.detectarEstadoPresion(neumatico);
        
        if (estado == EstadoRueda.baja_presion || estado == EstadoRueda.vacia) {
            neumatico.setPresionActual(32);
            neumatico.setEstadoRueda(EstadoRueda.presion_optima);
            return "Neumatico en posicion " + neumatico.getPosicion()+ " inflado con exito.";
        }
        
        return "No se realizo inflado. Estado actual: " + estado;
    }
}
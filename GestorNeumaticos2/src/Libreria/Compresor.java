
package Libreria;

public class Compresor {
    private String idCompresor;
    private double potenciaPSIPorSegundo;

    public String inflar(Neumaticos neumatico, ISensor sensor) {
        // El compresor utiliza el sensor para validar el estado antes de actuar
        EstadoRueda estado = sensor.detectarEstadoPresion(neumatico);
        
        if (estado == EstadoRueda.baja_presion || estado == EstadoRueda.vacia) {
            neumatico.setPresionActual(32); // Inflado a presión estándar
            neumatico.setEstadoRueda(EstadoRueda.presion_optima);
            return "Neumático en posición " + neumatico.getPosicionNeumatico()+ " inflado con éxito.";
        }
        
        return "No se realizó inflado. Estado actual: " + estado;
    }
}
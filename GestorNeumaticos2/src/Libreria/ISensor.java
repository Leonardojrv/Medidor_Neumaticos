
package Libreria;

public interface ISensor {
    double medirPresion(Neumaticos neumatico);
    EstadoRueda detectarEstadoPresion(Neumaticos neumatico);
    boolean esLecturaValida();
    void calibrar();
}
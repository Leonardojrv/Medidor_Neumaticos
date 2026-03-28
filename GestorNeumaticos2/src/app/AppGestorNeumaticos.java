package app;

import Libreria.*;
import java.util.Scanner; // Necesario para la interacción por consola

public class AppGestorNeumaticos {
    
    public static void main(String args[]) {
        // 1. Inicialización del Vehículo
        Vehiculo toyota = new Vehiculo("Toyota", "Corolla", "KLMB-45");

        // 2. Creación e inserción de neumáticos iniciales
        Neumaticos n1 = new Neumaticos("1", PosicionRueda.delantera_izquierda, 25.0f, 32.0f);
        Neumaticos n2 = new Neumaticos("2", PosicionRueda.delantera_derecha, 32.0f, 32.0f);
        Neumaticos n3 = new Neumaticos("3", PosicionRueda.trasera_izquierda, 32.0f, 32.0f);
        Neumaticos n4 = new Neumaticos("4", PosicionRueda.trasera_derecha, 32.0f, 32.0f);
        
        toyota.agregarNeumatico(n1);
        toyota.agregarNeumatico(n2);
        toyota.agregarNeumatico(n3);
        toyota.agregarNeumatico(n4);

    SensorPresion sens = new SensorPresion();
    Compresor com = new Compresor();
    float pres = toyota.getNeumaticos().get(0).getPresionActual();
    
    System.out.println("Vehiculo: ");
    System.out.println("marca: " + toyota.getMarca());
    System.out.println("modelo: " + toyota.getModelo());
    System.out.println("placa: " + toyota.getPlaca());
    System.out.println("");
    
    System.out.println("--- ESTADO DE NEUMATICOS ---");
    System.out.println("neumatico delantera izquierda: " + toyota.getNeumaticos().get(0).getPresionActual() + " " + sens.detectarEstadoPresion(n1));
    System.out.println("neumatico delantera derecha: " + toyota.getNeumaticos().get(1).getPresionActual() + " " + sens.detectarEstadoPresion(n2));
    System.out.println("neumatico trasera izquierda: " + toyota.getNeumaticos().get(2).getPresionActual() + " " + sens.detectarEstadoPresion(n3));
    System.out.println("neumatico trasera derecha: " + toyota.getNeumaticos().get(3).getPresionActual() + " " + sens.detectarEstadoPresion(n4));
    System.out.println("");
    
    System.out.println("--- ESTADO DE NEUMATICOS inflados ---");
    System.out.println("neumatico a llenar delantera izquierda:  " + toyota.getNeumaticos().get(0).getPresionActual() + " " + com.inflar(n1, sens));
    System.out.println("neumatico a llenar delantera derecha: " + toyota.getNeumaticos().get(1).getPresionActual() + " " + com.inflar(n2, sens));
    System.out.println("neumatico a llenar trasera izquierda: " + toyota.getNeumaticos().get(2).getPresionActual() + " " + com.inflar(n3, sens));
    System.out.println("neumatico a llenar trasera derecha: " + toyota.getNeumaticos().get(3).getPresionActual() + " " + com.inflar(n4, sens));
    System.out.println("");
    
        Scanner teclado = new Scanner(System.in);
        
        // 4. Reporte Inicial de Datos
        System.out.println("Vehiculo: " + toyota.getMarca() + " " + toyota.getModelo() + " [" + toyota.getPlaca() + "]");
        System.out.println("--- ESTADO ACTUAL DE NEUMATICOS ---");
        for (Neumaticos n : toyota.getNeumaticos()) {
            System.out.println(n.getPosicion() + ": " + n.getPresionActual() + " PSI - Estado: " + sens.detectarEstadoPresion(n));
        }

        // 5. Lógica de Cambio de Neumático (Inspección Visual)
        System.out.println("\n---INSPECCIÓN VISUAL DE DESGASTE---");
        for (int i = 0; i < toyota.getNeumaticos().size(); i++) {
            Neumaticos nActual = toyota.getNeumaticos().get(i);
            
            System.out.print("¿Desea cambiar el neumático " + nActual.getPosicion() + " por desgaste? (si/no): ");
            String respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                // Creamos un neumático nuevo (ID con prefijo 'N' para diferenciarlo)
                Neumaticos repuesto = new Neumaticos("N-" + nActual.getIdNeumatico(), 
                                                    nActual.getPosicion(), 
                                                    32.0f, 32.0f);
                
                boolean cambiado = toyota.reemplazarNeumatico(nActual, repuesto);
                if (cambiado) {
                    System.out.println(">> Neumático " + nActual.getPosicion() + " reemplazado correctamente.");
                }
            }
        }

        // 6. Proceso de Inflado Automático
        System.out.println("\n--- INICIANDO PROCESO DE INFLADO ---");
        for (Neumaticos n : toyota.getNeumaticos()) {
            // Esta línea también fallará si 'ISe' no es una instancia válida
            String logInflado = com.inflar(n, sens);
            System.out.println(logInflado);
        }

        System.out.println("\n--- PROCESO FINALIZADO ---");
        teclado.close(); // Cerramos el scanner
    }
}
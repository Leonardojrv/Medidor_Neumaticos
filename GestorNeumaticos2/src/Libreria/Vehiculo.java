package Libreria;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private List<Neumaticos>neumaticos;
    
    
    public Vehiculo(){
    marca="";
    modelo="";
    placa="";
    }

    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.neumaticos = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   

    public boolean agregarNeumatico(Neumaticos n) {
        if (this.neumaticos.size() < 4) {
            return this.neumaticos.add(n);
        }
        return false;
    }

    public boolean quitarNeumatico(Neumaticos n) {
        return this.neumaticos.remove(n);
    }
   
    public boolean reemplazarNeumatico(Neumaticos viejo, Neumaticos nuevo) {
        try {
            int indice = this.neumaticos.indexOf(viejo);
            
            if (indice != -1) {
                this.neumaticos.set(indice, nuevo);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    //int getNeumaticoACambiar();
    
}




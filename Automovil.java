/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondealquiler;

/**
 *
 * @author Sam
 */
public class Automovil {
    
    //Atributos
    private String marca;
    private String linea;
    private String placa;
    private int estado;

    //Constructor
    public Automovil(String marca, String linea, String placa, int estado) {
        this.marca = marca;
        this.linea = linea;
        this.placa = placa;
        this.estado = estado;
    }
    
    
    //Getters y Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public String getPlaca() {
        return placa;
    }

    public int getEstado() {
        return estado;
    }
    
    
    
}

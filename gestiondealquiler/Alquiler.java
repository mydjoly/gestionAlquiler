/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondealquiler;

/**
 *
 * @author Sam
 */
public class Alquiler {
    
    //Atributos
    private int nuip;
    private String placa;
    private String fechaAlquiler;
    private int dias;
    
    //Constructor
    public Alquiler(int nuip, String placa, String fechaAlquiler, int dias) {
        this.nuip = nuip;
        this.placa = placa;
        this.fechaAlquiler = fechaAlquiler;
        this.dias = dias;
    }
    
    //Getters y Setters
    public void setNuip(int nuip) {
        this.nuip = nuip;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public int getNuip() {
        return nuip;
    }

    public String getPlaca() {
        return placa;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getDias() {
        return dias;
    }
    
    
}

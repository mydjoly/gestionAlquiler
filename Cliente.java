/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondealquiler;

/**
 *
 * @author Sam
 */
public class Cliente {
    
    //Atributos
    private int nuip;
    private String nombre;
    private int numeroTelefono;
    private String direccionResidencia;
    
    //Constructor
    public Cliente(int nuip, String nombre, int numeroTelefono, String direccionResidencia) {
        this.nuip = nuip;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direccionResidencia = direccionResidencia;
    }

    //Getters y Setters
    public int getNuip() {
        return nuip;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setNuip(int nuip) {
        this.nuip = nuip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }
    
    
    
    
    
}

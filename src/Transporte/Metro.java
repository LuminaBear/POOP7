/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Metro extends Subterraneos {
    private int numeroEstaciones;

    public Metro(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String lineaSubterranea, int numeroEstaciones) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas, lineaSubterranea);
        this.numeroEstaciones = numeroEstaciones;
    }

    public int getNumeroEstaciones() {
        return numeroEstaciones;
    }

    public void setNumeroEstaciones(int numeroEstaciones) {
        this.numeroEstaciones = numeroEstaciones;
    }

    public void viajarEnMetro() {
        System.out.println("Viajando en el metro de la línea " + getLineaSubterranea() + " que tiene " + numeroEstaciones + " estaciones.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Aereos extends MediosDeTransporte {
    private double altitudMaxima;

    public Aereos(String nombre, int capacidadPasajeros, double velocidadMaxima, double altitudMaxima) {
        super(nombre, capacidadPasajeros, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public void volar() {
        System.out.println("Volando con el medio de transporte aéreo: " + getNombre());
    }
}

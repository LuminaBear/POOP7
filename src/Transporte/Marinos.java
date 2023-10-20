/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Marinos extends MediosDeTransporte {
    private String tipoPropulsion;

    public Marinos(String nombre, int capacidadPasajeros, double velocidadMaxima, String tipoPropulsion) {
        super(nombre, capacidadPasajeros, velocidadMaxima);
        this.tipoPropulsion = tipoPropulsion;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    public void navegar() {
        System.out.println("Navegando con el medio de transporte marino: " + getNombre());
    }
}

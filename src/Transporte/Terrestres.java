/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Terrestres extends MediosDeTransporte {
    private int numeroRuedas;

    public Terrestres(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas) {
        super(nombre, capacidadPasajeros, velocidadMaxima);
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public void conducir() {
        System.out.println("Conduciendo el medio de transporte terrestre: " + getNombre());
    } 
}

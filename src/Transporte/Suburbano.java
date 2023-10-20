/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Suburbano extends Subterraneos {
    private String destino;

    public Suburbano(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String lineaSubterranea, String destino) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas, lineaSubterranea);
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void viajarEnSuburbano() {
        System.out.println("Viajando en el tren suburbano de la línea " + getLineaSubterranea() + " con destino a " + destino + ".");
    }
}

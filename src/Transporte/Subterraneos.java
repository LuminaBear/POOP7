/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Subterraneos extends Terrestres {
    private String lineaSubterranea;

    public Subterraneos(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String lineaSubterranea) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas);
        this.lineaSubterranea = lineaSubterranea;
    }

    public String getLineaSubterranea() {
        return lineaSubterranea;
    }

    public void setLineaSubterranea(String lineaSubterranea) {
        this.lineaSubterranea = lineaSubterranea;
    }

    public void navegarSubterraneo() {
        System.out.println("Navegando subterráneamente en la línea: " + lineaSubterranea);
    }  
}

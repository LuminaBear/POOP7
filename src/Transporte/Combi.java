/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Combi extends Supraterraneos {
    private String ruta;

    public Combi(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String tipoCarroceria, String ruta) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas, tipoCarroceria);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void ofrecerTransporte() {
        System.out.println("La combi de la ruta " + ruta + " está ofreciendo transporte como " + getNombre() + ".");
    }
}

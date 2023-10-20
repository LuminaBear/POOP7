/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Avion extends Aereos {
    private int numeroMotores;

    public Avion(String nombre, int capacidadPasajeros, double velocidadMaxima, double altitudMaxima, int numeroMotores) {
        super(nombre, capacidadPasajeros, velocidadMaxima, altitudMaxima);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public void despegar() {
        System.out.println("El avión con " + numeroMotores + " motores está despegando.");
    }
}

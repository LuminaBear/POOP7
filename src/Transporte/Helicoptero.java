/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Helicoptero extends Aereos {
    private int numeroRotores;
    private String tipoDeServicio;

    public Helicoptero(String nombre, int capacidadPasajeros, double velocidadMaxima, double altitudMaxima) {
        super(nombre, capacidadPasajeros, velocidadMaxima, altitudMaxima);
    }

    public int getNumRotores() {
        return numeroRotores;
    }

    public void setNumRotores(int numeroRotores) {
        this.numeroRotores = numeroRotores;
    }
    
    public String getTipo() {
        return tipoDeServicio;
    }

    public void setTipo(String tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }

    public void despegar() {
        System.out.println("El helicoptero se especializa en "+ tipoDeServicio +", y tiene "+ numeroRotores +" rotores.");
    }
}

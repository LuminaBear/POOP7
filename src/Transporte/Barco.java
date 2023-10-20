/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Barco extends Marinos {
    private int longitud, numeroTurbinas;

    public Barco(String nombre, int capacidadPasajeros, double velocidadMaxima, String tipoPropulsion) {
        super(nombre, capacidadPasajeros, velocidadMaxima, tipoPropulsion);
    }
    
    public int getLong (){
        return longitud;
    }
    
    public void setLong (int longitud){
        this.longitud = longitud;
    }
    
    public int getNumTurbinas (){
        return numeroTurbinas;
    }
    
    public void setNumTurbinas (int numeroTurbinas){
        this.numeroTurbinas = numeroTurbinas;
    }
    
    public void zarpar() {
        System.out.println("El barco posee "+ numeroTurbinas +" turbinas, y ademas tiene una longitud de "+ longitud +" metros.");
    }
    
}
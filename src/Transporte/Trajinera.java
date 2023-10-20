/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Trajinera extends Marinos {
    private int numeroPasajeros;
    private String nombre;

    public Trajinera(String nombre, int capacidadPasajeros, double velocidadMaxima, String tipoPropulsion) {
        super(nombre, capacidadPasajeros, velocidadMaxima, tipoPropulsion);
    }
    
    public int getNumPasajeros (){
        return numeroPasajeros;
    }
    
    public void setNumPasajeros (int numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;
    }
    
    public String getName (){
        return nombre;
    }
    
    public void setName (String name){
        this.nombre = name;
    }
    
    public void zarpar() {
        System.out.println("La trajinera de nombre "+ nombre +" ha zarpado con "+ numeroPasajeros +" pasajeros,y dara un recorrido.");
    }
    
}

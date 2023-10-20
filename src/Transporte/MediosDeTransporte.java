/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class MediosDeTransporte {
    // Atributos
    private String nombre;
    private int capacidadPasajeros;
    private double velocidadMaxima;
    private double velocidadActual;

    // Constructor
    public MediosDeTransporte(String nombre, int capacidadPasajeros, double velocidadMaxima) {
        this.nombre = nombre;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
        // Método para acelerar el medio de transporte
    public void acelerar(double incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {
            velocidadActual += incrementoVelocidad;
            System.out.println(nombre + " acelerando a " + velocidadActual + " km/h");
        } else {
            System.out.println(nombre + " no puede superar su velocidad máxima de " + velocidadMaxima + " km/h");
        }
    }

    // Método para frenar el medio de transporte
    public void frenar(double decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual -= decrementoVelocidad;
            System.out.println(nombre + " frenando a " + velocidadActual + " km/h");
        } else {
            System.out.println(nombre + " ya está detenido.");
        }
    }

    // Método toString para representar la información del medio de transporte
    @Override
    public String toString() {
        return "Medio de Transporte: " + nombre + 
               "\nCapacidad de Pasajeros: " + capacidadPasajeros + 
               "\nVelocidad Máxima: " + velocidadMaxima + " km/h";
    }
}

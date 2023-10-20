/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Taxi extends Supraterraneos {
    private String licenciaTaxi;

    public Taxi(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String tipoCarroceria, String licenciaTaxi) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas, tipoCarroceria);
        this.licenciaTaxi = licenciaTaxi;
    }

    public String getLicenciaTaxi() {
        return licenciaTaxi;
    }

    public void setLicenciaTaxi(String licenciaTaxi) {
        this.licenciaTaxi = licenciaTaxi;
    }

    public void prestarServicio() {
        System.out.println("El taxi con licencia " + licenciaTaxi + " está prestando servicio como " + getNombre() + ".");
    }
}

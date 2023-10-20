/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author POOP
 */
public class Supraterraneos extends Terrestres {
    private String tipoCarroceria;

    public Supraterraneos(String nombre, int capacidadPasajeros, double velocidadMaxima, int numeroRuedas, String tipoCarroceria) {
        super(nombre, capacidadPasajeros, velocidadMaxima, numeroRuedas);
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public void conducirSupraterraneo() {
        System.out.println("Conduciendo el medio de transporte supraterráneo con carrocería: " + tipoCarroceria);
    }
}

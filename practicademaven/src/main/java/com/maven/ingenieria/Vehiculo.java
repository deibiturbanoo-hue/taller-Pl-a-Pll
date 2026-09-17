

package com.maven.ingenieria;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int anioFabricacion;

    public Vehiculo(String marca, String modelo, String placa, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
    }

    public void encender() {
        System.out.println("El vehiculo " + marca + " " + modelo + " esta encendido.");
    }

    public void apagar() {
        System.out.println("El vehiculo " + marca + " " + modelo + " esta apagado.");
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
    public int getAnioFabricacion() { return anioFabricacion; }
}
    

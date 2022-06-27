/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombre;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String a, String b) {
        nombre = a;
        placa = b;

    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerPlaca(String a) {
        placa = a;
    }
    public abstract void establecerValorCancelar();

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    
    
}

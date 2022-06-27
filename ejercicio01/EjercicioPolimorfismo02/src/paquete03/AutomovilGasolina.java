/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numGalonesMaximo;
    private double costoGalon;
    private double iva = 0.10;

// 3, 20.0 = 66
    public AutomovilGasolina(int num, double galon,
            String a, String b) {
        super(a, b);
        numGalonesMaximo = num;
        costoGalon = galon;
    }

    public void establecerNumGalonesMaximo(int a) {
        numGalonesMaximo = a;
    }

    public void establecerCostoGalon(double a) {
        costoGalon = a;
    }

    public void establecerIva(double a) {
        iva = a;
    }
// 2, 20, 10%
    @Override
    public void establecerValorCancelar() {
        valorCancelar = (costoGalon * numGalonesMaximo) + iva * (costoGalon * numGalonesMaximo);
    }

    public int obtenerNumGalonesMaximo() {
        return numGalonesMaximo;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("REPORTE AUTOMÓVILES GASOLINA\n"
                + "Numero de Galones: %d\n"
                + "Costo por galón de Gasolina: %.2f\n"
                + "Iva: %.2f\n"
                + "valorCancelar: %.2f\n",
                 numGalonesMaximo, costoGalon, iva, valorCancelar);
        return cadena;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    
    private int numLitrosMaximo;
    private double costoLitro;
    private double descuento;
    private double lDescuentazo;


    public AutomovilDiesel(int num, double galon, double desc,
            String a, String b) {
        super(a, b);
        numLitrosMaximo = num;
        costoLitro = galon;
        descuento = desc;
    }

    public void establecerNumGalonesMaximo(int a) {
        numLitrosMaximo = a;
    }

    public void establecerCostoGalon(double a) {
        costoLitro = a;
    }

    public void establecerDescuento() {
        lDescuentazo = numLitrosMaximo - (descuento * numLitrosMaximo/100);
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = costoLitro + lDescuentazo;
    }

    public int obtenerNumGalonesMaximo() {
        return numLitrosMaximo;
    }

    public double obtenerCostoGalon() {
        return costoLitro;
    }

    public double obtenerDescuento() {
        return lDescuentazo;
    }

    @Override
    public String toString() {
        String cadena = String.format("REPORTE AUTOMÓVILES DIESEL\n"
                + "Numero de Litros: %d\n"
                + "Numero de Litros de descuento: %.2f\n"
                + "Costo por galón de Gasolina: %.2f\n"
                + "Iva: %.2f\n"
                + "valorCancelar: %.2f\n",
                 numLitrosMaximo, lDescuentazo, costoLitro, descuento, valorCancelar);
        return cadena;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        ArrayList<Automovil> auto = new ArrayList<>();

        AutomovilGasolina ag = new AutomovilGasolina(
                3, 20.0, "Ronin Carrion", "LBA-7353");
        AutomovilDiesel ad = new AutomovilDiesel(
                20, 2, 10, "Ronin Carrion", "LBA-7353");
        ad.establecerDescuento();
        auto.add(ag);
        auto.add(ad);
        
        for (int i = 0; i < auto.size(); i++) {
            auto.get(i).establecerValorCancelar();
            
        }
        for (int i = 0; i < auto.size(); i++) {
            System.out.println(auto.get(i));
            
        }
    }
}

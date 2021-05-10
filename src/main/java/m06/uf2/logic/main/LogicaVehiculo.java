/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Familiar;
import m06.uf2.logic.models.Turisme;
import m06.uf2.presentacio.Vista;

/**
 *
 * @author capel
 */
public class LogicaVehiculo {

    static Vista view = new Vista();

    public static Turisme altaTurismo(Class<?> tipus) {
        Turisme ret = null;
        if (tipus == Coupe.class) {
            ret = new Coupe();
            view.altaTurismo();
        } else {
            ret = new Familiar();
        }

        return ret;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import java.util.Scanner;
import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Familiar;
import m06.uf2.presentacio.Vista;

/**
 *
 * @author manel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    Scanner scanner = new Scanner(System.in);
    static Vista view = new Vista();

    public static void main(String[] args) {
        boolean atras = false;
        do {
            switch (view.menu()) {
                case 1:
                    menuVehiculo();
                    break;
                case 2:
                    menuPropietario();
                    break;
                case 3:
                    menuOcupante();
                    break;
                case 4:
                    menuPoliza();
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void menuVehiculo() {

        boolean atras = false;
        do {
            switch (view.menuVehiculo()) {
                case 1:
                    selTipoVehiculo();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);

    }

    public static void menuOcupante() {
        boolean atras = false;
        do {
            switch (view.menuOcupante()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void menuPoliza() {
        boolean atras = false;
        do {
            switch (view.menuPoliza()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void menuPropietario() {
        boolean atras = false;
        do {
            switch (view.menuPropietario()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void selTipoVehiculo() {
        boolean atras = false;
        do {
            switch (view.typeVehiculo()) {
                case 1:
                    menuTurismo();
                    break;
                case 2:
                    menuMotocicleta();
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void menuTurismo() {
        boolean atras = false;
        do {
            switch (view.typeTurismo()) {
                case 1:
                    ProjectAPI.vehicleFactory(Coupe.class);
                    break;
                case 2:
                    ProjectAPI.vehicleFactory(Familiar.class);
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

    public static void menuMotocicleta() {
        boolean atras = false;
        do {
            switch (view.typeMotocicleta()) {
                case 1:

                    break;
                case 2:
                    break;
                case 0:
                    atras = true;
                    break;
            }
        } while (!atras);
    }

}

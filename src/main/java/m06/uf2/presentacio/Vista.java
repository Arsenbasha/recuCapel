/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.presentacio;

import java.util.Scanner;
import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Turisme;

/**
 *
 * @author capel
 */
public class Vista {

    static Scanner scanner = new Scanner(System.in);

    /**
     */
    public int menu() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :administrar Vehiculo");
        System.out.println("opcion 2 :administrar Propietario");
        System.out.println("opcion 3 :administrar Ocupante ");
        System.out.println("opcion 4 :administrar Poliza");
        System.out.println("Opción 0: salir");
        return scanner.nextInt();
    }

    public int menuVehiculo() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Vehiculo");
        System.out.println("opcion 2 :Actualizar Vehiculo");
        System.out.println("opcion 3 :Eliminar Vehiculo ");
        System.out.println("opcion 4 :Ver Vehiculo");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();
    }

    public int menuPropietario() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Propietario");
        System.out.println("opcion 2 :Actualizar Propietario");
        System.out.println("opcion 3 :Eliminar Propietario ");
        System.out.println("opcion 4 :Ver Propietario");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();
    }

    public int menuOcupante() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Ocupante");
        System.out.println("opcion 2 :Actualizar Ocupante");
        System.out.println("opcion 3 :Eliminar Ocupante ");
        System.out.println("opcion 4 :Ver Propietario");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();
    }

    public int menuPoliza() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Poliza");
        System.out.println("opcion 2 :Actualizar Poliza");
        System.out.println("opcion 3 :Eliminar Poliza ");
        System.out.println("opcion 4 :Ver Poliza");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();
    }

    public int typeVehiculo() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Turismo");
        System.out.println("opcion 2 :Motocicleta");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();

    }

    public int typeMotocicleta() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Trail");
        System.out.println("opcion 2 :Scooter");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();

    }

    public int typeTurismo() {
        System.out.println("\nElige una opción:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Coupe");
        System.out.println("opcion 2 :Familiar");
        System.out.println("Opción 0: atras");
        return scanner.nextInt();

    }

    public Turisme altaTurismoGenerico(Turisme ret) {

        ret.setNumPortes(scanner.nextInt());
        System.out.println("Vidrios Tintados (S/N)");
        String v = scanner.nextLine();
        ret.setVidresTintats(v.toLowerCase().equals("s"));
        System.out.println("Matricula");
        ret.setMatricula(scanner.nextInt());
        System.out.println("Nº Bastidor");
        ret.setNumBastidor(scanner.nextLine());
        System.out.println("Numeros de puertas");
        ret.setNumPortes(scanner.nextInt());
        return ret;
    }

    public Turisme altaTurismoCoupe() {
        Turisme ret = null;
        return ret;
    }
    public Turisme altaTurismoFamiliar() {
        Turisme ret = null;
        return ret;
    }
}

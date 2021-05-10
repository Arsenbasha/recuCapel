/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.presentacio;

import java.util.Scanner;
import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Familiar;
import m06.uf2.logic.models.Motocicleta;
import m06.uf2.logic.models.Scooter;
import m06.uf2.logic.models.Trail;
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
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :administrar Vehiculo");
        System.out.println("opcion 2 :administrar Propietario");
        System.out.println("opcion 3 :administrar Ocupante ");
        System.out.println("opcion 4 :administrar Poliza");
        System.out.println("Opci贸n 0: salir");
        return scanner.nextInt();
    }

    public int menuVehiculo() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Vehiculo");
        System.out.println("opcion 2 :Actualizar Vehiculo");
        System.out.println("opcion 3 :Eliminar Vehiculo ");
        System.out.println("opcion 4 :Ver Vehiculo");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();
    }

    public int menuPropietario() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Propietario");
        System.out.println("opcion 2 :Actualizar Propietario");
        System.out.println("opcion 3 :Eliminar Propietario ");
        System.out.println("opcion 4 :Ver Propietario");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();
    }

    public int menuOcupante() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Ocupante");
        System.out.println("opcion 2 :Actualizar Ocupante");
        System.out.println("opcion 3 :Eliminar Ocupante ");
        System.out.println("opcion 4 :Ver Propietario");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();
    }

    public int menuPoliza() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Alta Poliza");
        System.out.println("opcion 2 :Actualizar Poliza");
        System.out.println("opcion 3 :Eliminar Poliza ");
        System.out.println("opcion 4 :Ver Poliza");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();
    }

    public int typeVehiculo() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Turismo");
        System.out.println("opcion 2 :Motocicleta");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();

    }

    public int typeMotocicleta() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Trail");
        System.out.println("opcion 2 :Scooter");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();

    }

    public int typeTurismo() {
        System.out.println("\nElige una opci贸n:");
        System.out.println("******************************");
        System.out.println("opcion 1 :Coupe");
        System.out.println("opcion 2 :Familiar");
        System.out.println("Opci贸n 0: atras");
        return scanner.nextInt();

    }

    public Turisme altaTurismoGenerico(Turisme ret) {
        System.out.println("Vidrios Tintados (S/N)");
        String v = scanner.nextLine();
        ret.setVidresTintats(v.toLowerCase().equals("s"));
        System.out.println("Matricula");
        ret.setMatricula(scanner.nextInt());
        System.out.println("N潞 Bastidor");
        ret.setNumBastidor(scanner.nextLine());
        System.out.println("Numeros de puertas");
        ret.setNumPortes(scanner.nextInt());
        return ret;
    }

    public Turisme altaTurismoCoupe() {
        Coupe ret = new Coupe();
        System.out.println("Cuantos caballos tiene ");
        ret.setCavallsMotor(scanner.nextInt());
        System.out.println("Techo rectactil (S/N)");
        String v = scanner.nextLine();
        ret.setIsSostreRetractil(v.toLowerCase().equals("s"));
        return ret;
    }

    public Turisme altaTurismoFamiliar() {
        Familiar ret = new Familiar();
        System.out.println("Capacidad Maletero ");
        ret.setCapacitatDm3Maleter(scanner.nextInt());
        System.out.println("Techo rectactil (S/N)");
        String v = scanner.nextLine();
        ret.setIsSuportCaravana(v.toLowerCase().equals("s"));
        return ret;
    }

    public Motocicleta altaMotocicletaGenerico(Motocicleta ret) {

        System.out.println("Vidrios Tintados (S/N)");
        String v = scanner.nextLine();
        ret.setCaballetCentral(v.toLowerCase().equals("s"));
        System.out.println("Matricula");
        ret.setMatricula(scanner.nextInt());
        System.out.println("N潞 Bastidor");
        ret.setNumBastidor(scanner.nextLine());
        System.out.println("Numeros de puertas");
        ret.setCapacitatDm3Maleta(scanner.nextInt());
        return ret;
    }

    public Motocicleta altaMotocicletaTrail() {
        Trail ret = new Trail();

        System.out.println("MM suspensi髇:");
        ret.setMmSuspensio(scanner.nextInt());
        System.out.println("Neumaticos todo terreno?:");
        String v = scanner.nextLine();
        ret.setIsNeumaticsTotTerreny(v.toLowerCase().equals("s"));

        return ret;
    }

    public Motocicleta altaMotocicletaScooter() {
        Scooter ret = new Scooter();

        System.out.println("MM suspensi髇:");
        String v = scanner.nextLine();
        ret.setIsCiclomotor(v.toLowerCase().equals("s"));
        System.out.println("Neumaticos todo terreno?:");
        String v2 = scanner.nextLine();
        ret.setIsLlumsLed(v.toLowerCase().equals("s"));

        return ret;
    }

}

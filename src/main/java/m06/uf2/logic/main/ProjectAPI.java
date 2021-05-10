/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Familiar;
import m06.uf2.logic.models.Ocupant;
import m06.uf2.logic.models.Persona;
import m06.uf2.logic.models.Polissa;
import m06.uf2.logic.models.Propietari;
import m06.uf2.logic.models.Scooter;
import m06.uf2.logic.models.Trail;
import m06.uf2.logic.models.Vehicle;

/**
 *
 * @author manel
 */
public class ProjectAPI {
    
    /**
     * Afegeix els ocupants al vehicle
     * @param lo LLista dels ocupants
     * @param v Vehicle
     * @return 
     */
    public static Vehicle addOcupantsToVehicle(List<Persona> lo, Vehicle v)
    {
            
        for (Persona o : lo)
        {
            v.getOcupants().add((Ocupant)o);
        }
              
        return v;
    }
    
    /**
     * Afegeix els propietaris al vehicle
     * @param lp llispa de propietaris
     * @param v vehicle
     * @return 
     */
    public static Vehicle addPropietarisToVehicle(List<Persona> lp, Vehicle v)
    {
               
        for (Persona p : lp)
        {
            v.getCopropietaris().add((Propietari)p);
        }
             
        return v;
    }
    
    /**
     * Afegeix la polissa al vehicle
     * @param p polissa
     * @param v vehicle
     * @return 
     */
    public static Vehicle addPolissaToVehicle(Polissa p, Vehicle v)
    {
        v.setPolissaVehicle(p);
        
        return v;
    }
    
    /**
     * Retorna una instancia del tipus demanat amb dades inventades
     * @param tipus (Trail, Scooter, Familiar, Coupe)
     * @return 
     */
    public static Vehicle vehicleFactory(Class<?> tipus)
    {
        Faker f = SingletonFaker.getInstance().getFaker();
        
        String numBastidor = f.numerify("#######");
        int numPortes = Utils.getRandomNumberInRange(2,5);
        boolean vidresTintats = Utils.getRandomTrueFalse(); 
        boolean caballetCentral = Utils.getRandomTrueFalse(); 
        int capacitatDm3Maleta = Utils.getRandomNumberInRange(10,50);
        boolean isCiclomotor = Utils.getRandomTrueFalse(); 
        boolean isLlumsLed = Utils.getRandomTrueFalse(); 
        int mmSuspensio = Utils.getRandomNumberInRange(80,120);
        boolean isNeumaticsTotTerreny = Utils.getRandomTrueFalse(); 
        int capacitatDm3Maleter = Utils.getRandomNumberInRange(300,500);
        boolean isSuportCaravana = Utils.getRandomTrueFalse();
        int cavallsMotor = Utils.getRandomNumberInRange(200,500);
        boolean isSostreRetractil = Utils.getRandomTrueFalse();
        
        
        Vehicle ret = null;
        
        if (tipus == Scooter.class)
        {
            ret = new Scooter(isCiclomotor, isLlumsLed, caballetCentral, capacitatDm3Maleta, numBastidor);
        } 
        else if (tipus == Trail.class)
        {
            ret = new Trail(mmSuspensio, isNeumaticsTotTerreny, caballetCentral, capacitatDm3Maleta, numBastidor);
        }
        else if (tipus == Familiar.class)
        {
            ret = new Familiar(capacitatDm3Maleter, isSuportCaravana, numPortes, vidresTintats, numBastidor);
        }
        else if (tipus == Coupe.class)
        {
            ret = new Coupe(cavallsMotor, isSostreRetractil, numPortes, vidresTintats, numBastidor);
        }
                         
        return ret;    
    }
    
   
    /**
     * REtorna una llista d'ocupants amb les dades inventades
     * @param elements quantitat d'elements a retornar
     * @return 
     */
    public static List<Persona> ocupantsFactory(int elements)
    {
        List<Persona> ret = new ArrayList<>();
        
        for (int e = 0; e<elements; e++)
        {
            ret.add(personaFactory(Ocupant.class));
        }
                         
        return ret;    
    }
    
    /**
     * Retorna una llista de propietaris amb les dades inventades
     * @param elements quantitat d'elements a retornar
     * @return 
     */
    public static List<Persona> propietarisFactory(int elements)
    {
        List<Persona> ret = new ArrayList<>();
     
        for (int e = 0; e<elements; e++)
        {
            ret.add(personaFactory(Propietari.class));
        }
                        
        return ret;    
    }
    
    /**
     * Crea una instancia de Ocupant o Propietari segons el paràmetre subministrat
     * @param tipus
     * @return 
     */
    public static Persona personaFactory(Class<?> tipus)
    {    
        Faker f = SingletonFaker.getInstance().getFaker();
        Persona ret = null;
        String nom = f.name().firstName();
        String cognom1 = f.name().lastName();
        String cognom2 = f.name().lastName();
        boolean isConductor = Utils.getRandomTrueFalse();
        int edat = Utils.getRandomNumberInRange(18, 99);
        boolean isRenting = Utils.getRandomTrueFalse();
        Date dataCompra = new Date();
        
        if (tipus == Ocupant.class)
        {
            ret = new Ocupant(isConductor, edat,  nom,  cognom1, cognom2);
        } 
            else
        {
            ret = new Propietari(isRenting, dataCompra, nom, cognom1, cognom2);
        }
                         
        return ret;    
    }
    
    /**
     * Crea una instancia de polissa amb les dades inventades
     * @return 
     */
    public static Polissa polissaFactory()
    {
        Polissa ret = null;
         
        ret = new Polissa(new Date(), new Date());
          
        return ret;
        
    }
    
}

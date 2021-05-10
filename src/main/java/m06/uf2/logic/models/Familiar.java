/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author manel
 */
@Entity 
@Table
public class Familiar extends Turisme{
    
   @Column
   private int capacitatDm3Maleter;
   
   @Column
   private boolean isSuportCaravana;
   
   public Familiar(){};

    public Familiar(int capacitatDm3Maleter, boolean isSuportCaravana, int numPortes, boolean vidresTintats, String numBastidor) {
        super(numPortes, vidresTintats, numBastidor);
        this.capacitatDm3Maleter = capacitatDm3Maleter;
        this.isSuportCaravana = isSuportCaravana;
    }

   public int getCapacitatDm3Maleter() {
        return capacitatDm3Maleter;
   }

   public void setCapacitatDm3Maleter(int capacitatDm3Maleter) {
        this.capacitatDm3Maleter = capacitatDm3Maleter;
   }

   public boolean getIsSuportCaravana() {
        return isSuportCaravana;
   }

   public void setIsSuportCaravana(boolean isSuportCaravana) {
        this.isSuportCaravana = isSuportCaravana;
   }

   @Override
   public String toString() {
       return "Familiar{" + "capacitatDm3Maleter=" + capacitatDm3Maleter + ", isSuportCaravana=" + isSuportCaravana + '}';
   }
   
   
    
}

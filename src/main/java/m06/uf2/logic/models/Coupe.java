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
public class Coupe extends Turisme{

   @Column
   private int cavallsMotor;
   
   @Column
   private boolean isSostreRetractil;
   
   public Coupe() {};

   public Coupe(int cavallsMotor, boolean isSostreRetractil, int numPortes, boolean vidresTintats, String numBastidor) {
        super(numPortes, vidresTintats, numBastidor);
        this.cavallsMotor = cavallsMotor;
        this.isSostreRetractil = isSostreRetractil;
   }

   public int getCavallsMotor() {
        return cavallsMotor;
   }

   public void setCavallsMotor(int cavallsMotor) {
        this.cavallsMotor = cavallsMotor;
   }

   public boolean isIsSostreRetractil() {
        return isSostreRetractil;
   }

   public void setIsSostreRetractil(boolean isSostreRetractil) {
        this.isSostreRetractil = isSostreRetractil;
   }

    @Override
    public String toString() {
        return "Coupe{" + "cavallsMotor=" + cavallsMotor + ", isSostreRetractil=" + isSostreRetractil + '}';
    } 
}

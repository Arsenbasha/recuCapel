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
public abstract class Motocicleta extends Vehicle{
    
    @Column
    private boolean caballetCentral;
    
    @Column
    private int capacitatDm3Maleta;
    
    public Motocicleta(){};

    public Motocicleta(boolean caballetCentral, int capacitatDm3Maleta, String numBastidor) {
        super(numBastidor);
        this.caballetCentral = caballetCentral;
        this.capacitatDm3Maleta = capacitatDm3Maleta;
    }

    public int getCapacitatDm3Maleta() {
        return capacitatDm3Maleta;
    }

    public void setCapacitatDm3Maleta(int capacitatDm3Maleta) {
        this.capacitatDm3Maleta = capacitatDm3Maleta;
    }

    

    public boolean isCaballetCentral() {
        return caballetCentral;
    }

    public void setCaballetCentral(boolean caballetCentral) {
        this.caballetCentral = caballetCentral;
    }

    @Override
    public String toString() {
        return super.toString() +"Motocicleta{" + "caballetCentral=" + caballetCentral + '}';
    }
    
    
    
}

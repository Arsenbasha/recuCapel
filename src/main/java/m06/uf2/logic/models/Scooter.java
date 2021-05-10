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
public class Scooter extends Motocicleta{
    
    @Column
    private boolean isCiclomotor;
    
    @Column
    private boolean isLlumsLed;
    
    public Scooter(){};

    public Scooter(boolean isCiclomotor, boolean isLlumsLed, boolean caballetCentral, int capacitatDm3Maleta, String numBastidor) {
        super(caballetCentral, capacitatDm3Maleta, numBastidor);
        this.isCiclomotor = isCiclomotor;
        this.isLlumsLed = isLlumsLed;
    }

    public boolean isIsCiclomotor() {
        return isCiclomotor;
    }

    public void setIsCiclomotor(boolean isCiclomotor) {
        this.isCiclomotor = isCiclomotor;
    }

    public boolean isIsLlumsLed() {
        return isLlumsLed;
    }

    public void setIsLlumsLed(boolean isLlumsLed) {
        this.isLlumsLed = isLlumsLed;
    }

    @Override
    public String toString() {
        return "Scooter{" + "isCiclomotor=" + isCiclomotor + ", isLlumsLed=" + isLlumsLed + '}';
    }
    
}

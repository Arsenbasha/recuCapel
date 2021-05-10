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
public class Ocupant extends Persona{
   
    @Column
    private boolean isConductor;
    
    @Column
    private int edat;
    
    public Ocupant(){}

    public Ocupant(boolean isConductor, int edat, String nom, String cognom1, String cognom2) {
        super(nom, cognom1, cognom2);
        this.isConductor = isConductor;
        this.edat = edat;
    }

    public boolean isIsConductor() {
        return isConductor;
    }

    public void setIsConductor(boolean isConductor) {
        this.isConductor = isConductor;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Ocupant{" + "isConductor=" + isConductor + ", edat=" + edat + '}';
    }
}

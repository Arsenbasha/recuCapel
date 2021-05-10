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
public class Trail extends Motocicleta{
    
    @Column
    private int mmSuspensio;
    
    @Column
    private boolean isNeumaticsTotTerreny;
    
    public Trail(){};

    public Trail(int mmSuspensio, boolean isNeumaticsTotTerreny, boolean caballetCentral, int capacitatDm3Maleta, String numBastidor) {
        super(caballetCentral, capacitatDm3Maleta, numBastidor);
        this.mmSuspensio = mmSuspensio;
        this.isNeumaticsTotTerreny = isNeumaticsTotTerreny;
    }

    public int getMmSuspensio() {
        return mmSuspensio;
    }

    public void setMmSuspensio(int mmSuspensio) {
        this.mmSuspensio = mmSuspensio;
    }

    public boolean isIsNeumaticsTotTerreny() {
        return isNeumaticsTotTerreny;
    }

    public void setIsNeumaticsTotTerreny(boolean isNeumaticsTotTerreny) {
        this.isNeumaticsTotTerreny = isNeumaticsTotTerreny;
    }

    @Override
    public String toString() {
        return "Trail{" + "mmSuspensio=" + mmSuspensio + ", isNeumaticsTotTerreny=" + isNeumaticsTotTerreny + '}';
    }
}

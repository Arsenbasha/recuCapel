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
public abstract class Turisme extends Vehicle {
    
    @Column
    private int numPortes;
    
    @Column
    private boolean vidresTintats;
    
    public Turisme(){};

    public Turisme(int numPortes, boolean vidresTintats, String numBastidor) {
        super(numBastidor);
        this.numPortes = numPortes;
        this.vidresTintats = vidresTintats;
    }

    public int getNumPortes() {
        return numPortes;
    }

    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }
    
    public boolean isVidresTintats() {
        return vidresTintats;
    }

    public void setVidresTintats(boolean vidresTintats) {
        this.vidresTintats = vidresTintats;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Turisme{" + "numPortes=" + numPortes + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author manel
 */
@Entity 
@Table
public class Propietari extends Persona{
    
    @Column
    private boolean isRenting;
    
    @Column
    private Date dataCompra;
    
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "copropietaris")
    private List<Vehicle> poseeix = new ArrayList<>();
    
    public Propietari(){}

    public Propietari(boolean isRenting, Date dataCompra, String nom, String cognom1, String cognom2) {
        super(nom, cognom1, cognom2);
        this.isRenting = isRenting;
        this.dataCompra = dataCompra;
    }

    public boolean isIsRenting() {
        return isRenting;
    }

    public void setIsRenting(boolean isRenting) {
        this.isRenting = isRenting;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public List<Vehicle> getPoseeix() {
        return poseeix;
    }

    public void setPoseeix(List<Vehicle> poseeix) {
        this.poseeix = poseeix;
    }

    @Override
    public String toString() {
        return "Propietari{" + "isRenting=" + isRenting + ", dataCompra=" + dataCompra + ", poseeix=" + poseeix + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author manel
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer matricula;
    
    @Column(unique=true)
    private String numBastidor;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Propietari> copropietaris = new ArrayList<>();
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "departament_id")
    private List<Ocupant> ocupants = new ArrayList<>();
            
    @OneToOne(cascade = {CascadeType.ALL})
    private Polissa polissaVehicle;
    
    public Vehicle(){}

    public Vehicle(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public List<Propietari> getCopropietaris() {
        return copropietaris;
    }

    public void setCopropietaris(List<Propietari> copropietaris) {
        this.copropietaris = copropietaris;
    }

    public List<Ocupant> getOcupants() {
        return ocupants;
    }

    public void setOcupants(List<Ocupant> ocupants) {
        this.ocupants = ocupants;
    }

    public Polissa getPolissaVehicle() {
        return polissaVehicle;
    }

    public void setPolissaVehicle(Polissa polissaVehicle) {
        this.polissaVehicle = polissaVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", numBastidor=" + numBastidor + ", copropietaris=" + copropietaris.size() + ", ocupants=" + ocupants.size() + ", polissaVehicle=" + polissaVehicle + '}';
    }

   
}

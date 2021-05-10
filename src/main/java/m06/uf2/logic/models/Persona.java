/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author manel
 */
@Entity 
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    
    @Column
    private String nom;
    
    @Column
    private String cognom1;
    
    @Column
    private String cognom2;
    
    public Persona(){}

    public Persona(String nom, String cognom1, String cognom2) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + '}';
    }
    
    
    
}

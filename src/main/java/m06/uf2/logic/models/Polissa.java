/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author manel
 */
@Entity 
@Table
public class Polissa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    
    @Column
    private Date dataInici;
    
    @Column
    private Date dataCaducitat;

    public Polissa() {
    }

    public Polissa(Date dataInici, Date dataCaducitat) {
        this.dataInici = dataInici;
        this.dataCaducitat = dataCaducitat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(Date dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public String toString() {
        return "Polissa{" + "id=" + id + ", dataInici=" + dataInici + ", dataCaducitat=" + dataCaducitat + '}';
    }
    
    
}

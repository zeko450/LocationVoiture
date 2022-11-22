package com.example.locationvoiture.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity
public class Reservation {
    @Id
    private Integer id;
    private Date dateReservation;
    private Date dateCirculation;
    private Date dateRetour;
    @ManyToOne
    @JoinColumn(name="client_id_FK")
    private Client client;


    public Reservation() {
    }

    public Reservation(Date dateReservation, Date dateCirculation, Date dateRetour) {
        this.dateReservation = dateReservation;
        this.dateCirculation = dateCirculation;
        this.dateRetour = dateRetour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateCirculation() {
        return dateCirculation;
    }

    public void setDateCirculation(Date dateCirculation) {
        this.dateCirculation = dateCirculation;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateReservation=" + dateReservation +
                ", dateCirculation=" + dateCirculation +
                ", dateRetour=" + dateRetour +
                '}';
    }
}

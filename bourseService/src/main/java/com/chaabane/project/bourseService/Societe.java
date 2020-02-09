package com.chaabane.project.bourseService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Societe {

    @Id
    @GeneratedValue
    private long id;
    private String nomSociete;

    public Societe(long id, String nomSociete) {
        this.id = id;
        this.nomSociete = nomSociete;
    }

    public Societe(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public Societe() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    @Override
    public String toString() {
        return "Societe{" +
                "id=" + id +
                ", nomSociete='" + nomSociete + '\'' +
                '}';
    }
}

package dev.top.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Collegue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;
    private Integer score;
    private String photo;
    private String pseudo;
    private String email;
    private String prenom;

    public Collegue() {}

    public Collegue(String pseudo, String photo, Integer score) {
        this.pseudo = pseudo;
        this.photo = photo;
        this.score = score;
    }
    
    public Collegue(String nom, String prenom, String photo,String email) {
        this.pseudo = nom;
        this.prenom = prenom;
        this.email = email;
        this.photo = photo;
        this.score = 100;
    }

    /**
     * @return l'id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id l'id à modifier
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return le score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score le score à modifier
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return la photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo la photo à modifier
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return le pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo le pseudo à modifier
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }


    @Override
    public String toString() {
        return this.photo + "  "+ this.pseudo +" " +this.pseudo+ " "+ this.score;
    }

    /**
     * @return le prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom le prenom à modifier
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return l'email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email l'email à modifier
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
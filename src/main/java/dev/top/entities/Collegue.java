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

    public Collegue(Integer id, String pseudo,String photo,Integer score) {
        this.id = id;
        this.pseudo = pseudo;
        this.photo = photo;
        this.score = score;
    }
    
    public Collegue() {
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

}
package dev.top.entities;

public class NewCollegue {
    
    private String matricule;
    private String nom;
    private String photo;

    public NewCollegue(){
    }
    
    public NewCollegue(String matricule, String nom, String photo) {
    }

    /**
     * @return le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return le pseudo
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param pseudo le pseudo à modifier
     */
    public void setNom(String pseudo) {
        this.nom = pseudo;
    }

    /**
     * @return l'image
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param image l'image à modifier
     */
    public void setPhoto(String image) {
        this.photo = image;
    }

    
    @Override
    public String toString() {
       return "matricule =>"+ this.matricule +" pseudo =>" +this.nom +" image =>" +this.photo;
    }
}
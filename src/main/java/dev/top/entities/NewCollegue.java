package dev.top.entities;

public class NewCollegue {
    
    private String matricule;
    private String nom;
    private String photo;
    private String email;
    private String prenom;

    public NewCollegue(){
    }
    
    public NewCollegue(String matricule, String nom, String photo) {
    }

    public NewCollegue(String matricule, String nom, String photo, String prenom, String email) {
    }

    /**
     * @return le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule à modifier
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
       return "matricule : " + this.matricule + "\npseudo : " + this.nom + "\nimage : " + this.photo;
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
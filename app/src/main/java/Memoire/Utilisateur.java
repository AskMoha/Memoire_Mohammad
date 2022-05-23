package Memoire;

public class Utilisateur {
    private String Nom;
    private String Prenom;
    private String mail;
    private Panier panier;

    public Utilisateur(String nom, String prenom, String mail) {
        Nom = nom;
        Prenom = prenom;
        this.mail = mail;
        this.panier = new Panier();
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(double prix, int taille) {
        this.panier.setPrix(prix);
        this.panier.setTaille(taille);
    }
    public String toString()
    {
        return Nom + " "+ Prenom + " "+ mail +" " + panier.getPrix() + "€ " + panier.getTaille();
    }
}

package Memoire;

public class Panier {
    private double prix;
    private int taille;
    public Panier(double prix, int taille)
    {
        this.prix=prix;
        this.taille=taille;
    }
    public Panier ()
    {
        this.prix=0;
        this.taille=0;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}

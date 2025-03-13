package exo1;

public class Contact {
    private String nom;
    private String numero;

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Numéro: " + numero;
    }

}

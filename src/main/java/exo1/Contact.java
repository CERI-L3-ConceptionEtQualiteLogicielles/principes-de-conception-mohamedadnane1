package exo1;

public class Contact {
    private String nom;
    private String numero;
    private String format; // Permet de stocker le format actuel (TEXT, XML, JSON)

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        this.format = "TEXT"; // Format par défaut
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setFormat(String format) {
        this.format = format.toUpperCase();
    }

    public String getInfoContact() {
        switch (format) {
            case "XML":
                return "<contact>\n\t<nom>" + nom + "</nom>\n\t<numero>" + numero + "</numero>\n</contact>";
            case "JSON":
                return "{\n\t\"nom\": \"" + nom + "\",\n\t\"numero\": \"" + numero + "\"\n}";
            case "TEXT":
            default:
                return "Nom: " + nom + ", Numéro: " + numero;
        }
    }

    @Override
    public String toString() {
        return getInfoContact();
    }
}

package exo1;

import java.time.LocalDate;

public final class Contact {
    private final String nom;
    private final String numero;
    private final String prenom;
    private final String civilite;
    private final String adressePostale;
    private final String adresseMail;
    private final LocalDate dateAnniversaire;
    private final String lieuTravail;
    private final String ville;


    private Contact(ContactBuilder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.civilite = builder.civilite;
        this.adressePostale = builder.adressePostale;
        this.adresseMail = builder.adresseMail;
        this.dateAnniversaire = builder.dateAnniversaire;
        this.lieuTravail = builder.lieuTravail;
        this.ville = builder.ville;
    }

    public String getNom() {
        return nom; }
    public String getNumero() {
        return numero; }
    public String getPrenom() {
        return prenom; }
    public String getCivilite() {
        return civilite; }
    public String getAdressePostale() {
        return adressePostale; }
    public String getAdresseMail() {
        return adresseMail; }
    public LocalDate getDateAnniversaire() {
        return dateAnniversaire; }
    public String getLieuTravail() {
        return lieuTravail; }
    public String getVille() {
        return ville; }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", numero='" + numero + '\'' +
                ", prenom='" + prenom + '\'' +
                ", civilite='" + civilite + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ", dateAnniversaire=" + dateAnniversaire +
                ", lieuTravail='" + lieuTravail + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}

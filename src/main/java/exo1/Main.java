package exo1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact.ContactBuilder("Adnane", "2306183").build();
        System.out.println("Contact minimal :");
        System.out.println(contact1);


        Contact contact2 = new Contact.ContactBuilder("momo", "232323")
                .addPrenom("walid")
                .addCivilite("Monsieur")
                .addAdresseMail("adnane.momo@example.com")
                .addDateAnniversaire(LocalDate.of(1990, 5, 20))
                .addLieuTravail("cericar XYZ")
                .addVille("Paris")
                .build();

        System.out.println("\nContact complet :");
        System.out.println(contact2);
    }
}
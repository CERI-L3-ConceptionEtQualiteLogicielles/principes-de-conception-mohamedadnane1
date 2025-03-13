package exo1;

import java.awt.Image;

public class ServiceEnvoiPhoto {
    public void envoiPhoto(Contact contact, Image image) {
        System.out.println(" Photo envoyée à " + contact.getNom());
    }
}

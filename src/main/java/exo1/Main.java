package exo1;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {

        ServiceEnvoiPhoto servicePhoto = new ServiceEnvoiPhoto();


        EmailService emailService = new EmailService() {
            @Override
            public void envoiEmail(Contact contact, String message) {
                System.out.println("Email envoyé à " + contact.getNom() + " : " + message);
            }
        };


        ContactManager manager = new ContactManager(emailService, servicePhoto);


        Contact c1 = new Contact("Alice", "123456789");
        manager.ajouteContact(c1);


        Image photo = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        manager.envoyerPhoto(c1, photo);
    }
}

package exo1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private EmailService emailService;

    public ContactManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public void ajouteContact(Contact contact) {
        contacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void envoyerMessage(Contact contact, String message, boolean isSms) {
        if (isSms) {
            System.out.println("📱 SMS envoyé à " + contact.getNom() + " : " + message);
        } else {
            emailService.envoiEmail(contact, message);
        }
    }
}

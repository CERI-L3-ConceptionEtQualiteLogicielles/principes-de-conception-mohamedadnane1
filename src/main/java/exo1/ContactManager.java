package exo1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements ContactService, EmailService {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public void ajouteContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void supprimeContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void afficheContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void envoiEmail(Contact contact, String message) {
        System.out.println("Email envoyé à " + contact.getNom() + ": " + message);
    }
}

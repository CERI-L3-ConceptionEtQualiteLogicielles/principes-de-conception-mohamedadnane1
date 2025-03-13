package exo1;

public class Main {
    public static void main(String[] args) {
        // Utilisation d'une classe anonyme pour EmailService
        EmailService emailService = new EmailService() {
            @Override
            public void envoiEmail(Contact contact, String message) {
                System.out.println(" Email envoyé à " + contact.getNom() + " : " + message);
            }
        };

        ContactManager manager = new ContactManager(emailService);

        Contact c1 = new Contact("Alice", "123456789");
        Contact c2 = new Contact("Bob", "987654321");

        manager.ajouteContact(c1);
        manager.ajouteContact(c2);

        System.out.println(" Liste des contacts :");
        manager.afficheContacts();

        // Envoi d'un email
        manager.envoyerMessage(c1, "Bonjour Alice !", false);

        // Envoi d'un SMS
        manager.envoyerMessage(c2, "Salut Bob ", true);

        manager.supprimeContact(c1);
        System.out.println("Après suppression :");
        manager.afficheContacts();
    }
}

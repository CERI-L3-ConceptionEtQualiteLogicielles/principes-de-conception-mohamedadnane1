package exo1;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Alice", "123456789");

        System.out.println("Test des formats d'affffichage :");

        System.out.println("\nFormat Texte :");
        System.out.println(c1.getInfoContact());

        c1.setFormat("XML");
        System.out.println("\nFormat XML :");
        System.out.println(c1.getInfoContact());

        c1.setFormat("JSON");
        System.out.println("\nFormat JSON :");
        System.out.println(c1.getInfoContact());
    }
}

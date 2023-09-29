package personnages;

public class scenario {
    public static void main(String[] args) {
        // Création des personnages
        Gaulois obelix = new Gaulois("Obélix", 25);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Romain minus = new Romain("Minus", 6);
        Druide panoramix = new Druide("Panoramix", 5, 10);

        // Afficher les messages du druide Panoramix
        panoramix.parler("Je vais aller préparer une petite potion...");
        panoramix.preparerPotion();

        // Essayer de faire boire une potion à Obélix (qui ne devrait pas fonctionner)
        panoramix.booster(obelix);

        // Afficher les réactions d'Obélix
        obelix.parler("Par Bélénos, ce n'est pas juste!");

        // Faire boire une potion à Astérix
        panoramix.booster(asterix);

        // Astérix parle
        asterix.parler("Bonjour");

        // Minus parle
        minus.parler("UN GAU... UN GAUGAU...");

        // Astérix frappe Minus
        asterix.frapper(minus);

        // Afficher les états finaux des personnages
        System.out.println(obelix);
        System.out.println(asterix);
        System.out.println(minus);
        System.out.println(panoramix);
    }
}

/*
 * TP2_relation_1
 */
package tp2_relation_1;

public class TP2_relation_1 {
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles : ");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

       
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(une2008);

       
        reno.ajouter_voiture(uneMicra);
        reno.ajouter_voiture(uneAutreClio);

        System.out.println("\nVoitures de Bob : ");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println("\nVoitures de Reno : ");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}

/*
 * TP1_convertisseur
 */
package tp1_convertisseur.pkg_;
        import java.util.Scanner;
/**
 *
 * @author maxneau
 */
public class TP1_convertisseur_ {

    public static void main(String[] args) {        // Demander à l'utilisateur de saisir une valeur réelle
        try ( // Création du Scanner pour lire l'entrée utilisateur
                Scanner sc = new Scanner(System.in)) {
            // Demander à l'utilisateur de saisir une valeur réelle
            System.out.print("Veuillez saisir une valeur réelle : ");
            // Lire la valeur réelle et la stocker dans une variable de type double
            double valeur = sc.nextDouble();
            // Afficher la valeur saisie
            System.out.println("Vous avez saisi : " + valeur);
            // Fermeture du scanner
        }
    }
}

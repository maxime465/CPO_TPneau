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
            System.out.print("Veuillez indiquer un degres : ");
            double celsius = sc.nextDouble();
            double kelvin = celsius + 273.15;
            System.out.println("Vous avez saisi : " + kelvin);
        }
    }
}

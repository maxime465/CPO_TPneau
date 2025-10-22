/*
 * TP1_manipNombresInt_
 */
package tp1_manipnombresint_;

import java.util.Scanner;

/**
 *
 * @author maxneau
 */
public class TP1_manipNombresInt_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);

        // Demande et lecture du premier entier
        System.out.print("saisir entier1: ");
        int a = sc.nextInt();

        // Demande et lecture du deuxième entier
        System.out.print("saisir entier2 : ");
        int b = sc.nextInt();

        // Affichage des valeurs saisies
        System.out.println("Vous avez saisi : " + a + " et " + b);}
    
}

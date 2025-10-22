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
        System.out.println("Vous avez saisi : " + a + " et " + b);
         int somme = a + b;
        int difference = a - b;
        int produit = a * b;

     System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence (a - b) est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);}
    
}

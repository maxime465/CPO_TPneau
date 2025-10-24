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
        
     
        System.out.print("saisir entier1: ");
        int a = sc.nextInt();

       
        System.out.print("saisir entier2 : ");
        int b = sc.nextInt();


        System.out.println("Vous avez saisi : " + a + " et " + b);
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

     System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence (a - b) est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
    int quotient = a / b;
    int euclidienne = a % b;
    System.out.println("Le quotient est :" + quotient);
    System.out.println("la division euclidienne est : " + euclidienne);
    }
    
}

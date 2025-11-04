/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres;

/**
 *
 * @author maxneau
 */

public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

  
    public BouteilleBiere(String Unnom, double undegre , String unbar) {
        nom = Unnom;
        degreAlcool =  undegre;
        brasserie = unbar;
        ouverte = false;
}
     void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie);
        System.out.println("Ouverte : " + (ouverte ? "oui" : "non"));
        System.out.println("-----------------------------");
    }

    void Décapsuler() {
        if (ouverte) {
            ouverte = true ;
            System.out.println(nom + " est déjà ouverte.");
        } else {
            System.out.println(nom + " est fermé !");
                }
                  }
   
    
     }


   
    

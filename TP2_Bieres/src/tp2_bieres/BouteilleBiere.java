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
    // Attributs
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur avec paramètres
    public BouteilleBiere(String nom, double degreAlcool, String brasserie) {
        this.nom = nom;
        this.degreAlcool = degreAlcool;
        this.brasserie = brasserie;
        this.ouverte = false; // par défaut, la bière n'est pas ouverte
    }

    // Méthode pour lire l'étiquette
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie);
        System.out.println("Ouverte : " + (ouverte ? "oui" : "non"));
        System.out.println("-----------------------------");
    }

    // Méthode pour ouvrir la bouteille
    public void ouvrir() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " est maintenant ouverte !");
        } else {
            System.out.println(nom + " est déjà ouverte.");
        }
    }
}

   
    

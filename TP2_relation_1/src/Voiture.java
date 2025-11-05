/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp2_relation_1;

public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire; 

    public Voiture(String modele, String marque, int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null; 
    }

    @Override
    public String toString() {
        return modele + " " + marque + " (" + puissance + " CV)";
    }
}

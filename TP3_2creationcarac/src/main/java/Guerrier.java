/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Personnages;

import Armes.Arme; 

public class Guerrier extends Personnage {
    private Arme arme;

    public Guerrier(String nom, int niveauVie, Arme arme) {
        super(nom, niveauVie);
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    @Override
    public String toString() {
        return "Guerrier : " + super.toString() + ", Arme : " + arme;
    }
}

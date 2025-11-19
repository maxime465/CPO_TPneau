/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Personnages;

import Armes.Arme;

public class Magicien extends Personnage {
    private Arme arme;

    public Magicien(String nom, int niveauVie, Arme arme) {
        super(nom, niveauVie);
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    @Override
    public String toString() {
        return "Magicien : " + super.toString() + ", Arme : " + arme;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp3_2creationcarac;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;

public class TP3_2creationcarac {
    public static void main(String[] args) {

   
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);


        Guerrier g1 = new Guerrier("Arthur", 100, excalibur);
        Guerrier g2 = new Guerrier("Lancelot", 90, durandal);
        Magicien m1 = new Magicien("Merlin", 80, chene);
        Magicien m2 = new Magicien("Morgane", 70, charme);

       
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(g1);
        personnages.add(g2);
        personnages.add(m1);
        personnages.add(m2);

        
        for (Personnage p : personnages) {
            System.out.println(p);
        }
    }
}

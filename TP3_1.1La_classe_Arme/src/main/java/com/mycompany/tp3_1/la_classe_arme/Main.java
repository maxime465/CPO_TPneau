package com.mycompany.tp3_1.la_classe_arme; // Package requis par la commande Maven

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

       for (Arme a : armes) {
            System.out.println(a);
        }
        }
    }

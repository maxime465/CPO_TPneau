package com.mycompany.tp3_1.la_classe_arme; // Package requis par la commande Maven

import Armes.Baton;
import Armes.Epee;

public class tp3_1.la_classe_arme {
    
    public static void main(String[] args) {
        Epee monEpee = new Epee("Excalibur", 90, 30);
        Baton monBaton = new Baton("Baton Magique", 70, 10);
        System.out.println(monEpee);
        System.out.println(monBaton);
    }
}





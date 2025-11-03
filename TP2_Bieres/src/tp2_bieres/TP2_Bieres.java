/*
 * TP2_Bieres
 */
package tp2_bieres;

/**
 *
 * @author maxneau
 */
public class TP2_Bieres {
  
   public class TP2_Bieres_NOM1_NOM2 {
    public static void main(String[] args) {
        // Création de la première bière
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        // Création de la deuxième bière
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxiemeBiere.lireEtiquette();

        // Tester l'ouverture d'une bière
        uneBiere.ouvrir();
        uneBiere.lireEtiquette();

        deuxiemeBiere.ouvrir();
        deuxiemeBiere.lireEtiquette();
    }
}
 }


    
    
    
    
    
    


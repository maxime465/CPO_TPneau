/*
 * TP2_Bieres
 */
package tp2_bieres;

/**
 *
 * @author maxneau
 */
public class TP2_Bieres {
  
    public static void main(String[] args) {
       
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxiemeBiere.lireEtiquette();
        uneBiere.Décapsuler();
        uneBiere.lireEtiquette();

        deuxiemeBiere.Décapsuler();
        deuxiemeBiere.lireEtiquette();
    }
}
 


    
    
    
    
    
    


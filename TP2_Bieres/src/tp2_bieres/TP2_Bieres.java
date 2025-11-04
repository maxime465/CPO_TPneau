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
       
        BouteilleBiere premiereBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("heineken", 5.7, "chamama");
        BouteilleBiere quatrièmeBiere = new BouteilleBiere("1664", 4.9, "bourget");
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("8.6", 8.6, "neau");
        premiereBiere.Décapsuler();
        premiereBiere.lireEtiquette();

        deuxiemeBiere.Décapsuler();
        deuxiemeBiere.lireEtiquette();
        
       troisiemeBiere.Décapsuler();
       troisiemeBiere.lireEtiquette();
       
       quatrièmeBiere.Décapsuler();
       quatrièmeBiere.lireEtiquette();
       
       cinquiemeBiere.Décapsuler();
       cinquiemeBiere.lireEtiquette();
       
    
    }
}
 


    
    
    
    
    
    


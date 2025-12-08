/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxneau
 */
import java.util.Random;
public class CadenasGame {

    private final String secret;    
    private int nbEssais;          

    
    public static class Resultat {
        public int exact;
        public int haut;
        public int bas;

        public Resultat(int exact, int haut, int bas) {
            this.exact = exact;
            this.haut = haut;
            this.bas = bas;
        }
    }

   
    public CadenasGame() {
        this.secret = genererCode();
        this.nbEssais = 0;
    }

    
    private String genererCode() {
        StringBuilder sb = new StringBuilder();
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 4; i++) {
            sb.append(r.nextInt(10)); // 0 à 9
        }
        return sb.toString();
    }

    
    public Resultat evaluer(String essai) {
        nbEssais++;

        int exact = 0;
        int haut = 0;
        int bas = 0;

        for (int i = 0; i < 4; i++) {
            int e = Character.getNumericValue(essai.charAt(i));
            int s = Character.getNumericValue(secret.charAt(i));

            if (e == s) {
                exact++;
            } else if (e > s) {
                haut++;
            } else {
                bas++;
            }
        }

        return new Resultat(exact, haut, bas);
    }

    
    public boolean estGagne(Resultat r) {
        return r.exact == 4;
    }

   
    public int getNbEssais() {
        return nbEssais;
    }
 public String getSecret() {
        return secret;
    }
    public void reset() {
        nbEssais = 0;
    }}
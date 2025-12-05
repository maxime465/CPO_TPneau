/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxneau
 */
import java.util.Random;

/**
 * Classe métier pour le mini-projet Cadenas
 */
public class CadenasGame {

    private int[] secret;      // Code secret à deviner
    private int nbEssais;      // Nombre d'essais effectués
    private final int maxEssais = 5;  // Maximum d'essais

    /**
     * Constructeur : génère un nouveau code secret
     */
    public CadenasGame() {
        genererSecret();
    }

    /**
     * Génère un code secret aléatoire de 4 chiffres (0 à 9)
     */
    public void genererSecret() {
        secret = new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            secret[i] = rand.nextInt(10);
        }
        nbEssais = 0;
    }

    /**
     * Évalue un essai donné
     * @param essai : chaîne de 4 chiffres
     * @return Resultat avec nombre exact, trop haut et trop bas
     */
    public Resultat evaluer(String essai) {
        if (essai == null || essai.length() != 4) {
            throw new IllegalArgumentException("L'essai doit contenir 4 chiffres.");
        }

        int exact = 0;
        int haut = 0;
        int bas = 0;

        for (int i = 0; i < 4; i++) {
            int d = Character.getNumericValue(essai.charAt(i));
            if (d == secret[i]) {
                exact++;
            } else if (d > secret[i]) {
                haut++;
            } else {
                bas++;
            }
        }

        nbEssais++;
        return new Resultat(exact, haut, bas);
    }

    /**
     * Vérifie si le joueur a trouvé le code
     * @param r : résultat de l'essai
     * @return true si 4 chiffres exacts
     */
    public boolean estGagne(Resultat r) {
        return r.exact == 4;
    }

    /** Retourne le nombre d'essais effectués */
    public int getNbEssais() {
        return nbEssais;
    }

    /** Retourne le code secret sous forme de chaîne */
    public String getSecret() {
        StringBuilder sb = new StringBuilder();
        for (int v : secret) {
            sb.append(v);
        }
        return sb.toString();
    }

    /** Classe interne pour stocker le résultat d'un essai */
    public static class Resultat {
        public final int exact;
        public final int haut;
        public final int bas;

        public Resultat(int exact, int haut, int bas) {
            this.exact = exact;
            this.haut = haut;
            this.bas = bas;
        }

        @Override
        public String toString() {
            return "Exact: " + exact + " | Trop hauts: " + haut + " | Trop bas: " + bas;
        }
    }
}

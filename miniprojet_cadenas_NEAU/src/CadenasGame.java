/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxneau
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CadenasGame {

    private int[] secret = new int[4];
    private int nbEssais;
    private int maxEssais = 5;
    private List<String> historique = new ArrayList<>();

    public CadenasGame() {
        genererSecret();
    }

    public void genererSecret() {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            secret[i] = r.nextInt(10);
        }
        nbEssais = 0;
        historique.clear();
    }

    public Resultat evaluer(String essai) {
        int exact = 0, haut = 0, bas = 0;

        for (int i = 0; i < 4; i++) {
            int d = Character.getNumericValue(essai.charAt(i));
            if (d == secret[i]) exact++;
            else if (d > secret[i]) haut++;
            else bas++;
        }

        nbEssais++;
        Resultat res = new Resultat(exact, haut, bas);
        historique.add(essai + " -> " + res.toString());
        return res;
    }

    public boolean estGagne(Resultat r) {
        return r.exact == 4;
    }

    public int getNbEssais() { return nbEssais; }

    public String getSecret() {
        String s = "";
        for (int v : secret) s += v;
        return s;
    }

    public static class Resultat {
        public int exact, haut, bas;
        public Resultat(int e, int h, int b) {
            exact = e; haut = h; bas = b;
        }
        @Override
        public String toString() {
            return "exact=" + exact + " haut=" + haut + " bas=" + bas;
        }
    }
}

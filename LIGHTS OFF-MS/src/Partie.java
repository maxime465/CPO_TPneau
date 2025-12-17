import java.util.Random;

public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
        initialiserPartie();
    }

    private void initialiserPartie() {
        nbCoups = 0;
        grille.eteindreToutesLesCellules();

        Random rand = new Random();
        int nbLignes = grille.matriceCellules.length;
        int nbColonnes = grille.matriceCellules[0].length;

        // Générer une grille aléatoire
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (rand.nextBoolean()) { // 50% de chance que la cellule soit allumée
                    grille.matriceCellules[i][j].activerCellule();
                }
            }
        }
    }

    public GrilleDeJeu getGrille() {
        return grille;
    }

    public int getNbCoups() {
        return nbCoups;
    }

    public void incrementerCoups() {
        nbCoups++;
    }

    public boolean estGagne() {
        return grille.cellulesToutesEteintes();
    }
}

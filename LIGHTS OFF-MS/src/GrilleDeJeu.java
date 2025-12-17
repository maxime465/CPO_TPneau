public class GrilleDeJeu {

    public CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int lignes, int colonnes) {
        nbLignes = lignes;
        nbColonnes = colonnes;
        matriceCellules = new CelluleLumineuse[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++)
            for (int j = 0; j < nbColonnes; j++)
                matriceCellules[i][j].eteindreCellule();
    }

    public void activerLigneDeCellules(int ligne) {
        for (int j = 0; j < nbColonnes; j++)
            matriceCellules[ligne][j].activerCellule();
    }

    public void activerColonneDeCellules(int colonne) {
        for (int i = 0; i < nbLignes; i++)
            matriceCellules[i][colonne].activerCellule();
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++)
            matriceCellules[i][i].activerCellule();
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++)
            matriceCellules[nbLignes - 1 - i][i].activerCellule();
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++)
            for (int j = 0; j < nbColonnes; j++)
                if (!matriceCellules[i][j].estEteint())
                    return false;
        return true;
    }
}


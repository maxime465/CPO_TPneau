public class CelluleLumineuse {

    private boolean etat;

    public CelluleLumineuse() {
        this.etat = false; 
    }

    public void activerCellule() {
        etat = !etat;
    }

    public void eteindreCellule() {
        etat = false;
    }

    public boolean estEteint() {
        return !etat;
    }

    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}

